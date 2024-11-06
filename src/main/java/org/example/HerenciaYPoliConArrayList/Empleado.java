package org.example.HerenciaYPoliConArrayList;

import org.example.herenciaVehiculos.*;

import java.util.ArrayList;
import java.util.List;

public abstract class Empleado {
    private String nombre;
    private Double salario;
    private int horas;

    public Empleado(String nombre, Double salario, int horas) {
        this.nombre = nombre;
        this.salario = salario;
        this.horas = horas;
    }


    public void calcularSalario(){
        Double salarioTotal = salario * horas;
        System.out.println(salarioTotal);
    }

    @Override
    public String toString() {
        return "El empleado: "
                + nombre
                + ", con un salario de " + salario
                + " €/h, y " + horas + "h trabajadas por semana"
                + " tiene un salario de \n";
    }
}
