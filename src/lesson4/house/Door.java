package lesson4.house;

import java.util.Objects;

public class Door {

    private boolean stDoor = false;

    public Door() {

    }

    public Door(boolean stDoor) {
        this.stDoor = stDoor;
    }

    public boolean getStDoor() {
        return stDoor;
    }

    public void setStDoor(boolean stDoor) {
        this.stDoor = stDoor;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Door door = (Door) o;
        return stDoor == door.stDoor;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(stDoor);
    }

    @Override
    public String toString() {
        return "Door{" +
                "stDoor=" + stDoor +
                '}';
    }
}
