package lesson6.linkTasks.t9_abstructClasses;

import lesson6.linkTasks.t9_abstructClasses.animals.Animal;
import lesson6.linkTasks.t9_abstructClasses.animals.Bear;
import lesson6.linkTasks.t9_abstructClasses.animals.Cat;
import lesson6.linkTasks.t9_abstructClasses.animals.Dog;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Animal> pets = new ArrayList<>();

        Vet vetOne = new Vet("M'r Freeman");

        Animal kuzya = new Cat("Kuzya");
        pets.add(kuzya);

        Animal boo = new Bear("Boo");
        pets.add(boo);

        Animal lulu = new Dog("Lulu");
        pets.add(lulu);

        for (Animal pet : pets) {

            vetOne.treatAnimal(pet);
            pet.makeNoise();
            pet.eat();
            System.out.println();
        }


    }
}
