package ChainOfResponsibility;

public class SpecilSupport extends Support {



    public SpecilSupport(String name, int num) {
        super(name, num);
    }


    @Override
    boolean resolve(Trouble trouble) {
        return (trouble.getNum() == num)? true:false;
    }
}
