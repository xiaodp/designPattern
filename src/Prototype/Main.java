package Prototype;

public class Main {
    public static void main(String[] args) {

        UnderLine underLinePrototype = new UnderLine();
        Manager manager = new Manager();
        manager.register("underLinePrototype",underLinePrototype);

        Product p = manager.getProduct("underLinePrototype");
        p.use();
    }
}
