package lesson6.interfaces.clothes;

import lesson6.interfaces.clothes.jacket.GloriaJeansJacket;
import lesson6.interfaces.clothes.shoes.GucciShoes;
import lesson6.interfaces.clothes.trousers.GloriaJeansTrousers;

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
