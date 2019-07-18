package Prototype;

public class UnderLine extends Product{


    @Override
    public void use() {
        System.out.println("Using UnderLine");
    }

    @Override
    public Product createClone() {
        Product p = null;
        try{
            p = (Product) clone();
        }catch (CloneNotSupportedException e){
            e.printStackTrace();
        }
        return p;
    }
}
