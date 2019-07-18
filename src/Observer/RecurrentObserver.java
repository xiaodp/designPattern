package Observer;

public class RecurrentObserver implements Observer {
    @Override
    public void update(NumberGenerator numberGenerator) {
        System.out.println(numberGenerator.getNum());
        numberGenerator.excute();

    }
}
