package lesson6.interfaces.clothes.jacket;

public class GucciJacket implements IJacket {

    private boolean dressed;

    public GucciJacket(boolean dressed) {
        this.dressed = dressed;
    }

    @Override
    public void putOn() {
        if (!this.dressed) {
            this.dressed = true;
            System.out.println("GucciJacket успешно надета!");
        } else {
            System.out.println("ERROR!!! LevisJacket уже на вас!!!!");
        }
    }

    @Override
    public void putOff() {

        if (this.dressed) {
            this.dressed = false;
            System.out.println("GucciJacket успешно снята!");
        } else {
            System.out.println("ERROR!!!! LevisJacket на вас не надета!!!");
        }
    }

    @Override
    public boolean getDressed() {
        return this.dressed;
    }

}
