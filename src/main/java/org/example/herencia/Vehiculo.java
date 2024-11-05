package org.example.herencia;

public class Vehiculo {
    private String marca;
    private int velocity;

    public Vehiculo(String marca, int velocity) {
        this.marca = marca;
        this.velocity = 0; // velocidad inicial a cero
    }

    public Vehiculo() {
    }

    public void acelerar(){
        this.velocity += 10;
    }

    public String getMarca() {
        return marca;
    }

    public int getVelocity() {
        return velocity;
    }
}
