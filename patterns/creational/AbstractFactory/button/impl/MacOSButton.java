package button.impl;

import button.Button;

/**
 * All products families have the same varieties (MacOS/Windows).
 * <p>
 * This is a macOS variant of a button.
 */
public class MacOSButton implements Button {
    @Override
    public void paint() {
        System.out.println("button.impl.MacOSButton created.");
    }
}
