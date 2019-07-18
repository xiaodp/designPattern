package Bridge;

public class AscDisplay extends DisplayImpl {
    String open;
    String close;
    String content;
    public AscDisplay(String open,String content,String close){
        this.open = open;
        this.content = content;
        this.close = close;
    }

    @Override
    public void rawOpen() {
        System.out.print(open);
    }

    @Override
    public void rawPrint() {
        System.out.print(content);
    }

    @Override
    public void rawClose() {
        System.out.println(close);
    }
}
