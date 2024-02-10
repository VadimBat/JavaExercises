package AbstractFactory.GUIFactory.impl;

import AbstractFactory.GUIFactory.GUIFactory;
import AbstractFactory.button.Button;
import AbstractFactory.button.impl.WindowsButton;
import AbstractFactory.checkbox.CheckBox;
import AbstractFactory.checkbox.impl.WindowsCheckbox;

/**
 * Each concrete factory extends basic factory and responsible for creating
 * products of a single variety.
 */
public class WindowsFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public CheckBox createCheckbox() {
        return new WindowsCheckbox();
    }
}
