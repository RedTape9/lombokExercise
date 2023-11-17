package org.example;

import java.util.ArrayList;
import java.util.List;

public class UniversityService {

    public double calculateAverageGrade(Course course) {
        double sum = 0;
        for (Student student : course.getStudents()) {
            sum += student.getGrade();
        }
        return sum / course.getStudents().size();
    }

    public double calculateAverageGrade(University uni) {
        double sum = 0;
        int count = 0;
        for (Course course : uni.courses()) {
            for (Student student : course.getStudents()) {
                sum += student.getGrade();
                count++;
            }
        }
        return sum / count;
    }

    public List<Student> getAllStudentsWithGradeTwoOrBetter(University uni) {
        List<Student> foundedStudents = new ArrayList<>();
        uni.courses()
                .forEach(course -> {
                    course
                            .getStudents()
                            .forEach(student -> {
                                if (student.getGrade() <= 2 && student.getGrade() > 0)
                                    foundedStudents.add(student);
                            });
                });
        return foundedStudents;
    }



}
