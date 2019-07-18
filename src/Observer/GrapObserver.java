package Observer;

public class GrapObserver implements Observer {


    @Override
    public void update(NumberGenerator numberGenerator) {
        int count = numberGenerator.getNum();
        for(int i = 0;i<count;i++){
            System.out.print('*');
        }
        System.out.println("");
        try{
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
