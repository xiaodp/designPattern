package Prototype;

import java.util.HashMap;

public class Manager {
    private HashMap map = new HashMap();

    public void register(String name,Product p){
        map.put(name,p);
    }

    public Product getProduct(String name){
        Product p = ((Product) map.get(name)).createClone();
        return p;
    }
}
