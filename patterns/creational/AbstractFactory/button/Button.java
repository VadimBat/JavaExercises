package AbstractFactory.button;

/**
 * Abstract Factory assumes that you have several families of products,
 * structured into separate class hierarchies (button.Button/Checkbox). All products of
 * the same family have the common interface.
 * <p>
 * This is the common interface for buttons family.
 */
public interface Button {
    void paint();
}
