package org.example.users;

public class Main {
    public static void main(String[] args) {

    User user1 = new User("Paloma", "Babot");
    User user2 = new User("Ana", "López");

        System.out.println(user1.fullName());
        System.out.println(user2.fullName());

    /* Utilizando algun bucle imprime los fullNames de 3 usuarios diferentes
    Imprimir desde fuera no vale poner el sout dentro de la clase, imprimiremos desde el Main
     */

    }

}
