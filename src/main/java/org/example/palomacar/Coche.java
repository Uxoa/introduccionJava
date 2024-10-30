package org.example.palomacar;

public class Coche {

     // Declaro las propiedades (atributos) de mi coche
     private String marca;
     private String modelo;
     private int any;
     private Double kilometraje;

     // Genero el contsructor que inicializa las propiedades (atributos)
     public Coche(String marca, String modelo, int any, Double kilometraje) {
          this.marca = marca;
          this.modelo = modelo;
          this.any = any;
          this.kilometraje = kilometraje;
     }

     // Escribo el método conducir(km) que incrementará el kilometraje inicial
     public Double conducir(double km){
          if(kilometraje > 0){
               //si he recorrido X km debo realizar el incremento
               this.kilometraje = this.kilometraje + km;
          } else {
               //si no he recorrido ninguna distancia el kilometraje es el inicial
               return kilometraje;
          }
          return null;
     }

     // Escribo el método mostrar Informacion() que imprimirá en la consola la info de mi coche
     public String mostrarInformacion(){
          System.out.println("Marca: " + " " + this.marca);
          System.out.println("Modelo: " + " " + this.modelo);
          System.out.println("Año: " + " " + this.any);
          System.out.println("Kilometraje: " + " " + this.kilometraje);
         return null;
     }

}
