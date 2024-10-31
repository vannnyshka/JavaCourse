package lesson3.tasks2;

public class Task8 {
    public static void main(String[] args) {
        /* И ещё можете попрактиковаться и нарисовать оставшиеся 2
        треугольника
                 *
               * *
             * * *
           * * * *
           * * * *
             * * *
               * *
                 *
        */

        for (int i = 4; i >= 1; i--) {
            for (int j = 1; j <= 4; j++) {
                if (j >= i) {
                    System.out.print('*');
                } else {
                    System.out.print('-');
                }
            }
            System.out.println();
        }

        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= 4; j++) {
                if (j >= i) {
                    System.out.print('*');
                } else {
                    System.out.print('-');
                }
            }
            System.out.println();
        }


    }
}
