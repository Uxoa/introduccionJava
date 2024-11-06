package org.example.HerenciaYPoliConArrayList;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Empleado> empleados = new ArrayList<>(
                List.of(
                        new EmpleadoFijo("Paloma",12.51, 15),
                        new EmpleadoPorHoras("Maria", 9.82, 40)
                )
        );


        System.out.println(empleados);



    }
}
