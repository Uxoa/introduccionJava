package org.example.herenciaVehiculos;

public class Vehiculo {
    private String marca;
    private int velocity;
    private byte wheels;

    public Vehiculo(String marca, int velocity, byte wheels) {
        this.marca = marca;
        this.velocity = velocity;
        this.wheels = wheels;
    }

    // Método para acelerar
    public void acelerar() {
        this.velocity += 10;
    }

    // Método para frenar
    public void frenar() {
        // Disminuir la velocidad en 10, pero no permitir que sea menor que 0
        this.velocity = Math.max(this.velocity - 10, 0);
    }

    public String getMarca() {
        return marca;
    }

    public int getVelocity() {
        return velocity;
    }

    public int getWheels() {
        return wheels;
    }

    public void setVelocity(int velocity) {
        this.velocity = velocity;
    }

    @Override
    public String toString() {
        return "Vehiculo{" +
                "marca='" + marca + '\'' +
                ", velocity=" + velocity +
                ", wheels=" + wheels +
                '}';
    }
}
