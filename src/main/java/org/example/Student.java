package org.example;
import lombok.Builder;
import lombok.Data;

@Data
@Builder

public class Student {
    private String id;
    private String name;
    private String address;
    private int grade;
}
