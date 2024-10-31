package org.example.palomabookmanager;

import javax.swing.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // Instancio un nuevo objeto scanner para entrada del teclado
        Scanner scanner = new Scanner(System.in);

        // Guardo en un array las opciones del menú
        String[] miMenu =  {
                "Gestor de Libros Técnicos de Programación\n" +
                "1. Añadir libro\n" +
                "2. Ver todos los libros\n" +
                "3. Eliminar libro\n" +
                "4. Cambiar repositorio\n" +
                "5. Salir\n"
        };

        // muestro el menu en la consola con sout
        System.out.println(miMenu[0]);

        // declaro la variable opcion que me guardará lo que el usuario seleccione y la inicializo a 0
        byte opcion = 0;

        // Mientras que la opción sea distinta que 5 (posición elementos array) mostraré el menú
        while (opcion != 5) {

            // recorro con el for cada elemento (menuItem) que hay dentro array miMenu[]
            for (String menuItem : miMenu) {
                // y muestro cada elemento con el sout
                System.out.println(menuItem);
            }

            // Indico al usuario con sout que escriba una opción y .println me devuelve salto de línea
            System.out.println("Seleccione una opción:");
                // lo que el usuario escriba en scanner.nextLine(), lo almaceno en input
                String input = scanner.nextLine();

            // Método para convertir la entrada input (un String) en un número de tipo byte.
            // y luego se revisa si ese número es válido.
            try {
                opcion = Byte.parseByte(input);
            } catch (Exception ex) {
                System.out.println("Esto no es un numero");
                continue;
            }
            if (opcion < 1 || opcion > 5) {
                System.out.println("Numero fuera de rango");
                continue;
            }
            System.out.println("Ha elegido: " + miMenu[opcion - 1]);

        }
    }

}
