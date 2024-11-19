package lessons.six.interfaces.clothes.shoes;

public class LevisShoes implements IShoes {
    private boolean dressed;

    public LevisShoes(boolean dressed) {
        this.dressed = dressed;
    }

    @Override
    public void putOn() {
        if (!this.dressed) {
            this.dressed = true;
            System.out.println("LevisShoes успешно надета!");
        } else {
            System.out.println("ERROR!!! LevisShoes уже на вас!!!!");
        }
    }

    @Override
    public void putOff() {

        if (this.dressed) {
            this.dressed = false;
            System.out.println("LevisShoes успешно снята!");
        } else {
            System.out.println("ERROR!!!! LevisShoes на вас не надета!!!");
        }

    }

    @Override
    public boolean getDressed() {
        return this.dressed;
    }
}
