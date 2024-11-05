package org.example.metodos;

import java.util.Scanner;

public class Ascensor {

    /* Elabore un método que simule el proceso de subir a un piso
       en un ascensor, donde el numero de piso es ingresado por teclado.
    */

    Scanner scanner = new Scanner(System.in);

    public void subirPiso() {
        System.out.println("¿A qué piso quiere subir?");

        // Solicitar el número de piso y almacenarlo en una variable
        int b = scanner.nextInt();

        // Bucle para simular el ascenso piso por piso
        for (int a = 1; a <= b; a++) {
            System.out.println("El ascensor sube al piso: " + a);
        }
    }

    public static void main(String[] args) {
        // Crear una instancia de Ascensor y llamar al método subirPiso
        Ascensor ascensor = new Ascensor();
        ascensor.subirPiso();
    }
}
