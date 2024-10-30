# Ex. Java Clases (Coche)

Crea un programa en Java que:

1. **Defina** una clase llamada `Coche` que represente las características básicas de un coche.
2. **Incluya** en la clase `Coche`:
    - **Atributos** (variables de instancia):
        - `marca` (String)
        - `modelo` (String)
        - `año` (int)
        - `kilometraje` (double)
    - **Métodos**:
        - Un **constructor** que inicialice los atributos `marca`, `modelo` y `año`.
        - Un método `conducir(double km)` que incremente el kilometraje en la cantidad de kilómetros `km` proporcionada.
        - Un método `mostrarInformación()` que imprima en la consola la información actual del coche.
3. **En el método `main`** de otra clase (por ejemplo, `Principal`):
    - **Crear** un objeto de la clase `Coche` con los datos que desees.
    - **Llamar** al método `mostrarInformación()` para mostrar los datos iniciales.
    - **Simular** que el coche conduce una cierta cantidad de kilómetros utilizando el método `conducir(double km)`.
    - **Volver a llamar** al método `mostrarInformación()` para mostrar los datos actualizados.
