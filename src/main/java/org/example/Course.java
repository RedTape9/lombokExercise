package org.example;

import lombok.Builder;

import lombok.Value;

import java.util.List;
@Value
@Builder


public class Course {

    String id;
    String name;
    Teacher teacher;
    List<Student> students;
}
