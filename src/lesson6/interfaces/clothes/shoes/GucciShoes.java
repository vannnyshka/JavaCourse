package lesson6.interfaces.clothes.shoes;

public class GucciShoes implements IShoes {

    private boolean dressed;

    public GucciShoes(boolean dressed) {
        this.dressed = dressed;
    }

    @Override
    public void putOn() {
        if (!this.dressed) {
            this.dressed = true;
            System.out.println("GucciShoes успешно надета!");
        } else {
            System.out.println("ERROR!!! GucciShoes уже на вас!!!!");
        }
    }

    @Override
    public void putOff() {

        if (this.dressed) {
            this.dressed = false;
            System.out.println("GucciShoes успешно снята!");
        } else {
            System.out.println("ERROR!!!! GucciShoes на вас не надета!!!");
        }
    }

    @Override
    public boolean getDressed() {
        return this.dressed;
    }

}
