package Visitor;

public class File extends Entry {
    private String name;
    private int size;

    public File(String name,int size){
        this.name = name;
        this.size = size;
    }
    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    public void printList(String prefix) {
        System.out.println(prefix + "/" +this);
    }

    public String getFull(){

        StringBuffer stringBuffer = new StringBuffer();
        Entry entry = this;
        while(entry !=null){
            stringBuffer.insert(0,"/" + entry.getName());
            entry =entry.parent;
        }
        return stringBuffer.toString();
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
