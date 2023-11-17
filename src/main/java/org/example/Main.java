package org.example;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        Student student1 = Student.builder()
                .id("1")
                .name("Peter")
                .address("123 Street")
                .grade("A")
                .build();
        Student student2 = Student.builder()
                .id("2")
                .name("Ralph")
                .address("456 Street")
                .grade("B")
                .build();
        Student student3 = Student.builder()
                .id("3")
                .name("Marie")
                .address("789 Street")
                .grade("C")
                .build();

        Teacher teacher1 = Teacher.builder()
                .id("13")
                .name("Mr. Fischer")
                .subject("German")
                .build();

        Teacher teacher2 = Teacher.builder()
                .id("7")
                .name("Mrs. Lange")
                .subject("English")
                .build();

        Course course1 = Course.builder()
                .id("32")
                .name("Math")
                .teacher(teacher1)
                .students(List.of(student1))
                .build();

        Course course2 = Course.builder()
                .id("33")
                .name("English")
                .teacher(teacher2)
                .students(List.of(student2, student3))
                .build();

        System.out.println(course1.getStudents());
        System.out.println(course2);

    }
}