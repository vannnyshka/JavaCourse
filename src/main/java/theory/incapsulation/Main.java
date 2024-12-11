package theory.incapsulation;

public class Main {

    public static void main(String[] args) {

        Person anya = new Person("Anya", 18);

        System.out.println(anya.getAge());
        anya.setAge(-32);

        System.out.println(anya.getAge());

        anya.setAge(19);
        System.out.println(anya.getAge());

        anya.setName("Anna");
        System.out.println(anya.getName());

    }
}
