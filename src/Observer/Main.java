package Observer;

public class Main {
    public static void main(String[] args) {
        Observer digitObserver = new DigitObserver();
        Observer grapgObserver = new GrapObserver();
        Observer r = new RecurrentObserver();
        NumberGenerator randomNumGen = new RandomNumberGenerator();
//        randomNumGen.addObserver(digitObserver);
//        randomNumGen.addObserver(grapgObserver);
        randomNumGen.addObserver(r);
        randomNumGen.excute();
    }
}
