package lessons.six.links.abstruct.vet.animals;

public class Cat extends Animal {

    public Cat(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println("Cat " + super.getName() + " eating...");
    }

    @Override
    public void makeNoise() {
        System.out.println("Meow");
    }

    @Override
    public void getDescription() {
        System.out.println("I'm a cat " + super.getName());
    }
}
