package org.example.visitor;

public class Keyboard implements PartElement{
    @Override
    public void accept(Visitor visitor) {
        System.out.println("j'accepte le visiteur");
    }
}
