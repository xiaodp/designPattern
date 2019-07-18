package Bridge;

public class randomDisplay extends CountDisplay {


    public randomDisplay(DisplayImpl displayImpl) {
        super(displayImpl);
    }

    public void randomDisplay(){
        open();
        int count = (int) (10 * Math.random());
        for (int i=0;i < count;i++){
            print();
        }
        close();

    }
}
