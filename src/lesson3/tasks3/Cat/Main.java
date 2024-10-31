package lesson3.tasks3.Cat;


import lesson3.tasks3.NoteBook;

public class Main {
    public static void main(String[] args) {

        /*1. Взорвать кота или замяукать кота до смерти*/
        Cat tom = new Cat();

        System.out.println(tom.getWeight());

        while (tom.getStatus() != "Dead") {
            tom.meow();
        }

        System.out.println("tom is " + tom.getStatus());

        Cat felix = new Cat();

        while (felix.getStatus() != "Exploded") {
            //min + (int)(Math.random() * ((max – min) + 1))
            felix.feed((100 + Math.random() * ((1000 - 100) + 1)));
        }

        System.out.println("Felix is " + felix.getStatus());

        /*2. Создать метод, который выводит массу съеденной котом еды и метод "Сходить в туалет", который будет
          уменьшать вес кота и что-то печатать*/


        System.out.println("Felix ate " + felix.getAmountFood());
        System.out.print("Tom say: ");
        tom.goToilet();
        tom.setName("tom");

        //При создании класса ты сразу прописываешь поля.
        // К ним сразу getter и setter.
        // Консруктор по умолчанию и конструктор со всеми полями.
        // Переопределяешь метод toString()
        // Делаешь метод equals() и hashcode()

        NoteBook red = new NoteBook(100,45,25);

        System.out.println(red);

        red.setCountPage(105);
        System.out.println(red);

        NoteBook green = new NoteBook(105, 45,25);
        System.out.println(green);

        System.out.println(green.equals(red));

    }
}
