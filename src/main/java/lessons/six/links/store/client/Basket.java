package lessons.six.links.store.client;

import lessons.six.links.store.products.Product;

import java.util.List;
import java.util.Objects;

public class Basket {

    List<Product> products;

    public Basket(List<Product> products) {
        this.products = products;
    }

    public List<Product> getProducts() {
        return products;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Basket basket = (Basket) o;
        return Objects.equals(products, basket.products);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(products);
    }

    @Override
    public String toString() {

        StringBuilder returnString = new StringBuilder();
        returnString.append("\n\tКорзина товаров:");

        for (Product product : products) {

            returnString.append(product);

        }

        return String.valueOf(returnString);
    }
}
