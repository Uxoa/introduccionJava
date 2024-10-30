package org.example.coche;


public class Main {
    public static void main(String[] args) {

        // Instancio un nuevo objeto coche que llamo coche1
        Coche miCoche = new Coche("Toyota", "Corolla", 2024, 80.000);

        // Muestro la información inicial del coche
        System.out.println("Información inicial del coche:");
        miCoche.mostrarInformacion();

        // Empiezo a conducir el coche 150 kilómetros
        miCoche.conducir(150);

        // Muestro la información actualizada del coche
        System.out.println("\nInformación después de conducir 150 km:");
        miCoche.mostrarInformacion();
    }
}


