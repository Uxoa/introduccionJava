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



    }

}
