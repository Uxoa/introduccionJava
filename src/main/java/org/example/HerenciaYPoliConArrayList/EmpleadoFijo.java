package org.example.HerenciaYPoliConArrayList;

public class EmpleadoFijo extends Empleado {

    public EmpleadoFijo(String nombre, double salarioFijo) {
        super(nombre, salarioFijo);
    }

    @Override
    public double calcularSalario() {
        return salario;
    }
}
