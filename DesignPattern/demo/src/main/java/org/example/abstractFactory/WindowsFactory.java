package org.example.abstractFactory;

public class WindowsFactory extends GUIFactory {

    @Override
    Button createButton() {
        return new WindowsButton();
    }

    @Override
    Checkbox createCheckBox() {
        return new WindowsCheckBox();
    }
}
