package Visitor;

public class Main {

    public static void main(String[] args) {
       try{
           System.out.println("Making root entries...");
           Directory root = new Directory("root");
           Directory bin = new Directory("bin");
           Directory tmp = new Directory("tmp");
           Directory usr = new Directory("usr");
           root.add(bin);
           root.add(tmp);
           root.add(usr);
           bin.add(new File("vi",100));
           bin.add(new File("latex",200));
           File local = new File("local",300);
           bin.add(local);
           Visitor visitor = new ListVisitor();
            root.accept(visitor);
       }catch (FileTreatementException e){
           e.printStackTrace();
       }

    }


}
