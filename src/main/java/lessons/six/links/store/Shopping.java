package lessons.six.links.store;

import lessons.six.links.store.client.Basket;
import lessons.six.links.store.client.User;
import lessons.six.links.store.products.Category;
import lessons.six.links.store.products.Product;

import java.math.BigDecimal;
import java.util.LinkedList;
import java.util.List;

public class Shopping {

    public static void main(String[] args) {

        List<Product> dairyDep = new LinkedList<>();

        //Create products
        Product yogurt = new Product("Йогурт", new BigDecimal("3.40"), 3);
        dairyDep.add(yogurt);

        Product milk = new Product("молоко", new BigDecimal("2.50"), 1);
        dairyDep.add(milk);

        Category dairyCategory = new Category("Молочная продукция", dairyDep);

        List<Product> meatDep = new LinkedList<>();
        Product chicken = new Product("курица", new BigDecimal("9.40"), 1);
        meatDep.add(chicken);

        Product pork = new Product("свинина", new BigDecimal("11.00"), 2);
        meatDep.add(pork);

        Product beef = new Product("говядина", new BigDecimal("13.80"), 3);
        meatDep.add(beef);

        Category meatCategory = new Category("Мясная продукция", meatDep);


        List<Product> basketByClientOne = new LinkedList<>();
        basketByClientOne.add(yogurt);
        Basket basketOne = new Basket(basketByClientOne);
        User clientOne = new User("zdananaz@yandex.ru", "1234", basketOne);


        List<Product> basketByClientTwo = new LinkedList<>();
        basketByClientTwo.add(chicken);
        basketByClientTwo.add(milk);
        Basket basketTwo = new Basket(basketByClientTwo);
        User clientTwo = new User("noob2000@yandex.ru", "1111", basketTwo);
        System.out.println(dairyCategory);
        System.out.println();
        System.out.println(meatCategory);
        System.out.println();
        System.out.println(clientOne);
        System.out.println();
        System.out.println(clientTwo);

    }

}
