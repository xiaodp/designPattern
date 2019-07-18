package Bridge;

public class newDisplay extends Display {

    private int count = (int)(10 * Math.random() );

    public newDisplay(DisplayImpl displayImpl) {
        super(displayImpl);
    }

    public void ascDisplay(){
        for(int i = 0;i<count;i++){
            open();
            for(int j = 0;j<i;j++){
                print();
            }
            close();
        }
    }
}
