package lesson4.computer;

import java.util.Objects;

public class OperativeMemory {

    private String name;

    public OperativeMemory(){

    }

    public OperativeMemory(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }

    @Override
    public String toString() {
        return "OperativeMemory{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OperativeMemory that = (OperativeMemory) o;
        return Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(name);
    }
}
