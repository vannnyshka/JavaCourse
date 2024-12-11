package theory.incapsulation;

public class Person {

    private String name;
    private int age = 18;

    public Person(String name, int age){

        setName(name);
        setAge(age);
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public void setAge(int age){

        if(age>0 && age<150) {
            this.age = age;
        }
    }

    public int getAge(){
        return this.age;
    }



}
