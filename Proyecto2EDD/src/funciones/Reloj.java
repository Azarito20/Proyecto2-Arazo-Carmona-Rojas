
package funciones;

import java.awt.Font;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

// Una clase para crear un reloj
public class Reloj implements Runnable {

    // Un atributo de tipo JLabel para mostrar la hora
    private JLabel etiquetaReloj;

    // Un atributo de tipo SimpleDateFormat para formatear la hora
    private SimpleDateFormat formateador;

    // Un constructor que inicializa los atributos y configura la etiqueta
    public Reloj() {
        // Crear una etiqueta con el texto "00:00:00"
        etiquetaReloj = new JLabel("00:00:00");

        // Centrar el texto de la etiqueta
        etiquetaReloj.setHorizontalAlignment(SwingConstants.CENTER);

        // Cambiar el tamaño y el estilo de la fuente de la etiqueta
        etiquetaReloj.setFont(new Font("Arial", Font.BOLD, 48));

        // Crear un formateador con el formato "HH:mm:ss"
        formateador = new SimpleDateFormat("HH:mm:ss");
    }

    // Un método que se ejecuta en un hilo separado para actualizar la hora cada segundo
    @Override
    public void run() {
        // Un ciclo infinito
        while (true) {
            try {
                // Obtener la hora actual del sistema
                Date horaActual = new Date();

                // Formatear la hora actual como una cadena
                String horaFormateada = formateador.format(horaActual);

                // Establecer el texto de la etiqueta con la hora formateada
                etiquetaReloj.setText(horaFormateada);

                // Hacer que el hilo duerma un segundo
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace(); // Manejar la excepción de interrupción
            }
        }
    }

    // Un método que devuelve la etiqueta del reloj
    public JLabel getEtiquetaReloj() {
        return etiquetaReloj;
    }

    // Un método principal para probar la clase Reloj
    public static void main(String[] args) {
        // Crear un objeto de la clase Reloj
        Reloj reloj = new Reloj();

        // Crear un hilo con el objeto reloj como Runnable
        Thread hilo = new Thread(reloj);

        // Iniciar el hilo
        hilo.start();

        // Crear un objeto de la clase JFrame para mostrar la ventana
        JFrame ventana = new JFrame("Reloj");

        // Establecer el tamaño de la ventana
        ventana.setSize(300, 200);

        // Establecer la ubicación de la ventana en el centro de la pantalla
        ventana.setLocationRelativeTo(null);

        // Establecer el comportamiento de la ventana al cerrarse
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Agregar la etiqueta del reloj a la ventana
        ventana.add(reloj.getEtiquetaReloj());

        // Hacer visible la ventana
        ventana.setVisible(true);
    }
}