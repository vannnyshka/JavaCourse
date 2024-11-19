package lessons.three.tasks3.cat;


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

        /*4. Создать перменную количества глаз у кота и установить кошкам цвет*/
        System.out.println(Cat.countEye);

        tom.setColor(CatColor.BLACK);

        System.out.println(tom.getColor().equals(CatColor.BLACK));

        /*5.1 Создать трех кошек с методом getKitten*/
        Cat mia = getKitten();

        System.out.println(mia);

        Cat rich = getKitten();

        System.out.println(rich);

        Cat marta = getKitten();

        System.out.println(marta);

        /*6.2 Использование метода копирования*/

        Cat sia = new Cat();

        System.out.println("Sia before copy: ");
        System.out.println(sia);


        System.out.println("Sia after copy: ");
        System.out.println(sia);

        System.out.println("Your copy: ");
        System.out.println(tom);

        /*6.3 Использовать коструктор копирования*/

        Cat noriNor = new Cat(felix);

        System.out.println(noriNor);

        Cat nori = new Cat(felix.getName(), felix.getColor(), felix.getWeight());


        System.out.println("FELIX:");
        System.out.println(felix);
        System.out.println("NORI IS COPY OF FELIX: ");
        System.out.println(nori);

        Cat petya = copyCat(nori);

        petya.setName("Petya");
        System.out.println(nori);
        System.out.println(petya);


    }

    /*5.2 Создайте в главном классе Loader метод генерации котёнка private static Cat getKitten().
        Он должен возвращать кошку с весом 1100.00 грамм с помощью конструктора, в который передаём
        вес кошки. Используйте описание из видеоурока.*/

    private static Cat getKitten() {
        return new Cat(1100);
    }

    /*6.1	Сделайте метод создания «глубокой» копии кошки. Это означает, что все параметры одной кошки равны параметрам другой.
    Используйте для этого метод копирования или конструктор копирования.*/

    public static Cat copyCat(Cat copy) {
        Cat cat = new Cat();
        cat.setName(copy.getName());
        cat.setColor(copy.getColor());
        cat.setWeight(copy.getWeight());
        return cat;
    }

}
