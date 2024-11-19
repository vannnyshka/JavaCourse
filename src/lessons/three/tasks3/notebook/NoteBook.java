package lessons.three.tasks3.notebook;

import java.util.Objects;

public class NoteBook {

    private int countPage;
    private double height;
    private double weight;

    public NoteBook() {

    }

    public NoteBook(int countPage, double hight, double weight) {
        this.countPage = countPage;
        this.height = hight;
        this.weight = weight;
    }

    public int getCountPage() {
        return this.countPage;
    }

    public void setCountPage(int countPage) {
        this.countPage = countPage;
    }

    public double getHeight() {
        return this.height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return this.weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "NoteBook pages: " + countPage + "." + height + "x" + weight;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        NoteBook noteBook = (NoteBook) o;
        return countPage == noteBook.countPage && Double.compare(height, noteBook.height) == 0 && Double.compare(weight, noteBook.weight) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(countPage, height, weight);
    }
}
