package theory.modificators;

public class Person {

    public String name;
    public String lname;
    protected int age;
    String phone;
    private double weight;

    public Person(String name, String lname, int age, String phone, double weight) {
        this.name = name;
        this.lname = lname;
        this.age = age;
        this.phone = phone;
        this.weight = weight;
    }

    public void displayName(){
        System.out.println("My name is "+name+" "+lname);
    }

    void displayAge(){
        System.out.println("My age is "+age);
    }

    protected void displayPhone(){
        System.out.println("My phone is "+phone);
    }

    private void displayWeight(){
        System.out.println("My weight is "+weight);
    }
}
