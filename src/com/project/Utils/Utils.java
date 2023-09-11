/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.project.Utils;

import com.project.MySQL.conexion;
import static java.awt.Frame.MAXIMIZED_BOTH;
import static java.awt.Frame.NORMAL;
import java.awt.*;
import java.awt.event.*;
import java.awt.print.*;
import java.lang.reflect.Field;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import javax.swing.*;
import org.apache.logging.log4j.*;

/**
 * Clase que contiene los metodos que se repiten en multiples clases.
 * @author Oscar Quispe Rivas
 */
public class Utils {

    private static final Logger logger = LogManager.getLogger(Utils.class);
    public static boolean[] dataBase = new boolean[1];;

    /**
     * Almacena las coordenadas del mouse en el array mousePosition al presionar
     * la barra de títulos de la ventana.
     *
     * @param mousePosition el array que almacenará las coordenadas del mouse
     * @param evt el evento de mousePressed que contiene información sobre la
     * posición del mouse
     * @throws NullPointerException si mousePosition es nulo
     */
    public static void handlePressedBarraDeTitulos(int[] mousePosition, java.awt.event.MouseEvent evt) {
        if (mousePosition == null) {
            logger.error("Ocurrió una excepción en el método handlePressedBarraDeTitulos: 'mousePosition' no puede ser nulo.");
            throw new NullPointerException("'mousePosition' no puede ser nulo.");
        }
        mousePosition[0] = evt.getX();
        mousePosition[1] = evt.getY();
    }

    /**
     * Mueve el JFrame según la posición del mouse al arrastrar la barra de
     * títulos.
     *
     * @param jframe el JFrame que se va a mover
     * @param mousePosition el array que almacena las coordenadas iniciales del
     * mouse
     * @param evt el evento de mouseDragged que contiene las coordenadas
     * actuales del mouse
     */
    public static void handleDraggedBarraDeTitulos(JFrame jframe, int[] mousePosition, java.awt.event.MouseEvent evt) {
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        jframe.setLocation(x - mousePosition[0], y - mousePosition[1]);
    }

    /**
     * Resalta el JLabel en la barra de títulos cuando el mouse entra en él,
     * cambiando el fondo y el color de la letra.
     *
     * @param jlbl El JLabel que se desea resaltar.
     */
    public static void resaltarSubtitulos(JLabel jlbl) {
        jlbl.setForeground(new Color(200, 200, 200));
        jlbl.setOpaque(true);
        jlbl.setBackground(new Color(61, 61, 61));
    }

    /**
     * Restaura el JLabel en la barra de títulos a su estado original cuando el
     * mouse sale de él, restaurando el fondo y el color de la letra.
     *
     * @param jlbl El JLabel que se desea restaurar.
     */
    public static void restaurarSubtitulos(JLabel jlbl) {
        jlbl.setForeground(new Color(134, 134, 134));
        jlbl.setBackground(new Color(51, 51, 51));
    }

    /**
     * Resalta el JLabel del botón Salir cuando el mouse entra en él, cambiando
     * el color de la letra y el fondo.
     *
     * @param jlbl El JLabel del botón Salir que se desea resaltar.
     */
    public static void resaltarBotonSalir(JLabel jlbl) {
        jlbl.setForeground(new Color(255, 255, 255));
        jlbl.setOpaque(true);
        jlbl.setBackground(new Color(255, 51, 0));
    }

    /**
     * Restaura el JLabel del botón Salir a su estado original cuando el mouse
     * sale de él, restaurando el color de la letra y el fondo.
     *
     * @param jlbl El JLabel del botón Salir que se desea restaurar.
     */
    public static void restaurarBotonSalir(JLabel jlbl) {
        jlbl.setForeground(new Color(255, 51, 0));
        jlbl.setBackground(new Color(51, 51, 51));
    }

    /**
     * Cierra la conexión con la base de datos y sale del programa. Si ocurre
     * una excepción durante el cierre de la conexión, se registra en el sistema
     * de logs.
     */
    public static void clickedExit() {
        if (dataBase[0]) {
            try {
            conexion.getInstance().CerrarConnexion();
        } catch (SQLException ex) {
            logger.error("Error al cerrar la conexión: ", ex);
        }
        }
        System.exit(0);
    }

