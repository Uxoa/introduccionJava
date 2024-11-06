package org.example.herenciaVehiculos;

public abstract class Vehiculo {
    private String marca;
    int velocity;
    private byte wheels;

    public Vehiculo(String marca, int velocity, byte wheels) {
        this.marca = marca;
        this.velocity = velocity;
        this.wheels = wheels;
    }

    // Método para acelerar
//    public void acelerar() {
//        this.velocity += 10;
//    }

    public abstract void acelerar();


    // Método para frenar
    public void frenar() {
        // Disminuir la velocidad en 10, pero no permitir que sea menor que 0
        this.velocity -= 10;
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
