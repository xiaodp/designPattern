package Adapter;

public class Main {


    public static void main(String[] args) {
        Print p = new PrintAdapter("Hello");
        p.printStrong();
        p.printWeak();

    }

}