    /**
     * Cambia el color de fondo y de texto del panel y el JLabel cuando el mouse entra en ellos.
     *
     * @param jpnl  el panel que se va a modificar
     * @param jlbl  el JLabel que se va a modificar
     */
    public static void enteredMaximizar_Minimizar(JPanel jpnl, JLabel jlbl) {
        jpnl.setOpaque(true);
        jpnl.setBackground(new Color(61, 61, 61));
        jlbl.setForeground(new Color(255, 255, 255));
    }
    
    /**
     * Restaura el color de fondo y de texto del panel y el JLabel cuando el mouse sale de ellos.
     *
     * @param jpnl  el panel que se va a restaurar
     * @param jlbl  el JLabel que se va a restaurar
     */
    public static void exitedMaximizar_Minimizar(JPanel jpnl, JLabel jlbl) {
        jlbl.setForeground(new Color(0, 0, 0));
        jpnl.setOpaque(false);
    }
    
    /**
     * Maximiza o restaura la ventana dependiendo del valor del parámetro 'maximizar'.
     *
     * @param jframe      el JFrame que se va a maximizar o restaurar
     * @param maximizar   un booleano que indica si la ventana ya está maximizada o no
     * @return true si la ventana se restauró a su tamaño normal, false si se maximizó
     */
    public static boolean clickedMaximizar(JFrame jframe, Boolean maximizar) {
        if (maximizar) {
            jframe.setExtendedState(MAXIMIZED_BOTH);
            return false;
        } else {
            jframe.setExtendedState(NORMAL);
            return true;
        }
    }

    public static void placeholder(JTextField jtxt, String placeholder, boolean enfoque) {
        if (enfoque) {
            if (jtxt.getText().equals(placeholder)) {
                jtxt.setText("");
            }
        } else if (jtxt.getText().isEmpty()) {
            jtxt.setText(placeholder);
        }
        jtxt.setForeground(new Color(102, 102, 102));
    }

    public static void placeholder(JPasswordField jpsw, char[] placeholder, boolean enfoque) {
        if (enfoque) {
            if (Arrays.equals(jpsw.getPassword(), placeholder)) {
                jpsw.setText("");
                jpsw.setEchoChar('\u2022');
                jpsw.setForeground(new Color(153, 153, 153));
            } else {
                jpsw.setForeground(new Color(153, 153, 153));
            }
        } else if (Arrays.equals(jpsw.getPassword(), new char[0])) {
            jpsw.setText(String.valueOf(placeholder));
            jpsw.setEchoChar('\u0000');
            jpsw.setForeground(new Color(102, 102, 102));
        }
    }

