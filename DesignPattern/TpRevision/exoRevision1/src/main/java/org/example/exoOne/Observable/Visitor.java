package org.example.exoOne.Observable;

public class Visitor implements VisitorObserver<String>{
    private String name;

    public Visitor(String name) {
        this.name = name;
    }

    @Override
    public void update(String event) {
        System.out.println(name + " received notification: " + event);
    }
}
