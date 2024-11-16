package lesson6.interfaces.robot;

import lesson6.interfaces.robot.hands.SonyHand;
import lesson6.interfaces.robot.heads.SamsungHead;
import lesson6.interfaces.robot.heads.ToshibaHead;
import lesson6.interfaces.robot.legs.SamsungLeg;
import lesson6.interfaces.robot.legs.SonyLeg;
import lesson6.interfaces.robot.legs.ToshibaLeg;

import java.util.ArrayList;
import java.util.List;

public class Run {
    public static void main(String[] args) {
        /*
        Создать по 3 реализации(Sony, Toshiba, Samsung) каждой запчасти(IHead, IHand, ILeg)
        Класс SonyHead является примером реализацией головы от Sony.

        Создайте 3 робота с разными комплектующими.
        Например у робота голова и нога от Sony а, рука от Samsung.
        У всех роботов вызовите метод action.

        Среди 3-х роботов найдите самого дорогого.
        */

        List<Robot> robots = new ArrayList<>();

        Robot robotOne = new Robot(new SamsungHead(300), new SonyHand(200), new SonyLeg(200));
        robots.add(robotOne);
        robotOne.action();

        Robot robotTwo = new Robot(new ToshibaHead(500), new SonyHand(200), new ToshibaLeg(100));
        robots.add(robotTwo);
        robotTwo.action();

        Robot robotTree = new Robot(new ToshibaHead(500), new SonyHand(200), new SamsungLeg(50));
        robots.add(robotTree);
        robotTree.action();

        findExspensiveRobot(robots);


    }

    public static void findExspensiveRobot(List<Robot> robots) {

        Robot robot = robots.get(0);

        for (int i = 1; i < robots.size(); i++) {
            if (robots.get(i).getPrice() > robots.get(i - 1).getPrice()) {
                robot = robots.get(i);
            }
        }

        System.out.println("Самый дорогой робот:");
        System.out.println(robot);

    }
}
