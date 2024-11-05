package org.example.metodos;

import java.util.Scanner;

public class TablaMultiplicar {
    Scanner scanner = new Scanner(System.in);
    int numero = scanner.nextInt();

    public void mostrarTablaMultiplicar(){
       for (int i = 0; i < 11; i++){
           System.out.println((numero + " x " + i + " = ") + numero * i);
       }

    }

    public static void main(String[] args) {
        System.out.println("Escribe un numero para ver su Tabla de Multiplicar");
        TablaMultiplicar tabla = new TablaMultiplicar();
        tabla.mostrarTablaMultiplicar();
    }

}
