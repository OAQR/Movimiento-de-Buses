/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.project.Utils;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import javax.sound.sampled.AudioFileFormat;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

/**
 *
 * @author gonpa
 */
public class Audio {

//    public static void main(String[] args) {
//        // Llamadas a los métodos según sea necesario
//        obtenerRutaAudio("com/project/Sound/InicioSesion.wav");
//        convertirMP3aWAV("ruta/al/archivo.mp3", "ruta/convertido.wav");
//    }
//    
    public static void convertirMP3aWAV(String mp3FilePath, String wavFilePath) {
        try {
            // Leer el archivo MP3 como arreglo de bytes
            byte[] mp3Data = Files.readAllBytes(Paths.get(mp3FilePath));

            // Obtener el formato deseado para el archivo WAV
            AudioFormat wavAudioFormat = new AudioFormat(AudioFormat.Encoding.PCM_SIGNED, 44100, 16, 2, 4, 44100, false);

            // Convertir el archivo de MP3 a WAV
            byte[] wavData = getAudioDataBytes(mp3Data, wavAudioFormat);

            // Guardar el archivo WAV convertido
            Path wavPath = Paths.get(wavFilePath);
            Files.write(wavPath, wavData);
            System.out.println("Archivo convertido guardado en: " + wavFilePath);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (UnsupportedAudioFileException e) {
            e.printStackTrace();
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static byte [] getAudioDataBytes(byte [] sourceBytes, AudioFormat audioFormat) throws UnsupportedAudioFileException, IllegalArgumentException, Exception{
        if(sourceBytes == null || sourceBytes.length == 0 || audioFormat == null){
            throw new IllegalArgumentException("Illegal Argument passed to this method");
        }

        ByteArrayInputStream bais = null;
        ByteArrayOutputStream baos = null;
        AudioInputStream sourceAIS = null;
        AudioInputStream convert1AIS = null;
        AudioInputStream convert2AIS = null;

        try{
            bais = new ByteArrayInputStream(sourceBytes);
            sourceAIS = AudioSystem.getAudioInputStream(bais);
            AudioFormat sourceFormat = sourceAIS.getFormat();
            AudioFormat convertFormat = new AudioFormat(AudioFormat.Encoding.PCM_SIGNED, sourceFormat.getSampleRate(), 16, sourceFormat.getChannels(), sourceFormat.getChannels()*2, sourceFormat.getSampleRate(), false);
            convert1AIS = AudioSystem.getAudioInputStream(convertFormat, sourceAIS);
            convert2AIS = AudioSystem.getAudioInputStream(audioFormat, convert1AIS);

            baos = new ByteArrayOutputStream();

            byte [] buffer = new byte[8192];
            while(true){
                int readCount = convert2AIS.read(buffer, 0, buffer.length);
                if(readCount == -1){
                    break;
                }
                baos.write(buffer, 0, readCount);
            }
            return baos.toByteArray();
        } catch(UnsupportedAudioFileException uafe){
            //uafe.printStackTrace();
            throw uafe;
        } catch(IOException ioe){
            //ioe.printStackTrace();
            throw ioe;
        } catch(IllegalArgumentException iae){
            //iae.printStackTrace();
            throw iae;
        } catch (Exception e) {
            //e.printStackTrace();
            throw e;
        }finally{
            if(baos != null){
                try{
                    baos.close();
                }catch(Exception e){
                }
            }
            if(convert2AIS != null){
                try{
                    convert2AIS.close();
                }catch(Exception e){
                }
            }
            if(convert1AIS != null){
                try{
                    convert1AIS.close();
                }catch(Exception e){
                }
            }
            if(sourceAIS != null){
                try{
                    sourceAIS.close();
                }catch(Exception e){
                }
            }
            if(bais != null){
                try{
                    bais.close();
                }catch(Exception e){
                }
            }
        }
    }
    
    public static void obtenerRutaAudio(String relativePath) {
        URL soundFileURL = Audio.class.getClassLoader().getResource(relativePath);
        if (soundFileURL != null) {
            String soundFilePath = soundFileURL.getPath();
            File soundFile = new File(soundFilePath);
            if (soundFile.exists()) {
                System.out.println("Ruta del archivo de sonido: " + soundFilePath);
                comprobarAccesibilidadAudio(soundFilePath);
            } else {
                System.out.println("El archivo de sonido no existe en la ruta especificada.");
            }
        } else {
            System.out.println("No se pudo encontrar la ruta del archivo de sonido.");
        }
    }

    public static void comprobarAccesibilidadAudio(String soundFilePath) {
        File soundFile = new File(soundFilePath);
        if (soundFile.isHidden() || !soundFile.canRead()) {
            System.out.println("El archivo no es accesible.");
        } else {
            System.out.println("El archivo es accesible.");
            compatibilidadAudio(soundFilePath);
        }
    }

    public static void compatibilidadAudio(String soundFilePath) {
        try {
            AudioFileFormat.Type[] supportedTypes = AudioSystem.getAudioFileTypes();
            boolean isSupported = false;
            for (AudioFileFormat.Type fileType : supportedTypes) {
                try {
                    File soundFile = new File(soundFilePath);
                    if (AudioSystem.isFileTypeSupported(fileType, AudioSystem.getAudioInputStream(soundFile))) {
                        isSupported = true;
                        break;
                    }
                } catch (UnsupportedAudioFileException e) {
                    e.printStackTrace();
                }
            }
            if (isSupported) {
                System.out.println("El archivo es compatible con Java Sound.");
                reproducirAudio(soundFilePath);
            } else {
                System.out.println("El archivo no es compatible con Java Sound.");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void reproducirAudio(String soundFilePath) {
        try {
            File soundFile = new File(soundFilePath);
            Clip clip = AudioSystem.getClip();
            clip.open(AudioSystem.getAudioInputStream(soundFile));
            clip.start();
            Thread.sleep(100);
            clip.close();
        } catch (IOException | UnsupportedAudioFileException | LineUnavailableException | InterruptedException e) {
            e.printStackTrace();
        }
    }

    
}
