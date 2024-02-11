package FactoryMethod.example.html;

import FactoryMethod.example.Button;

/**
 * HTML button implementation.
 */
public class HtmlButton implements Button {

    @Override
    public void render() {
        System.out.println("<button>Test button.Button</button>");
        onClick();
    }

    @Override
    public void onClick() {
        System.out.println("Click! button.Button says - 'Hello World!'");
    }
}
