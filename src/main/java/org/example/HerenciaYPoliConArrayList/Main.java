package org.example.HerenciaYPoliConArrayList;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Empleado> empleados = new ArrayList<>();

        // Agregar empleados fijos y por horas
        empleados.add(new EmpleadoFijo("Juan", 2000)); // Salario fijo de 2000 €
        empleados.add(new EmpleadoPorHoras("Ana", 15, 40)); // Tarifa de 15 €/hora, 40 horas

        double salarioTotal = 0;

        // Calcular y mostrar los salarios individuales y el total
        for (Empleado empleado : empleados) {
            System.out.println(empleado); // Llama a toString() de cada empleado
            salarioTotal += empleado.calcularSalario();
        }

        System.out.println("Salario total de todos los empleados: " + salarioTotal + " €");
    }
}
