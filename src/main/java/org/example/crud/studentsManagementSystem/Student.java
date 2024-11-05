package org.example.crud.studentsManagementSystem;

public class Student {
    private String id;
    private String name;
    private int age;
    private String course;
    private String address;

    public Student(String id, String name, int age, String course, String address) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.course = course;
        this.address = address;
    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", course='" + course + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}


