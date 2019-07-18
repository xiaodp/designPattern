package ChainOfResponsibility;

public class OddSupport extends Support {



    public OddSupport(String name, int num) {
        super(name, num);
    }

    @Override
    boolean resolve(Trouble trouble) {
        if(trouble.getNum() % 2 == 1){
            return true;
        }
        return false;
    }
}
