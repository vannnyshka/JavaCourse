package theory.classes;

public class Person {
    String name;
    int age;

    //инициализатор - это блок, в котором можно заранее определить переменные, если они будут не определены
    /*начало блока инициализатора*/
    {
        name = "Default";
        age = 18;
    }
    /*конец блока инициализатора*/


    Person(){
        name = "Noname";
        age = 18;
    }

    public Person(String Name, int Age){
        name = Name;
        age = Age;
    }

    //чтобы не путаться, указывать в конструкторе сразу переменные, которые мы принимаем
    Person(String name){
        this(name, 18);
    }


    //Идентичные названия переменных класса и конструктура
    Person(int age){
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    void displayInfo(){
        System.out.println("Hi! My name is "+name+". I am "+age);
    }
}
