package lessons.six.links.store.products;

import java.util.List;
import java.util.Objects;

public class Category {

    private String name;
    private List<Product> products;

    public Category(String name, List<Product> products) {
        this.name = name;
        this.products = products;
    }

    public String getName() {
        return name;
    }

    public List<Product> getProducts() {
        return products;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Category category = (Category) o;
        return Objects.equals(name, category.name) && Objects.equals(products, category.products);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, products);
    }

    @Override
    public String toString() {

        StringBuilder returnString = new StringBuilder();
        returnString.append("Категория: ").append(name);

        for (Product product : products) {

            returnString.append(product);

        }

        return String.valueOf(returnString);

    }
}
