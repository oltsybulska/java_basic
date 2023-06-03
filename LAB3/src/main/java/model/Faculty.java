package model;

public class Faculty {
    private String name;
    private Human head;

    public Faculty(String name, Human head) {
        this.name = name;
        this.head = head;
    }

    public String getName() {
        return name;
    }

    public Human getHead() {
        return head;
    }

}
