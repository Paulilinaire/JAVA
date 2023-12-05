package org.example.abstractFactory;

public class Application {

    private Button button;
    private Checkbox checkbox;

    public Application(GUIFactory factory){
        button = factory.createButton();
        checkbox = factory.createCheckBox();
    }
}