    public static boolean validarCamposInicioSesion(String[] campos, String[] text, JFrame instance, boolean modoOscuro) {
        boolean camposValidos = true;

        for (int i = 0; i < campos.length; i++) {
            JSeparator jsep = (JSeparator) getJComponent(instance, "jsep" + campos[i]);
            JLabel jlbl = (JLabel) getJComponent(instance, "jlbl" + campos[i]);

            if (i == campos.length - 1) {

                JPasswordField jpsw = (JPasswordField) getJComponent(instance, "jpsw" + campos[campos.length - 1]);
                char[] password1 = jpsw.getPassword();
                if (password1.length == 0 || Arrays.equals(password1, "Ingrese su contraseña".toCharArray())) {
                    resaltarCampoInvalido(jpsw, jsep, jlbl, null, modoOscuro);
                    camposValidos = false;
                }
                Arrays.fill(password1, '\0');
            } else if (i < campos.length - 1) {
                JTextField jtxt = (JTextField) getJComponent(instance, "jtxt" + campos[i]);

                if (jtxt.getText().isEmpty() || jtxt.getText().equals("Ingrese su " + text[i])) {
                    resaltarCampoInvalido(jtxt, jsep, jlbl, null, modoOscuro);
                    camposValidos = false;
                } else {
                    try {
                        validarCampo(jtxt.getText(), text[i], null);
                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, e.getMessage(), "Advertencia", JOptionPane.WARNING_MESSAGE);
                        resaltarCampoInvalido(jtxt, jsep, jlbl, null, modoOscuro);
                        camposValidos = false;
                    }
                }
            }
        }
        return camposValidos;
    }

    public static String generarID(String persona, String consulta) throws SQLException {
        String id = "";
        int contador;
        
        if (Utils.dataBase[0]) contador = conexion.contador(consulta);
        else contador = 2;
        
        contador++;
        if (contador <= 9) {
            id = persona + "00000" + contador;
        } else {
            if (contador <= 99) {
                id = persona + "0000" + contador;
            } else {
                if (contador <= 999) {
                    id = persona + "000" + contador;
                } else {
                    if (contador <= 9999) {
                        id = persona + "00" + contador;
                    } else {
                        if (contador <= 99999) {
                            id = persona + "0" + contador;
                        } else {
                            if (contador <= 999999) {
                                id = persona + contador;
                            }
                        }
                    }
                }
            }
        }
        return id;
    }

    /**
     * Valida los campos de un formulario del tipo "conductor". Realiza la
     * validación de cada campo y muestra los errores correspondientes.
     *
     * @param campos Arreglo de nombres de los campos del formulario.
     * @param text Arreglo que contiene una parte del texto por defecto para
     * cada campo del formulario.
     * @param instance Instancia del JFrame que contiene los componentes del
     * formulario.
     * @param modoOscuro Indica si el modo oscuro está activado.
     * @return true si todos los campos son válidos, false en caso contrario.
     */
    public static boolean validarCamposConductor(String[] campos, String[] text, JFrame instance, boolean modoOscuro) {
        boolean camposValidos = true;
        for (int i = 0; i < campos.length; i++) {
            JSeparator jsep = (JSeparator) getJComponent(instance, "jsep" + campos[i]);
            JLabel jlbl = (JLabel) getJComponent(instance, "jlbl" + campos[i]);
            JLabel jlblo = (JLabel) getJComponent(instance, "jlbl" + campos[i] + "Obligatorio");

            if (i == campos.length - 1) {
                // Validación de contraseñas
                JPasswordField jpsw1 = (JPasswordField) getJComponent(instance, "jpsw" + campos[campos.length - 2]);
                JPasswordField jpsw2 = (JPasswordField) getJComponent(instance, "jpsw" + campos[campos.length - 1]);
                JSeparator jsep1 = (JSeparator) getJComponent(instance, "jsep" + campos[campos.length - 2]);
                JLabel jlbl1 = (JLabel) getJComponent(instance, "jlbl" + campos[campos.length - 2]);
                JLabel jlblo1 = (JLabel) getJComponent(instance, "jlbl" + campos[campos.length - 2] + "Obligatorio");

                char[] password1 = jpsw1.getPassword();
                char[] password2 = jpsw2.getPassword();
                if (password1.length == 0 || Arrays.equals(password1, "Ingrese su contraseña".toCharArray())) {
                    resaltarCampoInvalido(jpsw1, jsep1, jlbl1, jlblo1, modoOscuro);
                    camposValidos = false;
                } else {
                    try {
                        validarCampo(null, "Contraseña", password1);
                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, e.getMessage(), "Advertencia", JOptionPane.WARNING_MESSAGE);
                        resaltarCampoInvalido(jpsw1, jsep1, jlbl1, jlblo1, modoOscuro);
                        camposValidos = false;
                    }
                }

                if (password2.length == 0 || Arrays.equals(password2, "Reingrese su contraseña".toCharArray())) {
                    resaltarCampoInvalido(jpsw2, jsep, jlbl, jlblo, modoOscuro);
                    camposValidos = false;
                } else if (camposValidos && !Arrays.equals(password1, password2)) {
                    JOptionPane.showMessageDialog(null, "Las contraseñas no son iguales", "Advertencia", JOptionPane.WARNING_MESSAGE);
                    resaltarCampoInvalido(jpsw1, jsep1, jlbl1, jlblo1, modoOscuro);
                    resaltarCampoInvalido(jpsw2, jsep, jlbl, jlblo, modoOscuro);
                    camposValidos = false;
                }

                // Limpia los arreglos de contraseñas
                Arrays.fill(password1, '\0');
                Arrays.fill(password2, '\0');

            } else if (i < campos.length - 2) {
                // Validación de campos de texto
                JTextField jtxt = (JTextField) getJComponent(instance, "jtxt" + campos[i]);

                if (jtxt.getText().isEmpty() || jtxt.getText().equals("Ingrese su " + text[i])) {
                    resaltarCampoInvalido(jtxt, jsep, jlbl, jlblo, modoOscuro);
                    camposValidos = false;
                } else {
                    try {
                        validarCampo(jtxt.getText(), text[i], null);
                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, e.getMessage(), "Advertencia", JOptionPane.WARNING_MESSAGE);
                        resaltarCampoInvalido(jtxt, jsep, jlbl, jlblo, modoOscuro);
                        camposValidos = false;
                    }
                }
            }
        }
        return camposValidos;
    }

    /**
     * Obtiene un JComponent de un JFrame mediante el uso de reflexión.
     *
     * @param instance Instancia del JFrame.
     * @param campo Nombre del JComponent que se desea obtener.
     * @return El JComponent correspondiente al campo especificado, o null si no
     * se encuentra el componente.
     */
    private static JComponent getJComponent(JFrame instance, String campo) {
        try {
            Field jcomponent = instance.getClass().getDeclaredField(campo);
            jcomponent.setAccessible(true);
            return (JComponent) jcomponent.get(instance);
        } catch (NoSuchFieldException ex) {
            logger.error("No se encontró el campo especificado: {}", campo, ex);
        } catch (IllegalAccessException ex) {
            logger.error("Acceso ilegal al campo: {}", campo, ex);
        } catch (IllegalArgumentException ex) {
            logger.error("Argumento ilegal al acceder al campo: {}", campo, ex);
        }

        return null;
    }

    /**
     * Resalta el campo con errores de un formulario, cambiando el color y
     * aplicando un efecto visual. Los campos con errores pueden ser campos
     * obligatorios vacíos o campos que contengan datos incorrectos, como
     * números en un campo de nombre, letras en un campo numérico, etc.
     *
     * @param jcomp Componente de texto que se debe resaltar.
     * @param jsep Separador asociado al componente de texto.
     * @param jlbl Etiqueta asociada al componente de texto.
     * @param jlblo Etiqueta que indica que el campo es obligatorio.
     * @param modoOscuro Indica si el modo oscuro está activado.
     */
    private static void resaltarCampoInvalido(javax.swing.text.JTextComponent jcomp, JSeparator jsep, JLabel jlbl, JLabel jlblo, boolean modoOscuro) {
        Color colorError = new Color(255, 0, 0);
        jcomp.setForeground(colorError);
        jsep.setForeground(colorError);
        jlbl.setForeground(colorError);
        jsep.setBackground(colorError);

        Rectangle rect1 = jcomp.getBounds();
        int initialX1 = (int) rect1.getX();
        int initialX2 = (jlblo != null) ? (int) jlblo.getBounds().getX() : 0;

        final int moveAmount = 2;
        int duration = 100;
        int numIterations = 4;
        int delay = duration / (numIterations * 6);

        Toolkit.getDefaultToolkit().beep();

        Timer timer = new Timer(delay, new ActionListener() {
            int iteration = 0;
            int direction = 1;
            int x1 = initialX1;
            int x2 = initialX2;

            @Override
            public void actionPerformed(ActionEvent e) {
                if (iteration < numIterations) {
                    x1 += moveAmount * direction;
                    if (jlblo != null) {
                        x2 += moveAmount * direction;
                    }
                } else if (iteration < numIterations * 3) {
                    x1 -= moveAmount * direction;
                    if (jlblo != null) {
                        x2 -= moveAmount * direction;
                    }
                } else if (iteration < numIterations * 5) {
                    x1 += moveAmount * direction;
                    if (jlblo != null) {
                        x2 += moveAmount * direction;
                    }
                } else if (iteration < numIterations * 6) {
                    x1 -= moveAmount * direction;
                    if (jlblo != null) {
                        x2 -= moveAmount * direction;
                    }
                }

                jcomp.setBounds(x1, (int) jcomp.getY(), (int) jcomp.getWidth(), (int) jcomp.getHeight());
                jsep.setBounds(x1, (int) jsep.getY(), (int) jsep.getWidth(), (int) jsep.getHeight());
                jlbl.setBounds(x1, (int) jlbl.getY(), (int) jlbl.getWidth(), (int) jlbl.getHeight());

                if (jlblo != null) {
                    jlblo.setBounds(x2, (int) jlblo.getY(), (int) jlblo.getWidth(), (int) jlblo.getHeight());
                }

                iteration++;

                if (iteration >= numIterations * 6 && x1 == initialX1) {
                    ((Timer) e.getSource()).stop();

                    jsep.setForeground(!modoOscuro ? Color.BLACK : Color.WHITE);
                    jsep.setBackground(!modoOscuro ? Color.WHITE : Color.BLACK);
                    jlbl.setForeground(!modoOscuro ? Color.WHITE : Color.BLACK);
                }
            }
        });

        timer.start();
    }

    /**
     * Valida un campo de texto o una contraseña según el tipo de campo. Lanza
     * una excepción si el campo no cumple con las condiciones de validación.
     *
     * @param text Texto a validar (puede ser nulo si se valida una contraseña).
     * @param campo Nombre del campo que se está validando.
     * @param password Contraseña a validar (puede ser nula si se valida un
     * campo de texto).
     * @throws Exception Si el campo no cumple con las condiciones de
     * validación.
     */
    private static void validarCampo(String text, String campo, char[] password) throws Exception {
        if (text == null) {
            // Validación de contraseña
            if (campo.equals("Contraseña")) {
                if (password.length <= 8) {
                    throw new Exception("La contraseña no puede ser menor a 8 caracteres");
                }
            }
        } else {
            // Validación de otros campos
            for (char c : text.toCharArray()) {
                if ((campo.equals("nombre") || campo.equals("apellido")) && Character.isDigit(c)) {
                    throw new Exception("El " + campo + " no puede contener números");
                }
                if ((campo.equals("DNI") || campo.equals("edad") || campo.equals("número telefónico")) && Character.isAlphabetic(c)) {
                    throw new Exception("El " + campo + " no puede contener letras");
                }
            }
            if (campo.equals("correo electrónico")) {
                if (!validaCorreo(text)) {
                    throw new Exception("El correo es inválido");
                }
            }
            if (campo.equals("número telefónico") && (text.length() < 9)) {
                throw new Exception("El número telefónico no puede se menor a 9 digitos");
            }
            if (campo.equals("DNI") && (text.length() < 8)) {
                throw new Exception("El DNI no puede se menor a 8 digitos");
            }
            if (campo.equals("edad") && (Integer.parseInt(text) < 18)) {
                throw new Exception("El conductor no puede tener menos de 18 años");
            }
        }
    }

    /**
     * Valida si un correo electrónico es válido.
     *
     * @param correo el correo electrónico a validar
     * @return true si el correo es válido, false de lo contrario
     */
    private static boolean validaCorreo(String correo) {
        return correo.matches("[a-zA-Z0-9]+@{1}[a-zA-Z]+[\\.][a-zA-Z]{2,3}");
    }

    public static void alturaSeparator(JSeparator jsep, boolean ModoOscuro) {
        jsep.setUI(new javax.swing.plaf.basic.BasicSeparatorUI() {
            @Override
            public void paint(Graphics g, JComponent c) {
                Graphics2D g2 = (Graphics2D) g;
                g2.setColor(ModoOscuro ? Color.WHITE : Color.BLACK);
                g2.fillRect(0, 0, 180, 1);
            }
        });
    }

    public static void releasedEnter(JLabel jlbl, KeyEvent evt) {
        if (evt.getKeyChar() == '\n') {
            jlbl.requestFocus();
            MouseEvent mouseEvent = new MouseEvent(
                    jlbl, MouseEvent.MOUSE_CLICKED,
                    System.currentTimeMillis(), 0, 0, 0, 1, false);
            jlbl.dispatchEvent(mouseEvent);
        }
    }

    public static void enteredBotonVerde(JLabel jlbl) {
        jlbl.setForeground(new Color(0, 80, 24));
        javax.swing.border.Border borde = BorderFactory.createMatteBorder(3, 3, 3, 3, new Color(0, 80, 24));
        jlbl.setBorder(borde);
    }

    public static void exitedBotonVerde(JLabel jlbl) {
        jlbl.setForeground(new Color(0, 102, 0));
        javax.swing.border.Border borde = BorderFactory.createMatteBorder(3, 3, 3, 3, new Color(0, 102, 0));
        jlbl.setBorder(borde);
    }

    public static void imprimir(JList jlist) {
        SwingUtilities.invokeLater(() -> {
            PrinterJob job = PrinterJob.getPrinterJob();
            job.setPrintable(new PrintText(jlist));
            boolean doPrint = job.printDialog();
            if (doPrint) {
                try {
                    job.print();
                } catch (PrinterException ex) {
                }
            }
        });
    }

    public static void ModoOscuro(Object object, ArrayList<String> cambiaColor, ArrayList<String> noCambiaColor, boolean modoOscuro) throws IllegalArgumentException, IllegalAccessException {
        final Color[] colorFondo = {Color.WHITE, Color.BLACK};
        final Color[] colorTexto = {Color.BLACK, Color.WHITE};
        final int index = modoOscuro ? 1 : 0;
        final String[] keyWord = {"jpnl", "jlbl", "jtxt", "jpsw"};

        Class<?> clazz = object.getClass();
        Field[] fields = clazz.getDeclaredFields();

        for (Field field : fields) {
            for (String keyword : keyWord) {
                if (field.getName().startsWith(keyword)) {
                    field.setAccessible(true);
                    JComponent fieldValue = (JComponent) field.get(object);

                    if (cambiaColor != null && cambiaColor.contains(field.getName())) {
                        aplicacionDelColor(fieldValue, colorFondo[index], colorTexto[index]);
                    }

                    if (noCambiaColor != null && !noCambiaColor.contains(field.getName())) {
                        aplicacionDelColor(fieldValue, colorFondo[index], colorTexto[index]);
                    }
                }
            }
        }
    }

    private static void aplicacionDelColor(JComponent fieldValue, Color fondo, Color texto) {
        if (fieldValue instanceof JPanel jpnl) {
            jpnl.setBackground(fondo);
        } else if (fieldValue instanceof JPasswordField jpsw) {
            jpsw.setBackground(fondo);
        } else if (fieldValue instanceof JTextField jtxt) {
            jtxt.setBackground(fondo);
        } else if (fieldValue instanceof JLabel jlbl) {
            jlbl.setForeground(texto);
        } else if (fieldValue instanceof JSeparator jsep) {
            jsep.setForeground(texto);
            jsep.setBackground(fondo);
        }
    }

    public static void modificacionComponentes(boolean modoOscuro, JPanel jpnl, JLabel jlbl, String text1, String text2) {
        jlbl.setText(modoOscuro ? " " + text1 + " " : " " + text2 + " ");
        jlbl.revalidate();

        jpnl.setLayout(new BorderLayout());
        jpnl.removeAll();

        jpnl.add(jlbl, BorderLayout.CENTER);
        jpnl.revalidate();
        jpnl.repaint();
    }

    public static void ordenDeComponentesInfo(JPanel jpnl, JLabel jlbl, boolean orden) {
        Container jpnlparent = jpnl.getParent();
        Container jlblparent = jlbl.getParent();

        int jlblIndex = orden ? 0 : jlblparent.getComponentCount() - 1;
        int jpnlIndex = orden ? 1 : jpnlparent.getComponentCount() - 2;

        jlblparent.setComponentZOrder(jlbl, jlblIndex);
        jpnlparent.setComponentZOrder(jpnl, jpnlIndex);

        jlblparent.validate();
        jpnlparent.repaint();
    }
    
    public static void cambioDeJframe(JFrame emisor, JFrame receptor) {
        receptor.setVisible(true);
        Timer timer = new Timer(950, e -> {
            emisor.dispose();
        });
        timer.start();
    }

    public static void iniciarJframe(JFrame jframe) {
        java.awt.EventQueue.invokeLater(() -> {
            jframe.setVisible(true);
        });
    }

    public static void cambioColorJList(JList<String> jList) {

        jList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

        ListCellRenderer<? super String> cellRenderer = new DefaultListCellRenderer() {
            @Override
            public Component getListCellRendererComponent(JList<?> list, Object value, int index, boolean isSelected, boolean cellHasFocus) {
                Component renderer = super.getListCellRendererComponent(list, value, index, isSelected, cellHasFocus);

                renderer.setBackground(isSelected ? new Color(81, 81, 81) : new Color(51, 51, 51));
                renderer.setForeground(new Color(255, 255, 255));

                return renderer;
            }
        };

        jList.setCellRenderer(cellRenderer);
        jList.setFixedCellHeight(30);
        jList.setBorder(null);

//        jList.addListSelectionListener(new ListSelectionListener() {
//            @Override
//            public void valueChanged(ListSelectionEvent e) {
//                // Aquí puedes agregar la lógica que deseas realizar cuando se selecciona un elemento del JList
//            }
//        });
    }
}
