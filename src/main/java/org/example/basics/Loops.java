package org.example.basics;

public class Loops {

    public static void main(String[] args) {

        int[] numbers = {5, 6, 7, 8, 9, 10};

        // imprimir por consola los numeros de 5 a 10 usando un for
        for (int number : numbers) {
            System.out.println("Number: " + number);
        }

        // imprimir por consola los numeros pares del 5 al 10
        System.out.println("Imprimir por consola los numeros pares del 5 al 10");

        for (int number : numbers) {
            if (number % 2 == 0) {
                System.out.println(number + " es par");
            }
        }

        System.out.println("Imprimir por consola los números impares del 5 al 10 usando un while");
        int number = 5; // Iniciar el número en 5

        while (number <= 10) {
            if (number % 2 != 0) {
                System.out.println(number + " es impar");
            }
            number++;
        }



    }
}
