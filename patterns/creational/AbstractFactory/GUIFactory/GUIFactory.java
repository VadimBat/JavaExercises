package AbstractFactory.GUIFactory;

import AbstractFactory.button.Button;
import AbstractFactory.checkbox.CheckBox;

/**
 * Abstract factory knows about all (abstract) product types.
 */
public interface GUIFactory {
    Button createButton();

    CheckBox createCheckbox();
}
