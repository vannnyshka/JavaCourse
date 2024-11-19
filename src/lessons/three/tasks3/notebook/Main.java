package lessons.three.tasks3.notebook;

public class Main {

    public static void main(String[] args) {

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
