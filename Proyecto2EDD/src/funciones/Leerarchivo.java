///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//package funciones;
//
///**
// *
// * @author pjroj
// */
//public class Leerarchivo {
//    
//}
//
//import java.io.BufferedReader;
//import java.io.FileReader;
//import java.io.IOException;
//import java.util.ArrayList;
//
//// Clase para representar los datos de un usuario
//class Usuario {
//  // Atributos de la clase
//  private String nombre; // Nombre del usuario
//  private String tipo; // Tipo de prioridad del usuario
//
//  // Constructor de la clase
//  public Usuario(String nombre, String tipo) {
//    this.nombre = nombre;
//    this.tipo = tipo;
//  }
//
//  // Métodos de la clase
//  // Método para obtener el nombre del usuario
//  public String getNombre() {
//    return nombre;
//  }
//
//  // Método para obtener el tipo de prioridad del usuario
//  public String getTipo() {
//    return tipo;
//  }
//
//  // Método para mostrar los datos del usuario por consola
//  public void mostrar() {
//    System.out.println("Usuario: " + nombre + " - Tipo: " + tipo);
//  }
//}
//
//// Clase principal del programa
//public class LeerCSV {
//  // Método principal del programa
//  public static void main(String[] args) {
//    // Lista para almacenar los datos de los usuarios
//    ArrayList<Usuario> usuarios = new ArrayList<Usuario>();
//
//    // Variable para guardar el nombre del archivo CSV
//    String archivo = "datos.csv";
//
//    // Variable para guardar la línea leída del archivo
//    String linea = "";
//
//    // Variable para guardar el separador de los campos del archivo
//    String separador = ";";
//
//    // Bloque try-catch para manejar posibles excepciones
//    try {
//      // Crear un objeto BufferedReader para leer el archivo
//      BufferedReader br = new BufferedReader(new FileReader(archivo));
//
//      // Leer la primera línea del archivo (encabezado)
//      linea = br.readLine();
//
//      // Leer las siguientes líneas del archivo (datos)
//      while ((linea = br.readLine()) != null) {
//        // Dividir la línea por el separador y guardar los campos en un arreglo
//        String[] campos = linea.split(separador);
//
//        // Crear un objeto Usuario con los campos leídos
//        Usuario usuario = new Usuario(campos[0], campos[1]);
//
//        // Agregar el objeto Usuario a la lista de usuarios
//        usuarios.add(usuario);
//      }
//
//      // Cerrar el objeto BufferedReader
//      br.close();
//
//      // Mostrar por consola el número de usuarios leídos
//      System.out.println("Se han leído " + usuarios.size() + " usuarios del archivo " + archivo);
//
//      // Recorrer la lista de usuarios y mostrar sus datos por consola
//      for (Usuario u : usuarios) {
//        u.mostrar();
//      }
//
//    } catch (IOException e) {
//      // Mostrar por consola el mensaje de la excepción
//      System.out.println("Error al leer el archivo: " + e.getMessage());
//    }
//  }
//}
//
