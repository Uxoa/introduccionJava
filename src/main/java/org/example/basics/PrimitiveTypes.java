// Los tipos de datos primitivos

package org.example.basics;

public class PrimitiveTypes {
    public static void main(String[] args) {

        //escribir un boolean , asignarlo, mostrar por consola
        boolean isActive = false;
        System.out.println(isActive);

        //numeros enteros ()
        byte primer = 0;
        System.out.println(primer);
        int variable = 123;
        System.out.println(variable);
        long largo = 123456;
        System.out.println(largo);
        float flotante = 53;
        System.out.println(flotante);
        double doble = 7;
        System.out.println(doble);
        char car = 47;


    // Incremento y decremento: no solo devuelven un valor, sino que también modifican el valor de la variable.
        var i = 0;
        //Al utilizar la notación prefija, primero se produce la modificación de la variable y luego se devuelve.
        ++i; // 1
        ++i; // 2
        --i; // 1
        --i; // 0

        //Al utilizar la notación posfija, primero se devuelve y luego se modifica la variable.
        i++; // 0
        i++; // 1
        i--; // 2
        i--; // 1



    }
}
