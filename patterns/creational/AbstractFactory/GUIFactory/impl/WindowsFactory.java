package GUIFactory.impl;

import GUIFactory.GUIFactory;
import button.Button;
import button.impl.WindowsButton;
import checkbox.CheckBox;
import checkbox.impl.WindowsCheckbox;

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
