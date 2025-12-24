package model;

public class Admin extends User {

    public Admin(String name) {
        super(name);
    }

    @Override
    public void role() {
        System.out.println("Admin");
    }
}