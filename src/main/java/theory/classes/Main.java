package theory.classes;

public class Main {
    public static void main(String[] args) {

        Person anya = new Person();
        anya.displayInfo();

        Person lera = new Person("Lera");
        lera.displayInfo();

        Person tosya = new Person("Tosya", 23);
        tosya.displayInfo();

        Person noname = new Person(16);
        noname.displayInfo();

        Computer myNotebook = new Computer();

        myNotebook.processor = new Processor();

        myNotebook.processor.coreCount = 4;


        Cat dog = new Cat();

        System.out.println(dog.getWeight());

        while (dog.getStatus() != "Dead") {
            dog.meow();
        }

        System.out.println("dog is "+dog.getStatus());

        Cat dog2 = new Cat();

        while (dog2.getStatus()!= "Exploded"){
            //min + (int)(Math.random() * ((max – min) + 1))
            dog2.feed((100+ (double)Math.random()*((1000-100)+1)));
        }

        System.out.println("dog2 is "+dog2.getStatus());

    }
}
