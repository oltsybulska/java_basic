package controller;

import model.Sex;
import model.Student;

public class StudentCreator {
    public Student createStudent(String firstName, String lastName, Sex sex) {
        return new Student(firstName, lastName, sex);
    }
}