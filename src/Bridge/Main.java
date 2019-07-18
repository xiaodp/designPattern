package Bridge;

public class Main {
    public static void main(String[] args) {


        newDisplay a1 = new newDisplay(new AscDisplay("|","#","-"));
        a1.ascDisplay();
    }
}
