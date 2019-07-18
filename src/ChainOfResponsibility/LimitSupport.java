package ChainOfResponsibility;

public class LimitSupport extends Support{


    public LimitSupport(String name, int num) {
        super(name, num);
    }

    @Override
    boolean resolve(Trouble trouble) {
        if(trouble.getNum() < num ){
            return true;
        }
        return false;

    }
}
