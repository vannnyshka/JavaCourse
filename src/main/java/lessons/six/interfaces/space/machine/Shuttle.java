package lessons.six.interfaces.space.machine;

public class Shuttle implements IStart{
    @Override
    public boolean startCheckSystem() {

        return (int) (Math.random() * 11) > 3;
    }

    @Override
    public void startEngine() {
        System.out.println("Двигатели Шатла запущены.");
        System.out.println("Все системы в норме.");
    }

    @Override
    public void startSystem() {
        System.out.println("Шатл запущен!!!");
    }
}
