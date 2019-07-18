package Observer;

import java.util.ArrayList;
import java.util.Iterator;

public abstract class NumberGenerator {


    protected int num;
    private ArrayList observers = new ArrayList();
    public abstract int getNum();
    public abstract void excute();

    public void addObserver(Observer observer){
        observers.add(observer);
    }
    public void removeObserver(Observer observer){
        observers.remove(observer);
    }
    public void notifyAllObservers(){
        Iterator iterator = observers.iterator();
        while(iterator.hasNext()){
            Observer observer = (Observer) iterator.next();
            observer.update(this);
        }

    }


}
