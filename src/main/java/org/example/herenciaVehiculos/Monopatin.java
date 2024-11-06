package org.example.herenciaVehiculos;

public class Monopatin extends Vehiculo {

    public Monopatin(int velocity) {
        super();
    }

    @Override
    public void acelerar() {
        this.velocity += 10;
    }

    @Override
    public void frenar() {
        this.velocity -= 10;
    }

    @Override
    public String toString() {
        return ("El Monopatin va a " + velocity + " km/h");
    }
}
