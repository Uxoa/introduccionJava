package org.example.basics;
/* Las cadenas (strings) en Java son secuencias de caracteres.
La clase String en Java es una de las clases más utilizadas y proporciona una amplia
variedad de métodos para manipular y trabajar con cadenas.
*/
public class Strings {

    public static void main(String[] args) {
        // Imprimir por consola una comparación de dos strings con el método equals
        String uno = "Java";
        String dos = "Python";
        Boolean sonIguales = uno.equals(dos);
        System.out.println("¿Son iguales? " + sonIguales);


        String name = "Paloma";
        String surname = new String("Babot");

        String fullName = name + " " + surname;

        System.out.println(fullName);
    }
}
