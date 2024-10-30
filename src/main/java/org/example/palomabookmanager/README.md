# Tech Books Manager App

## Objetivos de aprendizaje

- Introducirnos a Java y a la OOP
- Desarrollar un proyecto incremental
- Empezar a aplicar técnicas de refactorización
- Acercarnos poco a poco a la arquitectura y a patrones de diseño usados en Spring
- Incluir algunos tests unitarios

## **Descripción General**

El proyecto consiste en crear una aplicación de consola en Java que permita a los usuarios gestionar una colección de libros técnicos de programación.

La aplicación debe ofrecer una interfaz interactiva en la consola que permita realizar las siguientes operaciones:

1. **Ver todos los libros**
2. **Añadir un nuevo libro**
3. **Eliminar un libro**
4. **Salir de la aplicación**

---

# User Stories

### **Historia de Usuario 1: Ver el Menú Principal**

**Como** usuario, **quiero** ver un menú en la consola con opciones para añadir, ver y eliminar libros, **para** poder gestionar mi colección de libros técnicos de programación.

**Criterios de Aceptación:**

- **Escenario 1:** Al iniciar la aplicación, se muestra un menú con las siguientes opciones:

    ```markdown
    Gestor de Libros Técnicos de Programación
    1. Añadir libro
    2. Ver todos los libros
    3. Eliminar libro
    4. Cambiar repositorio
    5. Salir
    Seleccione una opción:
    ```

- **Escenario 2:** Si el usuario ingresa un número válido se debe mostrar la opción requerida y volver a mostrar el menú principal

    ```bash
    Opción 1: Ver todos los libros:
    ---
    Gestor de Libros Técnicos de Programación
    1. Añadir libro
    2. Ver todos los libros
    3. Eliminar libro
    4. Cambiar repositorio
    5. Salir
    Seleccione una opción:
    ```

- **Escenario 3:** Si el usuario ingresa una opción inválida (por ejemplo, un número fuera del rango o un carácter no numérico), el sistema mostrará el mensaje:

    ```bash
    Opción inválida. Por favor, seleccione una opción del 1 al 5.
    ---
    Gestor de Libros Técnicos de Programación
    1. Añadir libro
    2. Ver todos los libros
    3. Eliminar libro
    4. Cambiar repositorio
    5. Salir
    Seleccione una opción:
    ```

  Luego, el menú se mostrará nuevamente.


---

### **Historia de Usuario 2: Ver Todos los Libros**

**Como** usuario, **quiero** poder ver una lista de todos los libros almacenados, **para** revisar los libros que tengo en mi colección.

**Criterios de Aceptación:**

- **Escenario 1:** Desde el menú principal, al seleccionar la opción "2. Ver todos los libros", el sistema mostrará una lista de los libros con la siguiente información:

    ```yaml
    
    Lista de Libros:
    ISBN: A123, Título: Effective Java, Autor: Joshua Bloch
    ```

- **Escenario 2:** Si no hay libros en la colección, el sistema mostrará el mensaje:

    ```yaml
    No hay libros en la colección.
    ```

- **Escenario 3:** Después de mostrar la lista o el mensaje, el sistema volverá al menú principal.

---

### **Historia de Usuario 3: Añadir un Nuevo Libro**

**Como** usuario, **quiero** poder añadir un nuevo libro proporcionando el título, autor e ISBN (una letra y tres números), **para** aumentar mi colección de libros técnicos de programación.

**Criterios de Aceptación:**

- **Escenario 1:** Desde el menú principal, al seleccionar la opción "1. Añadir libro", el sistema me solicitará:

    ```java
    Ingrese el título:
    Ingrese el autor:
    Ingrese el ISBN (una letra seguida de tres números, por ejemplo, A123):
    ```

- **Escenario 2:** Si proporciono todos los datos correctamente y el ISBN tiene el formato correcto (una letra seguida de tres números), el libro se añadirá al repositorio y se mostrará el mensaje:

    ```css
    Libro añadido con éxito.
    ```

- **Escenario 3:** Si dejo algún campo vacío, el sistema me notificará:

    ```
    Todos los campos son obligatorios. Por favor, intente nuevamente.
    ```

- **Escenario 4:** Si intento añadir un libro con un ISBN que ya existe en la colección, el sistema mostrará:

    ```css
    Ya existe un libro con ese ISBN. No se puede añadir el libro.
    ```

- **Escenario 5:** Después de añadir el libro o en caso de error, el sistema volverá al menú principal.

---

### **Historia de Usuario 4: Eliminar un Libro**

**Como** usuario, **quiero** poder eliminar un libro de mi colección proporcionando el ISBN, **para** mantener mi lista de libros organizada y relevante.

**Criterios de Aceptación:**

- **Escenario 1:** Desde el menú principal, al seleccionar la opción "3. Eliminar libro", el sistema me solicitará:

    ```css
    Ingrese el ISBN del libro a eliminar (una letra seguida de tres números, por ejemplo, A123):
    ```

- **Escenario 2:** Si ingreso un ISBN que corresponde a un libro en la colección, el libro se eliminará y se mostrará el mensaje:

    ```
    Libro eliminado con éxito.
    ```

- **Escenario 3:** Si el ISBN ingresado no cumple con el formato requerido, el sistema mostrará:

    ```scss
    ISBN inválido. Debe ser una letra seguida de tres números (por ejemplo, A123).
    ```

- **Escenario 4:** Después de eliminar un libro o en caso de error, el sistema volverá al menú principal.