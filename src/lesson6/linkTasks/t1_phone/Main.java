package lesson6.linkTasks.t1_phone;

public class Main {

    public static void main(String[] args) {

        Phone phone = new Phone("375333292194", "Honor", 800);

        Phone phoneTwo = new Phone("375333292195", "Iphone", 500);

        Phone phoneThee = new Phone("375333292196", "Samsung", 400);


        phone.receiveCall("Anna");
        System.out.println(phone.getNumber());
        System.out.println();

        phoneTwo.receiveCall("Maya");
        System.out.println(phoneTwo.getNumber());
        System.out.println();

        phoneThee.receiveCall("Polina");
        System.out.println(phoneThee.getNumber());
        phoneThee.receiveCall("Lera", "375332349564");
        System.out.println();

        phone.sendMessage("375334567654", "375294357423", "375333246654");


    }
}
