package org.example.palomabookmanager;

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
                "5. Salir\n" +
                "Seleccione una opción:"
        };

        byte opcion = 0;

        System.out.println(miMenu[0]);
        byte seleccion = scanner.nextByte();




    }
}
