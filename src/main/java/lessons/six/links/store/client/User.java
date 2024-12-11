package lessons.six.links.store.client;

import java.util.Objects;

public class User {

    private String login;
    private String password;
    private Basket basket;

    public User(String login, String password, Basket basket) {
        this.login = login;
        this.password = password;
        this.basket = basket;
    }

    public String getLogin() {
        return login;
    }

    public Basket getBasket() {
        return basket;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(login, user.login) && Objects.equals(password, user.password) && Objects.equals(basket, user.basket);
    }

    @Override
    public int hashCode() {
        return Objects.hash(login, password, basket);
    }

    @Override
    public String toString() {
        return "Пользователь: " + login + basket;

    }
}
