package AbstractFactory;

import AbstractFactory.GUIFactory.GUIFactory;
import AbstractFactory.button.Button;
import AbstractFactory.checkbox.CheckBox;


/**
 * Factory users don't care which concrete factory they use since they work with
 * factories and products through abstract interfaces.
 */
public class Application {
    private Button button;
    private CheckBox checkbox;

    public Application(GUIFactory factory) {
        button = factory.createButton();
        checkbox = factory.createCheckbox();
    }

    public void paint() {
        button.paint();
        checkbox.paint();
    }
}
