package lessons.four.string;

public class Main {
    public static void main(String[] args) {
        String alphabetRus = "АБВГДЕЁЖЗИЙКЛМНОПРСТУФХЦЧШЩЪЫЬЭЮЯабвгдеёжзийклмнопрстуфхцчшщъыьэюя";
        String alphabetEng = "abcdefghIjklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";

        System.out.println("RUSSIAN ALPHABET: ");
        for (int i = 0; i < alphabetRus.length(); i++) {
            System.out.println(alphabetRus.charAt(i) + ": " + (int) alphabetRus.charAt(i));
        }

        System.out.println("ENGLISH ALPHABET: ");
        for (int i = 0; i < alphabetEng.length(); i++) {
            System.out.println(alphabetEng.charAt(i) + ": " + (int) alphabetEng.charAt(i));
        }


        System.out.println("RUSSIAN ALPHABET: ");
        for (int i = 'А'; i <= 'я'; i++) {
            System.out.println((char) i + ": " + i);
        }

    }
}
