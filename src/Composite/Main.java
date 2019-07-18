package Composite;

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
//           root.printList("root:");
           File local = new File("local",300);
           bin.add(local);
           System.out.println(local.getFull());
       }catch (FileTreatementException e){
           e.printStackTrace();
       }

    }


}
