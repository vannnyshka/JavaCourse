package lessons.four.regulars.placeholder;


public class Main {
    public static void main(String[] args) {

        System.out.println(searchAndReplaceDiamonds("Номер карты <4343 4444> 434<3>         <cdsfds>  . Клиент: Вася", "***"));

    }

    public static String searchAndReplaceDiamonds(String text, String placeholder) {

        String retText = text.replaceAll("<.+?>", placeholder);

        return retText;

    }
}
