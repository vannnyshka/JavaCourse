package lessons.four.house;

import java.util.Objects;

public class Light {

    private boolean stLight = false;

    public Light() {

    }

    public Light(boolean stLight) {
        this.stLight = stLight;
    }

    public boolean getStLight() {
        return stLight;
    }

    public void setStLight(boolean stLight) {
        this.stLight = stLight;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Light light = (Light) o;
        return stLight == light.stLight;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(stLight);
    }

    @Override
    public String toString() {
        return "Light{" +
                "stLight=" + stLight +
                '}';
    }
}
