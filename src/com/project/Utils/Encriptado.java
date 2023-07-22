/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.project.Utils;

import java.security.SecureRandom;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.PBEKeySpec;
import javax.crypto.spec.SecretKeySpec;

public class Encriptado {

    private static final String ALGORITMO_ENCRIPTACION = "AES/CBC/PKCS5Padding";
    private static final int ITERACIONES_PBKDF2 = 10000;
    private static final int LONGITUD_CLAVE = 256;
    private static final int LONGITUD_SAL = 16;

    public static byte[] encriptar(String textoPlano, String contraseña) {
        try {
            byte[] salt = generarSalAleatoria();
            SecretKey clave = generarClave(contraseña, salt);
            Cipher cipher = Cipher.getInstance(ALGORITMO_ENCRIPTACION);
            IvParameterSpec ivParamSpec = new IvParameterSpec(generarVectorInicial());
            cipher.init(Cipher.ENCRYPT_MODE, clave, ivParamSpec);
            byte[] textoEncriptado = cipher.doFinal(textoPlano.getBytes("UTF-8"));
            byte[] textoEncriptadoConSal = new byte[salt.length + textoEncriptado.length];
            System.arraycopy(salt, 0, textoEncriptadoConSal, 0, salt.length);
            System.arraycopy(textoEncriptado, 0, textoEncriptadoConSal, salt.length, textoEncriptado.length);
            return textoEncriptadoConSal;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public static String desencriptar(byte[] textoEncriptadoConSal, String contraseña) {
        try {
            byte[] salt = new byte[LONGITUD_SAL];
            byte[] textoEncriptado = new byte[textoEncriptadoConSal.length - LONGITUD_SAL];
            System.arraycopy(textoEncriptadoConSal, 0, salt, 0, LONGITUD_SAL);
            System.arraycopy(textoEncriptadoConSal, LONGITUD_SAL, textoEncriptado, 0, textoEncriptado.length);
            SecretKey clave = generarClave(contraseña, salt);
            Cipher cipher = Cipher.getInstance(ALGORITMO_ENCRIPTACION);
            IvParameterSpec ivParamSpec = new IvParameterSpec(generarVectorInicial());
            cipher.init(Cipher.DECRYPT_MODE, clave, ivParamSpec);
            byte[] textoDesencriptado = cipher.doFinal(textoEncriptado);
            return new String(textoDesencriptado, "UTF-8");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    private static SecretKey generarClave(String contraseña, byte[] salt) throws Exception {
        SecretKeyFactory factory = SecretKeyFactory.getInstance("PBKDF2WithHmacSHA256");
        PBEKeySpec spec = new PBEKeySpec(contraseña.toCharArray(), salt, ITERACIONES_PBKDF2, LONGITUD_CLAVE);
        SecretKey claveTmp = factory.generateSecret(spec);
        return new SecretKeySpec(claveTmp.getEncoded(), "AES");
    }

    private static byte[] generarSalAleatoria() {
        SecureRandom random = new SecureRandom();
        byte[] salt = new byte[LONGITUD_SAL];
        random.nextBytes(salt);
        return salt;
    }

    private static byte[] generarVectorInicial() {
        SecureRandom random = new SecureRandom();
        byte[] iv = new byte[16];
        random.nextBytes(iv);
        return iv;
    }
//
//    public static void main(String[] args) {
//        String textoPlano = "admin";
//        String contraseña = "clave_secreta";
//
//        byte[] textoEncriptado = encriptar(textoPlano, contraseña);
//        System.out.println("Texto encriptado: " + Base64.getEncoder().encodeToString(textoEncriptado));
//
//        String textoDesencriptado = desencriptar(textoEncriptado, contraseña);
//        System.out.println("Texto desencriptado: " + textoDesencriptado);
//    }

}
