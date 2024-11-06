package org.example.HerenciaYPoliConArrayList;

import java.util.ArrayList;

public class Empleado {
    private String nombre;
    private Double salario;
    private Double horas;

    public Empleado(String nombre, Double salario, Double horas) {
        this.nombre = nombre;
        this.salario = salario;
        this.horas = horas;
    }

    public void calcularSalario(){
        Double salarioTotal = salario * horas;
        System.out.println(salarioTotal);
    }


}
