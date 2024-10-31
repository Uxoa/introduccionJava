package org.example.basics.coche;

public class Coche {

    // Atributos (variables de instancia)
    private String marca;
    private String modelo;
    private int any;
    private Double kilometraje;

    // Constructor
    public Coche(String marca, String modelo, int any, Double kilometraje) {
        this.marca = marca;
        this.modelo = modelo;
        this.any = any;
        this.kilometraje = kilometraje;
    }

    // Método conducir(double km) incrementa kilometraje en la cantidad de km proporcionada
       public void conducir(double km) {
           if (km > 0) { // Compruebo que la distancia es positiva
               this.kilometraje = this.kilometraje + km;
           } else {
               System.out.println("La distancia a conducir debe ser positiva.");
           }
       }
    // Método para mostrar la información del coche
    public void mostrarInformacion() {
        System.out.println("Marca: " + this.marca);
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Año: " + this.any);
        System.out.println("Kilometraje: " + this.kilometraje + " km");
    }

}
