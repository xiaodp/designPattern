package Observer;

public class DigitObserver implements Observer {
    @Override
    public void update(NumberGenerator numberGenerator) {
        int num = numberGenerator.getNum();
        System.out.println(num);
        try{
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
