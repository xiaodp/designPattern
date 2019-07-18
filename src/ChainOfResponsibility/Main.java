package ChainOfResponsibility;

public class Main {
    public static void main(String[] args) {
        Support D = new LimitSupport("D",450);
        Support A = new NoSupport("A",0);
        Support B = new OddSupport("B",0);
        Support C = new SpecilSupport("C",180);
        A.setNext(B.setNext(C.setNext(D)));
        for (int num = 0;num<500;num+=31) {
            Trouble trouble1 = new Trouble("trouble" + num,num);
            A.support(trouble1);
        }

    }
}
