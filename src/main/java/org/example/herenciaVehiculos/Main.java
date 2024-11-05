package org.example.herenciaVehiculos;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("Seat", 10, (byte) 4);
        Moto moto1 = new Moto("Impala", 30, (byte) 2);

        // Car Llamar al método acelerar
        car1.acelerar();
        System.out.println("Marca: " + car1.getMarca());
        System.out.println("Velocidad inicial: " + car1.getVelocity());
        System.out.println("Ruedas: " + car1.getWheels());
        System.out.println("Velocidad después de acelerar: " + moto1.getVelocity());
        // Car Llamar al método frenar
        car1.frenar();
        System.out.println("Velocidad después de frenar: " + car1.getVelocity());

        System.out.println("---------------------------------");

        // moto llama a acelerar
        moto1.acelerar();

        System.out.println("Marca: " + moto1.getMarca());
        System.out.println("Velocidad inicial: " + moto1.getVelocity());
        System.out.println("Ruedas: " + moto1.getWheels());

        System.out.println("Velocidad después de acelerar: " + moto1.getVelocity());
       // moto llama a frenar
        moto1.frenar();
        System.out.println("Velocidad después de frenar: " + moto1.getVelocity());



    }
}

