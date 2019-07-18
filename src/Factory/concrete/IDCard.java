package Factory.concrete;

import Factory.framework.Product;

public class IDCard extends Product {
    private String owner;

    IDCard(String owner){
        System.out.println("正在生产" + owner + "的IDCard");
        this.owner = owner;
    }

    @Override
    public void use() {
        System.out.println("使用" + owner + "的IDCard");
    }

    public String getOwner() {
        return owner;
    }
}
