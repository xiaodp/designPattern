package Observer;

import java.util.Random;

public class RandomNumberGenerator extends NumberGenerator {
    private Random random = new Random();

    @Override
    public int getNum() {
        return num;
    }

    @Override
    public void excute() {
//        for(int i = 0;i < 20;i++){
            num = random.nextInt(50);
            notifyAllObservers();
//        }
    }
}
