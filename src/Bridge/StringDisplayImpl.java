package Bridge;

public class StringDisplayImpl extends DisplayImpl {
    String string;

    public StringDisplayImpl(String string){
        this.string = string;
    }


    @Override
    public void rawOpen() {
        printLine();
    }
    @Override
    public void rawPrint() {
        System.out.println("|" + string + "|");
    }

    @Override
    public void rawClose() {
        printLine();
    }
    private void printLine(){
        System.out.print("+");
        for (int i = 0;i < string.getBytes().length;i++){
            System.out.print("-");
        }
        System.out.println("+");
    }

}
