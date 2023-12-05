package org.example.abstractFactory;

public class MacFactory extends GUIFactory{

    @Override
    Button createButton() {
        return new MacButton();
    }

    @Override
    Checkbox createCheckBox() {
        return new MacCheckBox();
    }
}
