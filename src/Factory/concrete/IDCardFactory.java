package Factory.concrete;

import Factory.framework.Factory;
import Factory.framework.Product;

import java.util.ArrayList;
import java.util.List;

public class IDCardFactory extends Factory {

    private List users = new ArrayList();
    @Override
    protected Product createProduct(String owner) {
        return new IDCard(owner);
    }

    @Override
    protected void registerProduct(Product p) {
        users.add(((IDCard)p).getOwner());
    }

    public List getUsers(){
        return users;
    }
}
