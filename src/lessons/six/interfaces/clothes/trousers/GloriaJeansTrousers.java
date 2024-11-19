package lessons.six.interfaces.clothes.trousers;

public class GloriaJeansTrousers implements ITrousers {

    private boolean dressed;

    public GloriaJeansTrousers(boolean dressed) {
        this.dressed = dressed;
    }

    @Override
    public void putOn() {
        if (!this.dressed) {
            this.dressed = true;
            System.out.println("GloriaJeansTrousers успешно надета!");
        } else {
            System.out.println("ERROR!!! GloriaJeansTrousers уже на вас!!!!");
        }
    }

    @Override
    public void putOff() {

        if (this.dressed) {
            this.dressed = false;
            System.out.println("GloriaJeansTrousers успешно снята!");
        } else {
            System.out.println("ERROR!!!! GloriaJeansTrousers на вас не надета!!!");
        }
    }

    @Override
    public boolean getDressed() {
        return this.dressed;
    }

}
