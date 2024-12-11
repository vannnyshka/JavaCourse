package lessons.six.interfaces.clothes;

import lessons.six.interfaces.clothes.jacket.GloriaJeansJacket;
import lessons.six.interfaces.clothes.shoes.GucciShoes;
import lessons.six.interfaces.clothes.trousers.GloriaJeansTrousers;

public class Main {
    public static void main(String[] args) {

        Person kirill = new Person("Kirill",new GloriaJeansJacket(true), new GloriaJeansTrousers(false), new GucciShoes(false));

        kirill.putOnAllClothes();
        System.out.println();
        kirill.putOffAllClothes();
        System.out.println();
        kirill.putOnAllClothes();


    }
}
