package org.example.basics;

public class Arrays {

    public static void main(String[] args) {

    // Definir un array de 5 ciudades (llenos)
    int[] numbers = {1, 2, 3, 4, 5};

    // Definir un array de 5 ciudades
    String[] cities = { "Barcelona", "Madrid", "Granada", "Málaga", "Valencia"};

    // Imprimir linea a linea todos los numeros
        for(int number : numbers) {
            System.out.println("number" + " " + number );
        }


    // Imprimir
        System.out.println(java.util.Arrays.toString(cities));
    }
}
