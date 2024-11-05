package org.example.metodos;

import java.util.Scanner;

public class MayoriaEdad {
/* Diseñe un método que imprima los datos de una persona
 ingresados por teclado e indicar si es mayor o menor de edad.
 */

   Scanner scanner = new Scanner(System.in);

   public void mayorDeEdad(String nombre, int edad){
       System.out.println("Escribe tu nombre: ");
       nombre = scanner.nextLine();
       System.out.println("Escribe tu edad: ");
       edad = scanner.nextInt();

       if(edad < 18 ){
           System.out.println(nombre + ", No eres mayor de edad.");
       } if (edad > 18){
           System.out.println(nombre + ", SI eres mayor de edad.");
       }


   }

    public static void main(String[] args) {
        MayoriaEdad nuevaEdad = new MayoriaEdad();
        nuevaEdad.mayorDeEdad("", 0);
    }

}
