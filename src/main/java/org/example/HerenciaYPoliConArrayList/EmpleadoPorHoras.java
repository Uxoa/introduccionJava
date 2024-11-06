package org.example.HerenciaYPoliConArrayList;


public class EmpleadoPorHoras extends Empleado{

    public EmpleadoPorHoras(String nombre, Double salario, int horas) {
        super(nombre, salario, horas);
    }

    @Override
    public void calcularSalario() {
        super.calcularSalario();
    }
}
