package lessons.six.interfaces.clothes;

import lessons.six.interfaces.clothes.jacket.IJacket;
import lessons.six.interfaces.clothes.shoes.IShoes;
import lessons.six.interfaces.clothes.trousers.ITrousers;

import java.util.Objects;

public class Person {

    private String name;
    private IJacket jacket;
    private ITrousers trousers;
    private IShoes shoes;

    public Person(String name, IJacket jacket, ITrousers trousers, IShoes shoes) {
        this.name = name;
        this.jacket = jacket;
        this.trousers = trousers;
        this.shoes = shoes;
    }

    public void putOffAllClothes() {

        this.jacket.putOff();
        this.trousers.putOff();
        this.shoes.putOff();

        System.out.println(this.name + " полностью раздета!");

    }

    public void putOnAllClothes() {

        this.jacket.putOn();
        this.trousers.putOn();
        this.shoes.putOn();

        System.out.println(this.name + " полностью одета!");

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(name, person.name) && Objects.equals(jacket, person.jacket) && Objects.equals(trousers, person.trousers) && Objects.equals(shoes, person.shoes);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, jacket, trousers, shoes);
    }

    @Override
    public String toString() {
        return "На " + name + " надето: " + '\'' +
                ", куртка - " + (jacket.getDressed() ? " надета" : " не надета") +
                ", штаны - " + (trousers.getDressed() ? " надеты" : " не надеты") +
                ", обувь - " + (shoes.getDressed() ? " надета" : " не надета");
    }
}
