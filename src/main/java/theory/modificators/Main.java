package theory.modificators;

public class Main {
    public static void main(String[] args) {
        Person lida = new Person("Lida","Ivanova",18,"+3754323212",32.43);

        System.out.println(lida.name); //public, доступен во всем проекте
        System.out.println(lida.age); //protected, доступен во всем пакете и наследуемых классах
        System.out.println(lida.phone); //default, доступен во всем пакете
        //System.out.println(lida.weight); //private, доступен только в своем классе, здесь его вызвать нельзя

        lida.displayName(); //public, доступен во всем проекте
        lida.displayAge(); //protected, доступен во всем пакете и наследуемых классах
        lida.displayPhone();//default, доступен во всем пакете

        //lida.displayWeight(); //private, доступен только в своем классе, здесь его вызвать нельзя
    }
}

