package Template;

public class StringDisplay extends AbstractDisplay {

    private String string;

    public StringDisplay(String s){
        this.string = s;
    }

    @Override
    public void open() {
        printLine();
    }

    @Override
    public void print() {
        System.out.println("|" + string + "|");
    }

    @Override
    public void close() {
        printLine();
    }

    private void printLine(){
        System.out.print("+--------+\n");
    }
}
