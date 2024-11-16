package lesson6.interfaces.clothes.trousers;

public class LevisTrousers implements ITrousers{

    private boolean dressed;

    public LevisTrousers(boolean dressed) {
        this.dressed = dressed;
    }

    @Override
    public void putOn() {
        if (!this.dressed) {
            this.dressed = true;
            System.out.println("LevisTrousers успешно надета!");
        } else {
            System.out.println("ERROR!!! LevisTrousers уже на вас!!!!");
        }
    }

    @Override
    public void putOff() {

        if (this.dressed) {
            this.dressed = false;
            System.out.println("LevisTrousers успешно снята!");
        } else {
            System.out.println("ERROR!!!! LevisTrousers на вас не надета!!!");
        }
    }

    @Override
    public boolean getDressed() {
        return this.dressed;
    }

}
