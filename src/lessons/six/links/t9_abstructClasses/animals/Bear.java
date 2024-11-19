package lessons.six.links.t9_abstructClasses.animals;

public class Bear extends Animal {

    public Bear(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println("Baer " + super.getName() + " eating...");
    }

    @Override
    public void makeNoise() {
        System.out.println("AAAAAAAAAAAAAAAARHHHH");
    }

    @Override
    public void getDescription() {
        System.out.println("I'm an ANGRY BEAR " + super.getName());
    }
}
