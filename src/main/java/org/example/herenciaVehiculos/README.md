# Carrera de Vehículos 🚗🏍️🚛🛴

Este proyecto es un ejemplo básico de herencia y polimorfismo en Java, aplicado a una carrera de vehículos. En este ejercicio, se implementan diferentes clases de vehículos, cada uno con su propio comportamiento para acelerar y frenar, y se organizan en una carrera que demuestra el uso del polimorfismo.

## Autor

Me llamo Paloma Babot y he realizado este ejercicio para practicar herencia y polimorfismo en Java, y es una excelente introducción a los principios de la programación orientada a objetos (OOP).

## Estructura del Proyecto

El proyecto se encuentra en el paquete `org.example.herenciaVehiculos` e incluye las siguientes clases:

- **Vehiculo**: Clase abstracta que representa un vehículo genérico. Define un atributo de velocidad (`velocity`) y métodos abstractos y concretos que serán utilizados o sobrescritos por sus subclases.
- **Car**: Subclase de `Vehiculo` que representa un coche y define su propio comportamiento para acelerar y frenar.
- **Moto**: Subclase de `Vehiculo` que representa una moto, con un comportamiento específico para acelerar y frenar.
- **Camion**: Subclase de `Vehiculo` que representa un camión, con su propio comportamiento para acelerar y frenar.
- **Monopatin**: Subclase de `Vehiculo` que representa un monopatín y define su propio comportamiento para acelerar y frenar.
- **Race**: Clase que organiza una carrera de vehículos. Contiene una lista de diferentes instancias de `Vehiculo` y métodos para iniciar y detener la carrera.
- **Main**: Clase principal que ejecuta la carrera de vehículos.

## Clases

### Vehiculo (Abstracta)
Define los métodos:
- `acelerar()`: Método abstracto que debe ser implementado en cada subclase, aumentando la velocidad según el tipo de vehículo.
- `frenar()`: Método concreto que puede ser sobrescrito por las subclases para definir cómo cada vehículo reduce su velocidad.

### Car (Coche)
- **Acelerar**: Incrementa la velocidad en 5 km/h.
- **Frenar**: Disminuye la velocidad en 15 km/h.
- **toString**: Muestra el estado del coche indicando la velocidad actual.

### Moto
- **Acelerar**: Incrementa la velocidad en 15 km/h.
- **Frenar**: Disminuye la velocidad en 20 km/h.
- **toString**: Muestra el estado de la moto indicando la velocidad actual.

### Camion
- **Acelerar**: Incrementa la velocidad en 10 km/h.
- **Frenar**: Disminuye la velocidad en 10 km/h.
- **toString**: Muestra el estado del camión indicando la velocidad actual.

### Monopatin
- **Acelerar**: Incrementa la velocidad en 10 km/h.
- **Frenar**: Disminuye la velocidad en 10 km/h.
- **toString**: Muestra el estado del monopatín indicando la velocidad actual.

### Race (Carrera)
Organiza la carrera y permite la interacción con los vehículos mediante el polimorfismo.
- **peloton**: Lista que contiene diferentes tipos de `Vehiculo` (coche, moto, camión y monopatín).
- **startRace()**: Inicia la carrera, acelerando cada vehículo en la lista y mostrando su estado.
- **stopRace()**: Detiene la carrera, frenando cada vehículo y mostrando su estado.

### Main
Es el punto de entrada de la aplicación. Ejecuta los métodos `startRace` y `stopRace` de la clase `Race`.

## Ejecución

Para ejecutar el programa, utiliza el método `main` en la clase `Main`:

```java
public class Main {
    public static void main(String[] args) {
        System.out.println("--------> CARRERA DE VEHÍCULOS <--------");

        Race race1 = new Race();
        race1.startRace();
        race1.stopRace();
    }
}
