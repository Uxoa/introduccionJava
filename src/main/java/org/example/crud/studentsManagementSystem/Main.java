package org.example.crud.studentsManagementSystem;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        StudentRecordManager manager = new StudentRecordManager();

//        Student student1 = new Student("1", "Paloma", 53, "java", "Nieles");
//        System.out.println("Estudiantes: \n");
//        manager.addStudent(student1);
//        manager.showAllStudents();

        Scanner scanner = new Scanner(System.in);

        while ( true ){
            System.out.println("----> Elige una opción <-----");
            System.out.println("1. Agregar Estudiante");
            System.out.println("2. Mostrar Todos los Estudiantes");
            System.out.println("3. Buscar Estudiante por ID");
            System.out.println("4. Eliminar Estudiante por ID");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice){
                case 1:
                    System.out.print("Id: ");
                    String id = scanner.nextLine();
                    System.out.print("Nombre: ");
                    String name = scanner.nextLine();
                    System.out.print("Edad: ");
                    int age = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Curso que realiza: ");
                    String course = scanner.nextLine();
                    System.out.print("Lugar de residencia: ");
                    String address = scanner.nextLine();

                    Student student = new Student(id, name, age, course, address);
                    manager.addStudent(student);
                    break;

                case 2 :
                    manager.showAllStudents();
                    break;

                case 3 :
                    System.out.println("Busca a un estudiante por su ID: ");
                    id = scanner.nextLine();
                    manager.searchStudentById(id);
                    break;

                case 4 :
                    System.out.println("Elimina a un estudiante por su ID: ");
                    id = scanner.nextLine();
                    manager.deleteStudentById(id);
                    break;

                case 5 :
                    System.out.println("Saliendo del programa, gracias!");
                    scanner.close();
                    return;

            }
        }


    }
}
