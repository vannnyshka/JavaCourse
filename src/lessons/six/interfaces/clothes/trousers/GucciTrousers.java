package lessons.six.interfaces.clothes.trousers;

public class GucciTrousers implements ITrousers {

    private boolean dressed;

    public GucciTrousers(boolean dressed) {
        this.dressed = dressed;
    }

    @Override
    public void putOn() {
        if (!this.dressed) {
            this.dressed = true;
            System.out.println("GucciTrousers успешно надета!");
        } else {
            System.out.println("ERROR!!! GucciTrousers уже на вас!!!!");
        }
    }

    @Override
    public void putOff() {

        if (this.dressed) {
            this.dressed = false;
            System.out.println("GucciTrousers успешно снята!");
        } else {
            System.out.println("ERROR!!!! GucciTrousers на вас не надета!!!");
        }
    }

    @Override
    public boolean getDressed() {
        return this.dressed;
    }

}
