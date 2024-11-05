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


}
