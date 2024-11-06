package org.example.herenciaAnimales;

import java.util.SortedMap;

public class Perro extends Animal{

    @Override
    public void haceSonido() {
        System.out.println("EL PERRO hace: " + (this.sonido = " GUAU GUAU!!"));
    }
}
