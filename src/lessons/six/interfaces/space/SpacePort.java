package lessons.six.interfaces.space;

import lessons.six.interfaces.space.machine.IStart;


public class SpacePort{


    public void launch(IStart start){

        System.out.println("Представтовая проверка пошла...");

        if(start.startCheckSystem()){
            System.out.println("Предстартовая проверка прошла успешно.");

            start.startEngine();

            for (int i = 10; i > 0; i--) {
                System.out.println("До запуска осталось: " + ((i > 4)? i + " секунд": (i > 1)? i + " секунды" : i + " секунда"));
                try {
                    Thread.sleep(1000L);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }

            start.startSystem();

        } else {
            System.out.println("Предстартовая проверка провалена.");
        }

    }



}
