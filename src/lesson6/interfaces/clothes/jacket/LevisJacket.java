package lesson6.interfaces.clothes.jacket;

public class LevisJacket implements IJacket {

    private boolean dressed;

    public LevisJacket(boolean dressed) {
        this.dressed = dressed;
    }

    @Override
    public void putOn() {
        if (!this.dressed) {
            this.dressed = true;
            System.out.println("LevisJacket успешно надета!");
        } else {
            System.out.println("ERROR!!! LevisJacket уже на вас!!!!");
        }
    }

    @Override
    public void putOff() {

        if (this.dressed) {
            this.dressed = false;
            System.out.println("LevisJacket успешно снята!");
        } else {
            System.out.println("ERROR!!!! LevisJacket на вас не надета!!!");
        }
    }

    @Override
    public boolean getDressed() {
        return this.dressed;
    }
}
