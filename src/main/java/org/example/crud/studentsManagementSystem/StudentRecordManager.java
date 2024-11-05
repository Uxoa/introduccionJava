package org.example.crud.studentsManagementSystem;

import java.util.ArrayList;
import java.util.List;

public class StudentRecordManager {
    // creo una lista llamada students que almacena todos los registros de estudiantes
    private List<Student> students = new ArrayList<>();

    // creo un método addStudent que agrega umn nuevo estudiante a la lista
    public void addStudent(Student student){
      students.add(student);
        System.out.println("Estudiante agregado exitosamente.");

    }

    // creo un método para mostrar todos los estudiantes
    public void showAllStudents(){
        if (students.isEmpty()){
            System.out.println("No hay estudiantes en la lista");
        } else {
            for (Student student : students) {
                System.out.println(student);
            }
        }
    }


    // creo un método para buscar a los estudiantes por su ID
    public void searchStudentById(String id){
        // Recorro la lista de estudiantes uno por uno
        for (Student student : students) {
            // Comparo el id del estudiante actual con el id buscado
            if (student.getId().equals(id)) {
                // Si coincide, muestro la información del estudiante y termino el método
                System.out.println("Estudiante encontrado: " + student);
                return;
            }
        }
        // Si recorre toda la lista y no encuentra el id, muestra este mensaje
        System.out.println("Estudiante con ID " + id + " no encontrado.");

    }

    public void deleteStudentById(String id) {
        // Recorrer la lista de estudiantes
        for (Student student : students) {
            // Compruebo si el ID del estudiante coincide con el ID a eliminar
            if (student.getId().equals(id)) {
                // Si coincide, elimino al estudiante y muestro un mensaje
                students.remove(student);
                System.out.println("Estudiante con ID " + id + " eliminado exitosamente.");
                return; // Salir del método después de eliminar
            }
        }
        // Si no se encuentra el ID, mostrar mensaje
        System.out.println("Estudiante con ID " + id + " no encontrado.");
    }


}
