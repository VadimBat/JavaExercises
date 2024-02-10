package AbstractFactory.GUIFactory.impl;

import AbstractFactory.GUIFactory.GUIFactory;
import AbstractFactory.button.Button;
import AbstractFactory.button.impl.MacOSButton;
import AbstractFactory.checkbox.CheckBox;
import AbstractFactory.checkbox.impl.MacOSCheckbox;

/**
 * Each concrete factory extends basic factory and responsible for creating
 * products of a single variety.
 */
public class MacOSFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new MacOSButton();
    }

    @Override
    public CheckBox createCheckbox() {
        return new MacOSCheckbox();
    }
}
