package seminar1;

import java.util.ArrayList;

public class Program {
    public static void main(String[] args) {
        Shop shop = new Shop();
        Product prod1 = new Product();
        prod1.setTitle("Яблоко");
        prod1.setCost(150);
        Product prod2 = new Product();
        prod2.setTitle("Томат");
        prod2.setCost(135);
        shop.setProducts(new ArrayList<>());
        shop.getProducts().add(prod1);
        shop.getProducts().add(prod2);
        System.out.println(shop);
        shop.getSortedListProducts();
        System.out.println(shop);
        System.out.println(shop.getMostExpensiveProduct());
    }
}
