package lesson4.house;

import java.util.Objects;

public class Appartment {

    private Door door;
    private Light light;
    private Window window;

    private int flatNum;
    private boolean status = false;


    public Appartment(Door door, Light light, Window window, boolean status, int flatNum) {
        this.door = door;
        this.light = light;
        this.window = window;
        this.status = status;
        this.flatNum = flatNum;
    }

    public Appartment() {
    }

    public Door getDoor() {
        return door;
    }

    public void setDoor(Door door) {
        this.door = door;
    }

    public Light getLight() {
        return this.light;
    }

    public void setLight(Light light) {
        this.light = light;
    }

    public Window getWindow() {
        return this.window;
    }

    public void setWindow(Window window) {
        this.window = window;
    }

    public int getFlatNum() {
        return this.flatNum;
    }

    public void setFlatNum(int flatNum) {
        if (flatNum > 0 && flatNum < 500) {
            this.flatNum = flatNum;
        }
    }

    public boolean getStatus() {
        return this.status;
    }

    public void buildAppartment() {
        System.out.println("Квартира построилась!!!");
        status = true;
    }

    public void openWindow() {
        if (status) {
            if (window.getStWin()) {
                System.out.println("Окно уже открыто!!!");
            } else {
                System.out.println("Вы открыли окно!!");
                window.setStWin(true);
            }
        } else {
            System.out.println("Квартира еще не построена!");
        }
    }

    public void closeWindow() {
        if (status) {
            if (!window.getStWin()) {
                System.out.println("Окно еще не открывалось!!!");
            } else {
                System.out.println("Вы закрыли окно!!");
                window.setStWin(false);
            }
        } else {
            System.out.println("Квартира еще не построена!");
        }
    }

    public void openDoor() {
        if (status) {
            if (door.getStDoor()) {
                System.out.println("Дверь уже открыта!!!");
            } else {
                System.out.println("Вы открыли дверь!!");
                door.setStDoor(true);
            }
        } else {
            System.out.println("Квартира еще не построена!");
        }
    }

    public void closeDoor() {
        if (status) {
            if (!door.getStDoor()) {
                System.out.println("Дверь еще не открывалась!!!");
            } else {
                System.out.println("Вы закрыли дверь!!");
                door.setStDoor(false);
            }
        } else {
            System.out.println("Квартира еще не построена!");
        }
    }

    public void turnOnLight() {
        if (status) {
            if (light.getStLight()) {
                System.out.println("Свет уже включен!!!");
            } else {
                System.out.println("Вы включили свет!!");
                light.setStLight(true);
            }
        } else {
            System.out.println("Квартира еще не построена!");
        }
    }

    public void turnOffLight() {
        if (status) {
            if (!light.getStLight()) {
                System.out.println("Свет еще не включался!!!");
            } else {
                System.out.println("Вы включили свет!!");
                light.setStLight(false);
            }
        } else {
            System.out.println("Квартира еще не построена!");
        }
    }

    @Override
    public String toString() {
        return "Appartment{" +
                "door=" + door +
                ", light=" + light +
                ", window=" + window +
                ", flatNum=" + flatNum +
                ", status=" + status +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Appartment that = (Appartment) o;
        return flatNum == that.flatNum && status == that.status && Objects.equals(door, that.door) && Objects.equals(light, that.light) && Objects.equals(window, that.window);
    }

    @Override
    public int hashCode() {
        return Objects.hash(door, light, window, flatNum, status);
    }
}
