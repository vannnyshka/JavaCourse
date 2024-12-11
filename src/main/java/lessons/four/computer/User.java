package lessons.four.computer;

import java.util.Scanner;

public class User {
    public static void main(String[] args) {

        int start;

        Scanner input = new Scanner(System.in);

        System.out.println("Введите 0/1, чтобы запустить компьютер: ");

        start = input.nextInt();


        // Computer computer = new Computer(hardDrive,processor);

        Computer computer = new Computer();
        HardDrive hardDrive = new HardDrive("fkldfjgfiesoi");
        Processor processor = new Processor("proc");
        OperativeMemory operativeMemory = new OperativeMemory("ggg");
        computer.setHardDrive(hardDrive);
        computer.setProcessor(processor);
        computer.setOperativeMemory(operativeMemory);
        computer.setCompNum(1);
        computer.setFullCycle(3);

        computer.turnOnComputer(start);
        computer.turnOffComputer(start);



    }
}
