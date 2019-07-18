package Composite;

import java.util.ArrayList;
import java.util.Iterator;

public class Directory extends Entry {

    private String name;
    public ArrayList content = new ArrayList();
    public Directory(String name){
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getSize() {
        int size = 0;
        Iterator iterator  = content.iterator();
        while(iterator.hasNext()){
            size += ((Entry)iterator.next()).getSize();
        }
        return size;
    }


    @Override
    public void add(Entry entry)  {
        content.add(entry);
        entry.parent = this;
    }

    @Override
    public void printList(String prefix) {
        System.out.println(prefix  + "/" +this);
        Iterator it = content.iterator();
        while(it.hasNext()){
            Entry entry = (Entry)it.next();
            entry.printList(prefix + "/" + name);
        }
    }
}
