package model;

public class Student extends Human {
    public Student(String firstName, String lastName, Sex sex) {
        super(firstName, lastName, sex);
    }

    @Override
    public String getRole() {
        return "Student";
    }
}