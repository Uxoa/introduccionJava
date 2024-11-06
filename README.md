# Introducción a Java

He creado esta recopilación de ejercicios hechos en clase y otros ejercicios encontrados por la web para poder practicar Java. 

Aquí podrás encontrar ejercicios básicos de programación orientada a objetos, estructuras de control, manejo de colecciones y más, organizados en diferentes paquetes según el tema.

Espero que, como a mí, estos ejercicios te sean útiles para mejorar tus habilidades en Java.

## Índice

1. [Métodos](#métodos)
   - [Ejercicio: Descuento en Supermercado](#ejercicio-descuento-en-supermercado)
   - [Ejercicio: Tabla de Multiplicar](#ejercicio-tabla-de-multiplicar)
2. [Estructuras de Control](#estructuras-de-control)
   - [Ejercicio: Control de Flujo If/Else](#ejercicio-control-de-flujo-ifelse)
   - [Ejercicio: Bucles For y While](#ejercicio-bucles-for-y-while)
3. [Colecciones](#colecciones)
   - [Ejercicio: Manejo de ArrayList](#ejercicio-manejo-de-arraylist)
   - [Ejercicio: Mapas y Diccionarios](#ejercicio-mapas-y-diccionarios)
4. [POO - Programación Orientada a Objetos](#poo---programación-orientada-a-objetos)
   - [Ejercicio: Clases y Objetos](#ejercicio-clases-y-objetos)
   - [Ejercicio: Encapsulamiento](#ejercicio-encapsulamiento)
5. [Herencia y Polimorfismo con ArrayList](#herencia-y-polimorfismo-con-arraylist)
   - [Ejercicio: Gestión de Empleados](#ejercicio-gestión-de-empleados)
   - [Ejercicio: Vehículos y Herencia](#ejercicio-vehículos-y-herencia)
6. [Excepciones](#excepciones)
   - [Ejercicio: Manejo de Excepciones](#ejercicio-manejo-de-excepciones)
   - [Ejercicio: Excepciones Personalizadas](#ejercicio-excepciones-personalizadas)

## Descripción de Ejercicios

### Métodos

En este paquete encontrarás ejercicios sobre el uso de métodos en Java, incluyendo entrada de datos y cálculos básicos.

- **Ejercicio: Descuento en Supermercado**  
  Este ejercicio simula una compra en un supermercado. Si el total de la compra supera los 1000 euros y el producto pertenece a las categorías de "Lechuga" o "Calabacín", se aplica un descuento del 20%. El programa muestra el nombre del cliente, el producto, el precio, la cantidad, el descuento y el total a pagar.  
  [Ver código](src/main/java/org/example/metodos/DescuentoSuper.java)

- **Ejercicio: Tabla de Multiplicar**  
  Este ejercicio muestra la tabla de multiplicar de un número ingresado por el usuario. Usa un bucle para mostrar el resultado de multiplicar el número por cada valor del 1 al 10.  
  [Ver código](src/main/java/org/example/metodos/TablaMultiplicar.java)

### Estructuras de Control

En este paquete se exploran estructuras de control como `if`, `else`, `for`, y `while`.

- **Ejercicio: Control de Flujo If/Else**  
  Este ejercicio evalúa una condición introducida por el usuario y muestra un mensaje basado en los valores ingresados.  
  [Ver código](src/main/java/org/example/estructurasControl/IfElse.java)

- **Ejercicio: Bucles For y While**  
  Practica con bucles `for` y `while` para ejecutar acciones repetitivas según diferentes condiciones.  
  [Ver código](src/main/java/org/example/estructurasControl/Bucles.java)

### Colecciones

Este paquete incluye ejercicios para el manejo de colecciones como `ArrayList`, `HashMap`, y `HashSet`.

- **Ejercicio: Manejo de ArrayList**  
  Aprende a añadir, eliminar y recorrer elementos en un `ArrayList`.  
  [Ver código](src/main/java/org/example/colecciones/ManejoArrayList.java)

- **Ejercicio: Mapas y Diccionarios**  
  Usa `HashMap` para almacenar pares clave-valor y realiza operaciones de búsqueda y actualización.  
  [Ver código](src/main/java/org/example/colecciones/Mapas.java)

### POO - Programación Orientada a Objetos

En este paquete se abordan conceptos fundamentales de POO, como clases, objetos, y encapsulamiento.

- **Ejercicio: Clases y Objetos**  
  Crea clases básicas y aprende a instanciar objetos con diferentes atributos y métodos.  
  [Ver código](src/main/java/org/example/poo/ClasesYObjetos.java)

- **Ejercicio: Encapsulamiento**  
  Ejercicio sobre encapsulación de datos, con métodos `get` y `set` para acceder y modificar los atributos de una clase.  
  [Ver código](src/main/java/org/example/poo/Encapsulamiento.java)

### Herencia y Polimorfismo con ArrayList

Este paquete contiene ejercicios de herencia y polimorfismo en Java, usando `ArrayList` para almacenar y gestionar diferentes tipos de empleados.

- **Ejercicio: Gestión de Empleados**  
  En este ejercicio, se implementa una estructura de clases para gestionar empleados. La clase `Empleado` es abstracta y sirve como base para `EmpleadoFijo` (con salario fijo) y `EmpleadoPorHoras` (con salario basado en horas trabajadas). Se usa polimorfismo para calcular y mostrar el salario de cada empleado en una lista de `ArrayList`.  
  [Ver código](src/main/java/org/example/HerenciaYPoliConArrayList/Main.java)

- **Ejercicio: Vehículos y Herencia**  
  Simula una estructura de herencia donde diferentes tipos de vehículos (`Car`, `Moto`, `Camion`) heredan de una clase base `Vehiculo` y tienen diferentes formas de calcular el consumo de combustible.  
  [Ver código](src/main/java/org/example/HerenciaYPoliConArrayList/Vehiculos.java)

### Excepciones

Ejercicios enfocados en el manejo de excepciones para hacer el código más robusto y seguro.

- **Ejercicio: Manejo de Excepciones**  
  Aprende a manejar excepciones comunes como `NullPointerException`, `ArrayIndexOutOfBoundsException`, entre otras.  
  [Ver código](src/main/java/org/example/excepciones/ManejoExcepciones.java)

- **Ejercicio: Excepciones Personalizadas**  
  Crea tus propias excepciones para manejar casos específicos en tus aplicaciones.  
  [Ver código](src/main/java/org/example/excepciones/ExcepcionesPersonalizadas.java)

## Clonar el Repositorio

Si quieres tener una copia local de estos ejercicios, puedes clonar el repositorio usando el siguiente comando:

```bash
git clone https://github.com/Uxoa/introduccionJava.git

