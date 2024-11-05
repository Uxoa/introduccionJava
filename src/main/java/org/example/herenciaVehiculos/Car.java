package org.example.herenciaVehiculos;

public class Car extends Vehiculo {

    public Car(String marca, int velocity, byte wheels) {
        super(marca, velocity, wheels);
    }

    @Override
    public void acelerar() {
        setVelocity(getVelocity() + 20); // Aumenta en 20 para el coche
    }

    @Override
    public void frenar() {
        // Reduce la velocidad en 15 en lugar de 10
        setVelocity(Math.max(getVelocity() - 15, 0));
    }
}

