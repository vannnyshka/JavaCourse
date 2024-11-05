package lesson4.placeholder;

public class Main {
    public static void main(String[] args) {

        System.out.println(searchAndReplaceDiamonds("Номер карты <4343 4444> 4343. Клиент: Вася","***"));

    }

    public static String searchAndReplaceDiamonds(String text, String placeholder){

        int fIndex = text.indexOf('<');
        int lIndex = text.indexOf('>');

        String retText = "";

        if(fIndex != 0 ){
            retText = text.substring(0,fIndex);
        }

        retText += placeholder;

        if(lIndex != text.length()-1){
            retText+= text.substring(lIndex+1);
        }

        return retText;

    }
}
