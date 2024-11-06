package org.example.herenciaVehiculos;

public abstract class Vehiculo {
    int velocity = 0;


    public abstract void acelerar();


    // Método para frenar
    public void frenar() {
        // Disminuir la velocidad en 10, pero no permitir que sea menor que 0
        this.velocity -= 10;
    }

}
