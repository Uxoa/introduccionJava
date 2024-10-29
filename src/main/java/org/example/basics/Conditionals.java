package org.example.basics;

public class Conditionals {
    public static void main(String[] args) {
        boolean isActive = false;

        // variable edad de un usuario con la mínima memoria posible
        byte age = 18;


        // Imprimir "el usu es mayor de edad" si tiene 18 o más"
        if (age >= 18){
            System.out.println("El usuario es mayor de edad");
        }
        // Imprimir "el usu es menor de edad" si tiene menos de 18 año"
        if (age < 18){
            System.out.println("El usuario es menor de edad");
        }


        // Imprimir el usuario está activo si está activo
        if (isActive){
            System.out.println("El usuario esta Activo");
        }
        // Imprimir el usuario esta inactivo si está inactivo
        if (!isActive){
            System.out.println("El usuario esta inactivo");
        };

    }
}
