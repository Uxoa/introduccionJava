package org.example.HerenciaYPoliConArrayList;

import java.util.ArrayList;
import java.util.List;

public abstract class Empleado {
    protected String nombre;
    protected double salario;

    public Empleado(String nombre, double salario) {
        this.nombre = nombre;
        this.salario = salario;
    }

    public abstract double calcularSalario();

    @Override
    public String toString() {
        return "Empleado: " + nombre + ", salario total: " + calcularSalario() + " €";
    }
}
