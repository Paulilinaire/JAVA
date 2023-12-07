package org.example.visitor;

public interface Visitor {
    void visit(Keyboard keyboard);
    void visit(Monitor monitor);
}
