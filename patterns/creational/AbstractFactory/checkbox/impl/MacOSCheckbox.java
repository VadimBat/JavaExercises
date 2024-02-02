package checkbox.impl;

import checkbox.CheckBox;

/**
 * All products families have the same varieties (MacOS/Windows).
 * <p>
 * This is a variant of a checkbox.
 */
public class MacOSCheckbox implements CheckBox {
    @Override
    public void paint() {
        System.out.println("MacOsCheckbox created");
    }
}
