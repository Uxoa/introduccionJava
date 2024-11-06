package org.example.herenciaVehiculos;

public class Car extends Vehiculo {

    public Car() {
        super();
    }

    @Override
    public void acelerar() {
        this.velocity += 5;
    }

    @Override
    public void frenar() {
        this.velocity -= 15;
    }

    @Override
    public String toString() {
        return ("El Coche va a " + velocity + " km/h");
    }
}

