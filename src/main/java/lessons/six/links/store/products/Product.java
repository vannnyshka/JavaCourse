package lessons.six.links.store.products;

import java.math.BigDecimal;
import java.util.Objects;

public class Product {

    private String name;
    private BigDecimal cost;
    private int rating;

    public Product(String name, BigDecimal cost, int rating) {
        this.name = name;
        this.cost = cost;
        this.rating = rating;
    }

    public String getName() {
        return name;
    }

    public BigDecimal getCost() {
        return cost;
    }

    public int getRating() {
        return rating;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return rating == product.rating && Objects.equals(name, product.name) && Objects.equals(cost, product.cost);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, cost, rating);
    }

    @Override
    public String toString() {
        return "\n\t\tпродукт: " + name + "; цена: " + cost + "; рейтинг: " + rating + ";";
    }
}
