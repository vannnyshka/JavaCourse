package lessons.six.links.abstruct.shapes;

import java.util.Arrays;
import java.util.Objects;

public class Rectangle extends Shape {

    int[] xPoints;
    int[] yPoints;
    Color color;

    public Rectangle(Color color, int[] xPoints, int[] yPoints) {
        super(color);
        this.yPoints = yPoints;
        this.xPoints = xPoints;
    }


    @Override
    public void draw() {
        System.out.print(super.getColor().getAnsi() + "Drawing " + super.getColor().getName() + " rectangle in x = {");
        for (int x : xPoints) {
            System.out.print(x + ", ");
        }
        System.out.println("}; y = {");
        for (int y : yPoints) {
            System.out.print(y + ", ");
        }
        System.out.println("}");
    }

    public int[] getxPoints() {
        return xPoints;
    }

    public int[] getyPoints() {
        return yPoints;
    }

    @Override
    public Color getColor() {
        return color;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Rectangle rectangle = (Rectangle) o;
        return Objects.deepEquals(xPoints, rectangle.xPoints) && Objects.deepEquals(yPoints, rectangle.yPoints) && color == rectangle.color;
    }

    @Override
    public int hashCode() {
        return Objects.hash(Arrays.hashCode(xPoints), Arrays.hashCode(yPoints), color);
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "xPoints=" + Arrays.toString(xPoints) +
                ", yPoints=" + Arrays.toString(yPoints) +
                ", color=" + color +
                '}';
    }
}
