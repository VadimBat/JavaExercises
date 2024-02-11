package FactoryMethod.example.html;

import FactoryMethod.example.Button;
import FactoryMethod.example.Dialog;
import FactoryMethod.example.html.HtmlButton;

/**
 * HTML Dialog will produce HTML buttons.
 */
public class HtmlDialog extends Dialog {
    @Override
    public Button createButton() {
        return new HtmlButton();
    }
}
