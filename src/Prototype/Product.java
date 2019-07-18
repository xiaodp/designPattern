package Prototype;

public abstract class Product implements Cloneable {

    public abstract void use();

    public abstract Product createClone();

}
