package Visitor;

import Iterator.Iterator;

public abstract class Entry implements Element{


    protected Entry parent;
    public abstract String getName();
    public abstract int getSize();
    public abstract void printList(String prefix);
    public void add(Entry entry) throws FileTreatementException {
        throw new FileTreatementException();

    }

    public String toString(){
        return getName() + "(" + getSize() + ")";
    }


}
