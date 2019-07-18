package Bridge;

public  class Display {

    DisplayImpl displayImpl;

    public Display(DisplayImpl displayImpl){
        this.displayImpl = displayImpl;
    }

    public void open(){
        displayImpl.rawOpen();
    }

    public void print(){
        displayImpl.rawPrint();
    }

    public void close(){
        displayImpl.rawClose();
    }
    public void disPlay(){
        open();
        print();
        close();
    }
}
