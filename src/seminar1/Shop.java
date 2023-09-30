package seminar1;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Shop implements Iterable<Product> {
    private List<Product> products;
    // Геттеры, сеттеры:
    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    /**
     * @return отсортированный по возрастанию и цене список продуктов
     */
    public void getSortedListProducts() {
        if (!products.isEmpty()) Collections.sort(products);
    }

    /**
     * @return самый дорогой продукт
     */
    public Product getMostExpensiveProduct() {
        getSortedListProducts();
        return products.get(0);
    }

    @Override
    public String toString() {
        return "Shop{" +
                "products=" + products +
                '}';
    }

    @Override
    public Iterator<Product> iterator() {
        Iterator<Product> it = new Iterator<Product>() {
            private int index = 0;
            @Override
            public boolean hasNext() {
                return index < products.size();
            }
            @Override
            public Product next() {
                return products.get(index++);
            }
        };
        return it;
    }
}