package org.example.users;

public class User {

      private String name;
      private String surname;

      public User(String name, String surname) {
            this.name = name;
            this.surname = surname;
      }

      public String fullName(){
            return name + "" + surname;
      }

      /* Utilizando algun bucle imprime los fullNames de 3 usuarios diferentes
      Imprimir desde fuera no vale poner el sout dentro de la clase, imprimiremos desde el Main
     */
}
