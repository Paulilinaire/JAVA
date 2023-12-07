package org.example.visitor;

public class UpdateVisitor implements Visitor{
    @Override
    public void visit(Keyboard keyboard) {
        System.out.println("keyboard ajouté");
    }

    @Override
    public void visit(Monitor monitor) {
        System.out.println("monitor ajouté");
    }
}
