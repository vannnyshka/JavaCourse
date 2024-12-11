package lessons.six.links.abstruct.shapes;


import java.util.Objects;

public class Circle extends Shape {

    int x;
    int y;
    int radius;

    public Circle(Color color, int x, int y, int radius) {
        super(color);
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getRadius() {
        return radius;
    }

    @Override
    public void draw() {
        System.out.println(super.getColor().getAnsi() + "Drawing " + super.getColor().getName() + " circle in x = " + this.x + "; y = " + this.y + " with radius = " + this.radius);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Circle circle = (Circle) o;
        return x == circle.x && y == circle.y && radius == circle.radius;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y, radius);
    }

    @Override
    public String toString() {
        return "Circle{" +
                "x=" + x +
                ", y=" + y +
                ", radius=" + radius +
                '}';
    }
}
