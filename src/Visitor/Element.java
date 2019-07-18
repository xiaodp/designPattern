package Visitor;

public interface Element {
    abstract void accept(Visitor visitor);
}
