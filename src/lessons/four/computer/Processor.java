package lessons.four.computer;

import java.util.Objects;

public class Processor {
    private String name;

    public Processor() {

    }

    public Processor(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Processor{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Processor processor = (Processor) o;
        return Objects.equals(name, processor.name);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(name);
    }
}
