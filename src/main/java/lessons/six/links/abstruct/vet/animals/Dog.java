package lessons.six.links.abstruct.vet.animals;

public class Dog extends Animal {

    public Dog(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println("Dog " + super.getName() + " eating...");
    }

    @Override
    public void makeNoise() {
        System.out.println("Woof-woof");
    }

    @Override
    public void getDescription() {
        System.out.println("I'm a dog " + super.getName());
    }
}
