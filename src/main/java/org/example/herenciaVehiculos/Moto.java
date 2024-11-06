package org.example.herenciaVehiculos;

public class Moto extends Vehiculo{

    public Moto() {
        super();
    }

    @Override
    public void acelerar() {
        this.velocity += 15;
    }

    @Override
    public void frenar() {
        this.velocity -= 20;
    }

    @Override
    public String toString() {
        return ("La moto va a " + velocity + " km/h");
    }
}

