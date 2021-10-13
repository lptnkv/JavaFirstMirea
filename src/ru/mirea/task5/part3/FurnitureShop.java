package ru.mirea.task5.part3;

import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

public class FurnitureShop {
    Map<Furniture, Integer> goods = new TreeMap<>();

    public FurnitureShop() {
        for (int i = 0; i < 10; i++){
            this.addProduct(new Sofa());
            this.addProduct(new Table());
        }
    }

    public void addProduct(Furniture product){
        int count = goods.getOrDefault(product, 0);
        goods.put(product, count + 1);
    }

    public boolean sellProduct(Furniture product){
        int count = goods.getOrDefault(product, 0);
        if (count > 0){
            goods.put(product, count - 1);
            product.sell();
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        String res = "";
        TreeSet<Furniture> keys = new TreeSet<>(goods.keySet());
        for (Furniture product : keys){
            res += product.toString() + " : " + goods.get(product) + '\n';
        }
        return res;
    }
}
