package Template;

public class Main {


    public static void main(String[] args) {
        AbstractDisplay charDisplay = new CharDisplay('A');
        AbstractDisplay stringDisplay = new StringDisplay("Hello");
        charDisplay.display();
        stringDisplay.display();
    }
}
