package model;

public class University {
    private String name;
    private Human head;

    public University(String name, Human head) {
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
