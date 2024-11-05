package org.example.herenciaVehiculos;

public class Moto extends Vehiculo{
    public Moto(String marca, int velocity, byte wheels) {
        super(marca, velocity, wheels);
    }


    @Override
    public void acelerar() {
        setVelocity(getVelocity() + 5); // Aumenta en 20 para el coche
    }

    @Override
    public void frenar() {
        // Reduce la velocidad en 15 en lugar de 10
        setVelocity(Math.max(getVelocity() - 30, 0));
    }
}

