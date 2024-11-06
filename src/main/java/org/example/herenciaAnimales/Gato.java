package org.example.herenciaAnimales;

public class Gato extends Animal{

    @Override
    public void haceSonido() {
        super.haceSonido();
        System.out.println("El GATO hace: " + (this.sonido = " MIAU MIAU!!"));
    }
}
