package org.example.herenciaVehiculos;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("Seat", 10, (byte) 4);

        System.out.println("Marca: " + car1.getMarca());
        System.out.println("Velocidad inicial: " + car1.getVelocity());
        System.out.println("Ruedas: " + car1.getWheels());

        // Llamar al método acelerar
        car1.acelerar();
        System.out.println("Velocidad después de acelerar: " + car1.getVelocity());

        // Llamar al método frenar
        car1.frenar();
        System.out.println("Velocidad después de frenar: " + car1.getVelocity());
    }
}

