package lessons.six.links.abstruct.vet.animals;

public abstract class Animal {

    private String name;

    public Animal(String name) {

        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract void makeNoise();

    public abstract void eat();

    public abstract void getDescription();

}
