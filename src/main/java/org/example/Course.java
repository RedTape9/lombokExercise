package org.example;

import lombok.Builder;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;
@Data
@Builder


public class Course {

    private String id;
    private String name;
    private Teacher teacher;
    private List<Student> students;
}
