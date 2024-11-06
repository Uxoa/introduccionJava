package org.example.HerenciaYPoliConArrayList;

public class EmpleadoPorHoras extends Empleado{

    private int horasTrabajadas;

    public EmpleadoPorHoras(String nombre, double tarifaPorHora, int horasTrabajadas) {
        super(nombre, tarifaPorHora); // Inicializa nombre y tarifa por hora en la clase base
        this.horasTrabajadas = horasTrabajadas;
    }

    @Override
    public double calcularSalario() {
        return salario * horasTrabajadas;
    }
}
