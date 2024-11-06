package org.example.HerenciaYPoliConArrayList;

public class EmpleadoFijo extends Empleado {


    public EmpleadoFijo(String nombre, Double salario, int horas) {
        super(nombre, salario, horas);
    }


    @Override
    public void calcularSalario() {
        super.calcularSalario();
    }
}