package ChainOfResponsibility;

public class Trouble {
    private String description;
    private int num;

    public Trouble(String description,int num){
        this.num = num;
        this.description = description;
    }

    public int getNum() {
        return num;
    }

    @Override
    public String toString() {
        return description ;
    }
}
