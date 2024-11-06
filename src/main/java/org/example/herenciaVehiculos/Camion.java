package org.example.herenciaVehiculos;

public class Camion extends Vehiculo{
    public Camion(int velocity) {
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
        return ("El Camión va a " + velocity + " km/h");
    }
}
