package org.example.herenciaAnimales;

import org.example.herenciaVehiculos.Race;

import java.util.ArrayList;
import java.util.List;

public class Main {
        public static void main(String[] args) {

            System.out.println("--------> SONIDO de ANIMALES <--------");

//            Perro perro1 = new Perro();
//            perro1.haceSonido();
//
//            Gato gato1 = new Gato();
//            gato1.haceSonido();

            ArrayList<Animal> animales = new ArrayList<>();
            animales.add(new Perro());
            animales.add(new Gato());

            for (Animal animal : animales){
                animal.haceSonido();;
            }

        }
    }

