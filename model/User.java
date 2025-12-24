package model;

public class User {
    protected String name;

    public User(String name) {
        this.name = name;
    }

    public void role() {
        System.out.println("User");
    }
}
