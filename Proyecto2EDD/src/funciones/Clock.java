/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package funciones;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Clock {

    public static void main(String[] args) {

        // Crear un objeto DateTimeFormatter con el formato deseado
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");

        // Crear un hilo que se ejecuta cada segundo
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                while (true) {
                    // Obtener la fecha y hora actuales
                    LocalDateTime now = LocalDateTime.now();

                    // Formatear la fecha y hora con el formatter
                    String time = now.format(formatter);

                    // Mostrar la hora en la consola
                    System.out.println(time);

                    // Esperar un segundo
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        });

        // Iniciar el hilo
        thread.start();
    }
}
