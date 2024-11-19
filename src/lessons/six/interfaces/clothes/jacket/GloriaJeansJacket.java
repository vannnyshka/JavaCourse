package lessons.six.interfaces.clothes.jacket;

public class GloriaJeansJacket implements IJacket{
    private boolean dressed;

    public GloriaJeansJacket(boolean dressed) {
        this.dressed = dressed;
    }

    @Override
    public void putOn() {
        if (!this.dressed) {
            this.dressed = true;
            System.out.println("GloriaJeansJacket успешно надета!");
        } else {
            System.out.println("ERROR!!! GloriaJeansJacket уже на вас!!!!");
        }
    }

    @Override
    public void putOff() {

        if (this.dressed) {
            this.dressed = false;
            System.out.println("GloriaJeansJacket успешно снята!");
        } else {
            System.out.println("ERROR!!!! GloriaJeansJacket на вас не надета!!!");
        }
    }

    @Override
    public boolean getDressed() {
        return this.dressed;
    }
}
