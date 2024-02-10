package AbstractFactory.button.impl;

import AbstractFactory.button.Button;

/**
 * All products families have the same varieties (MacOS/Windows).
 * <p>
 * This is Windows variant of a button.
 */
public class WindowsButton implements Button {
    @Override
    public void paint() {
        System.out.println("button.impl.WindowsButton created.");
    }
}
