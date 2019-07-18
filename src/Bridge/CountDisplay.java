package Bridge;

public class CountDisplay extends Display {

    public CountDisplay(DisplayImpl displayImpl){
        super(displayImpl);
    }

    public void multiDisplay(){
        open();
        for(int i=0; i < 5;i++){
            print();
        }
        close();
    }
}
