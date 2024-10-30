package org.example.palomacar;

public class Main {
    public static void main(String[] args) {
         // Creo un objeto de la clase coche con datos inventados
        Coche miCoche = new Coche("Dacia", "Dover", 2020, 25.000);

        // Llamo al método mostrarInformación() con los datos iniciales
        System.out.println("Datos iniciales de mi coche:");
        miCoche.mostrarInformacion();

        // Llamo al método conducir(double km) simulando que miCoche rueda algunos kilómetros
        miCoche.conducir(10);

        // Vuelvo a llamar al método mostrarInformacion() con el incremento del kilometraje
        System.out.println("Datos actualizados de mi coche:");
        miCoche.mostrarInformacion();

    }
}
