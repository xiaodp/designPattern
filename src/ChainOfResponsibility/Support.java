package ChainOfResponsibility;

public abstract class Support {
    String name;
    Support next;
    int num;
    public Support(String name,int num){
        this.name = name;
        this.num  = num;
    }

    public Support setNext(Support next) {
        this.next = next;
        return this;
    }

    public  void support(Trouble trouble){
        if (resolve(trouble)){
            System.out.println(trouble.toString() + " is solved by " + this );
        }else if(next != null){
            next.support(trouble);
        }else {
            System.out.println(trouble.toString() + " can't be resolved ");
        }
    }

    abstract boolean resolve(Trouble trouble);

    @Override
    public String toString() {
        return name;
    }
}
