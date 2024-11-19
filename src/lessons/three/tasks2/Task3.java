package lessons.three.tasks2;

public class Task3 {
    public static void main(String[] args) {
        /*Вычислить:  1+2+4+8+…+256*/
        //Способ 1
        int count = 1;
        for (int i = 2; i <= 256; i += 2) {
            count += i;
        }
        System.out.println(count);

        //Способ 2 -- реккурентная формула: 1 + формула арифметической прогрессии S =  ( (a1+an)*n )/2, т.е. result = 1+( (a1+an)*n )/2
        count = 0;
        count = 1 + (2 + 256) * 128 / 2;

        System.out.println(count);

        //Способ 3 -- степени 2ки

        System.out.println("Способ 3");
        int sum = 0;
        for (int i = 0; i < 9; i++) {
            sum += (int) Math.pow(2, i);
        }
        System.out.println("sum = " + sum);
    }
}
