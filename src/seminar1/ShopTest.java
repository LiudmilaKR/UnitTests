package seminar1;

import org.assertj.core.api.Assertions;

import java.util.ArrayList;

import static org.assertj.core.api.Assertions.assertThat;
public class ShopTest {

    /*
     1. Проверить, что магазин хранит верный список продуктов (количество продуктов, состав корзины)
     2. Проверить, что магазин возвращает верный самый дорого продукт getMostExpensiveProduct
     3. Проверить, что магазин возвращает верный отсортированный по цене список продуктов
    */
    /**
     * Мы хотим улучшить функциональность нашего интернет-магазина. Ваша задача - добавить два новых метода
     * в класс Shop: Метод sortProductsByPrice(), который сортирует список продуктов по стоимости.
     * Метод getMostExpensiveProduct(), который возвращает самый дорогой продукт.
     * Напишите тесты, чтобы проверить, что магазин хранит верный список продуктов (правильное
     * количество продуктов, верное содержимое корзины).
     * Напишите тесты для проверки корректности работы метода getMostExpensiveProduct.
     * Напишите тесты для проверки корректности работы метода sortProductsByPrice (проверьте правильность
     * сортировки). Используйте класс Product для создания экземпляров продуктов и класс Shop для
     * написания методов сортировки и тестов.
     */
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
        checkShop(shop);
        checkExpProduct(shop);
    }
    private static void checkShop(Shop shop) {
        /* правильное кол-во продуктов? у нас вообще нет количества, не поняла этот момент,
        поэтому проверяю на то, что стоимость и имя не нулевые */
        assertThat(shop).isNotEmpty();
        for (Product prod : shop) {
            assertThat(prod.getCost()).isGreaterThan(0);
            assertThat(prod.getTitle()).isNotEmpty();
        }
    }
    private static void checkSort(Shop shop) {
        // не знаю, как делать
//        assertThat(shop).filteredOn(product -> {}).asList();
    }
    private static void checkExpProduct(Shop shop) {
        assertThat(shop.getMostExpensiveProduct()).isEqualTo(shop.getProducts().get(0));
    }
}




