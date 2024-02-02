package checkbox.impl;

import checkbox.CheckBox;

/**
 * All products families have the same varieties (MacOS/Windows).
 * <p>
 * This is another variant of a checkbox.
 */
public class WindowsCheckbox implements CheckBox {
    @Override
    public void paint() {
        System.out.println("WindowsCheckbox created.");
    }
}
