package lessons.four.house;

import java.util.Objects;

public class Window {

    private boolean stWin = false;

    public Window() {

    }

    public Window(boolean stWin) {
        this.stWin = stWin;
    }

    public boolean getStWin() {
        return stWin;
    }

    public void setStWin(boolean stWin) {
        this.stWin = stWin;
    }

    @Override
    public String toString() {
        return "Window{" + "stWin=" + stWin + '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Window window = (Window) o;
        return stWin == window.stWin;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(stWin);
    }
}
