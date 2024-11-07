package org.example.herenciaVehiculos;

public class Main {
    public static void main(String[] args) {

        System.out.println("--------> CARRERA DE VEHÍCULOS <--------");

        // TODO mirar mejor si es util
        Race race1 = new Race();
        Race race2 = race1;

         race1.startRace();
         race2.stopRace();
    }
}

