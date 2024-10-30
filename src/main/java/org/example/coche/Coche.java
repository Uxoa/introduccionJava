package org.example.coche;

public class Coche {

    // Atributos (variables de instancia)
    private String marca;
    private String modelo;
    private int anyo;
    private Double kilometraje;

    // Constructor
    public Coche(String marca, String modelo, int anyo, Double kilometraje) {
        this.marca = marca;
        this.modelo = modelo;
        this.anyo = anyo;
        this.kilometraje = kilometraje;
    }

    // Método conducir(double km) incrementa kilometraje en la cantidad de km proporcionada
       public void conducir(double km) {
           if (km > 0) { // Validamos que la distancia sea positiva
               this.kilometraje += km;
           } else {
               System.out.println("La distancia a conducir debe ser positiva.");
           }
       }
    // Método para mostrar la información del coche
    public void mostrarInformacion() {
        System.out.println("Marca: " + this.marca);
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Año: " + this.anyo);
        System.out.println("Kilometraje: " + this.kilometraje + " km");
    }


    @Override
    public String toString() {
        return "Coche{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", anyo=" + anyo +
                ", kilometraje=" + kilometraje +
                '}';
    }
}
