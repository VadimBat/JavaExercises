package FactoryMethod;

/**
 * Java. Factory method pattern example
 *
 */

abstract class Product {
}

class ConcreteProductA extends Product {
}

class ConcreteProductB extends Product {
}

abstract class Creator {
    public abstract Product factoryMethod();
}

class ConcreteCreatorA extends Creator {
    @Override
    public Product factoryMethod() {
        return new ConcreteProductA();
    }
}

class ConcreteCreatorB extends Creator {
    @Override
    public Product factoryMethod() {
        return new ConcreteProductB();
    }
}

public class FactoryMethod {
    public static void main(String[] args) {

        // an array of creators
        Creator[] creators = {new ConcreteCreatorA(), new ConcreteCreatorB()};

        // iterate over creators and create products
        for (Creator creator : creators) {
            Product product = creator.factoryMethod();
            System.out.printf("Created {%s}\n", product.getClass());
        }
    }
}