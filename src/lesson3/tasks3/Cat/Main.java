package lesson3.tasks3.Cat;


import lesson3.tasks3.Notebook.NoteBook;

public class Main {
    public static void main(String[] args) {

        System.out.println(Cat.getTotalCat());

        /*1. Взорвать кота или замяукать кота до смерти*/
        Cat tom = new Cat();

        System.out.println(Cat.getTotalCat());

        System.out.println(tom.getWeight());

        while (!tom.getStatus().equals("Dead")) {
            tom.meow();
        }

        System.out.println("tom is " + tom.getStatus());

        Cat felix = new Cat();

        System.out.println(Cat.getTotalCat());

        System.out.println(tom.getWeight());

        while (!felix.getStatus().equals("Exploded")) {
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


        /*3. Создать метод, который выводит количество кошек, также если одна умирает или взрывается, то количество уменьшается*/
        System.out.println(Cat.getTotalCat());

    }
}
