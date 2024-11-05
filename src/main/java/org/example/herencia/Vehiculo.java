package org.example.herencia;

public class Vehiculo {
    private String marca;
    private int velocity;

    public Vehiculo(String marca) {
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
