package FactoryMethod.example.windows;

import FactoryMethod.example.Button;
import FactoryMethod.example.Dialog;
import FactoryMethod.example.windows.WindowsButton;

/**
 * Windows Dialog will produce Windows buttons.
 */
public class WindowsDialog extends Dialog {
    @Override
    public Button createButton() {
        return new WindowsButton();
    }
}
