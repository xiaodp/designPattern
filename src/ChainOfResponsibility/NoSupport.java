package ChainOfResponsibility;

public  class NoSupport extends Support {



    public NoSupport(String name, int num) {
        super(name, num);
    }

    @Override
    boolean resolve(Trouble trouble) {
        return false;
    }
}
