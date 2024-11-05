package org.example.metodos;

import java.util.Scanner;

public class DatosUsuario {

    /*Crear un método que muestre los datos (nombre, apellido y la edad)
 de un usuario, ingresado por teclado.
 */
    Scanner scanner = new Scanner(System.in);

    public void mostrarDatosUsuario(String nombre, String apellido, int edad){
        System.out.println("Nombre: ");
        nombre = scanner.nextLine();
        System.out.println("Apellido: ");
        apellido = scanner.nextLine();
        System.out.println("Edad: ");
        edad = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Los datos del usuario son: " + nombre + " " + apellido + " " + edad);
    }

    public static void main(String[] args) {
        DatosUsuario ejercicio1 = new DatosUsuario();
        ejercicio1.mostrarDatosUsuario("","",0);
    }
}
