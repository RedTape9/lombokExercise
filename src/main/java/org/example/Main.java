package org.example;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        Student student1 = Student.builder()
                .id("1")
                .name("Peter")
                .address("123 Street")
                .grade(2)
                .build();
        Student student2 = Student.builder()
                .id("2")
                .name("Ralph")
                .address("456 Street")
                .grade(3)
                .build();
        Student student3 = Student.builder()
                .id("3")
                .name("Marie")
                .address("789 Street")
                .grade(1)
                .build();
        Student student4 = Student.builder()
                .id("4")
                .name("Sara")
                .address("1011 Street")
                .grade(2)
                .build();
        Student student5 = Student.builder()
                .id("5")
                .name("Lena")
                .address("1213 Street")
                .grade(1)
                .build();
        Student student6 = Student.builder()
                .id("6")
                .name("Lukas")
                .address("1415 Street")
                .grade(4)
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
                .students(List.of(student1, student4, student5))
                .build();

        Course course2 = Course.builder()
                .id("33")
                .name("English")
                .teacher(teacher2)
                .students(List.of(student2, student3, student6))
                .build();

        System.out.println(course1.getStudents());
        System.out.println(course2);

        University uni = University.builder()
                .id("1")
                .name("HAW")
                .courses(List.of(course1, course2))
                .build();

        UniversityService uniService = new UniversityService();

        System.out.printf("%.2f%n", uniService.calculateAverageGrade(course1));
        System.out.printf("%.2f%n", uniService.calculateAverageGrade(uni));
        System.out.println(uniService.getAllStudentsWithGradeTwoOrBetter(uni));

    }
}