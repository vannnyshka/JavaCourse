package lessons.four.computer;


import java.util.Objects;

public class Computer {

    private Processor processor;
    private OperativeMemory operativka;
    private HardDrive hdd;

    private int compNum;
    private int fullCycle;

    private boolean status = false;


    public Computer() {

    }

    public Computer(Processor processor, OperativeMemory operativka, HardDrive hdd, int compNum, int fullCycle) {
        this.processor = processor;
        this.operativka = operativka;
        this.hdd = hdd;
        this.compNum = compNum;
        this.fullCycle = fullCycle;

    }

    public int random() {
        return (int) Math.random() * ((1 - 0) + 1);
    }

    public void turnOnComputer(int start) {
        //Если комп включен - его нельзя включить
        //Если комп сгорел - тоже нельзя
        //Если комп выключен - его надо включить

        if (fullCycle != 0) {
            if (!status) {
                if (random() == start) {
                    System.out.println("Урааа!! Вы включили компьютер");
                } else {
                    System.out.println("Вы убили компьютер...");
                    fullCycle = 0;
                }

            } else {
                System.out.println("Компьютер уже включен!!!!!!!!");
            }

        } else {
            System.out.println("Компьютер убит");
        }
    }


    public void turnOffComputer(int finish) {
        //Если комп включен - его нельзя включить
        //Если комп сгорел - тоже нельзя
        //Если комп выключен - его надо включить

        if (fullCycle != 0) {
            if (status) {
                if (random() == finish) {
                    System.out.println("Урааа!! Вы выключили компьютер");
                    fullCycle -= 1;
                    if (fullCycle == 0) {
                        System.out.println("Ресурс исчерпан.");
                    }
                } else {
                    System.out.println("Вы убили компьютер...");
                    fullCycle = 0;
                }

            } else {
                System.out.println("Компьютер уже выключен!!!!!!!!");
            }

        } else {
            System.out.println("Компьютер убит");
        }
    }


    public int getCompNum() {
        return this.compNum;
    }

    public void setCompNum(int compNum) {
        if (compNum > 0 && compNum < 10) {
            this.compNum = compNum;
        }
    }

    public int getFullCycle() {
        return this.fullCycle;
    }

    public void setFullCycle(int fullCycle) {
        this.fullCycle = fullCycle;
    }

    public Processor getProcessor() {
        return this.processor;
    }

    public void setProcessor(Processor processor) {
        this.processor = processor;
    }

    public HardDrive getHardDrive() {
        return this.hdd;
    }

    public void setHardDrive(HardDrive hdd) {
        this.hdd = hdd;
    }

    public OperativeMemory getOperativeMemory() {
        return this.operativka;
    }

    public void setOperativeMemory(OperativeMemory operativka) {
        this.operativka = operativka;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "processor=" + processor +
                ", operativka=" + operativka +
                ", hdd=" + hdd +
                ", compNum=" + compNum +
                ", fullCycle=" + fullCycle +
                '}';
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Computer computer = (Computer) o;
        return compNum == computer.compNum && fullCycle == computer.fullCycle && Objects.equals(processor, computer.processor) && Objects.equals(operativka, computer.operativka) && Objects.equals(hdd, computer.hdd);
    }

    @Override
    public int hashCode() {
        return Objects.hash(processor, operativka, hdd, compNum, fullCycle);
    }
}
