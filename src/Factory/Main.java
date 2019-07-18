package Factory;

import Factory.concrete.IDCard;
import Factory.concrete.IDCardFactory;
import Factory.framework.Factory;
import Factory.framework.Product;

public class Main {

    public static void main(String[] args) {
        Factory factory = new IDCardFactory();
        Product idCard1 = factory.create("小明");
        Product idCard2 = factory.create("小红");
        Product idCard3 = factory.create("小刚");
        Product idCard4 = factory.create("小杰");
        idCard1.use();
        idCard2.use();
        idCard3.use();
        idCard4.use();
    }
}
