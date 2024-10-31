package org.example.basics;

public class Apuntes {

    public static void main(String[] args) {

        // Incremento y decremento: no solo devuelven un valor, sino que también modifican el valor de la variable.
        var i = 0;
        //Al utilizar la notación prefija, primero se produce la modificación de la variable y luego se devuelve.
        ++i; // 1
        ++i; // 2
        --i; // 1
        --i; // 0

        //Al utilizar la notación posfija, primero se devuelve y luego se modifica la variable.
        i++; // 0
        i++; // 1
        i--; // 2
        i--; // 1


        // OPERADORES
        // unitarios, binarios, ternarios
        // la multiplicación y la división tienen mayor prioridad que la suma y la resta

        // VARIABLES
        //Escribe un programa que tome la cantidad inicial de euros almacenada en la variable amountEuros,
        // convierta los euros a dólares y los muestre en la pantalla. Luego, convierte el valor obtenido
        // a rublos y lo muestra en una nueva línea. Ejemplo de salida para 100 euros:
        var eurosCount = 100;
        var amountEuros = eurosCount * 1.25;
        System.out.println(amountEuros);
        amountEuros = amountEuros * 60;
        System.out.println(amountEuros);
        // Números Mágicos: ¿De dónde viene el 1.25? ¿y qué es el 60? ---> NO CLEAN CODE


        // STRINGS: substrings ---> método que extrae una subcadena de una cadena
        // El primer parámetro es el índice desde el cual se debe comenzar a extraer la subcadena.
        // El segundo parámetro es el índice hasta el cual se deben extraer los caracteres.
        // Por defecto, se toma la cadena hasta el final:

        "hexlet".substring(1); // "exlet"
        "hexlet".substring(1, 2); // "e"
        "hexlet".substring(1, 3); // "ex"
        "hexlet".substring(3, 6); // "let"

        var searchEngine = "google";
        // .charAT() --> Devuelve carácter tipo char
        searchEngine.charAt(0); // 'g'
        // .length() --> devuelve el tamaño de la cadena
        searchEngine.length(); // 6
        //replace() --> el primero es lo que se va a reemplazar y el segundo es por qué se va a reemplazar
        searchEngine.replace("go", "mo"); // "moogle"

    }

}
