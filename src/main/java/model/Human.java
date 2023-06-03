package model;

public abstract class Human {
    protected String firstName;
    protected String lastName;
    protected Sex sex;

    public Human(String firstName, String lastName, Sex sex) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.sex = sex;
    }

    public abstract String getRole();

    public String getFullName() {
        return firstName + " " + lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Sex getSex() {
        return sex;
    }

}
