package Visitor;

import java.util.Iterator;

public class ListVisitor extends Visitor {
    String currentdir = "";
    @Override
    public void visit(File file) {
        System.out.println(currentdir + "/" + file);
    }

    @Override
    public void visit(Directory directory) {
        System.out.println(currentdir + "/" + directory);
        currentdir = currentdir + "/" + directory.getName();
        String saveCurr = currentdir;
        Iterator iterator = directory.iterator();
        while(iterator.hasNext()){
            Entry entry = (Entry)iterator.next();
            entry.accept(this);
        }
        currentdir =saveCurr;
    }
}
