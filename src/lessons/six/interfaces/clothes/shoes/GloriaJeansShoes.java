package lessons.six.interfaces.clothes.shoes;

public class GloriaJeansShoes implements IShoes {

    public GloriaJeansShoes(boolean dressed) {
        this.dressed = dressed;
    }

    private boolean dressed;

    @Override
    public void putOn() {
        if (!this.dressed) {
            this.dressed = true;
            System.out.println("GloriaJeansShoes успешно надета!");
        } else {
            System.out.println("ERROR!!! GloriaJeansShoes уже на вас!!!!");
        }
    }

    @Override
    public void putOff() {

        if (this.dressed) {
            this.dressed = false;
            System.out.println("GloriaJeansShoes успешно снята!");
        } else {
            System.out.println("ERROR!!!! GloriaJeansShoes на вас не надета!!!");
        }
    }

    @Override
    public boolean getDressed() {
        return this.dressed;
    }

}
