package lessons.six.links.abstruct.shapes;


import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Shape> shapes = new ArrayList<>();
        Circle circle = new Circle(Color.BLUE,50,50,50);
        shapes.add(circle);int[] xPoints = {50, 100, 0};
        int[] yPoints = {0, 100, 100};

        Rectangle rectangle = new Rectangle(Color.RED, xPoints, yPoints);
        shapes.add(rectangle);

        for (Shape shape : shapes) {
            shape.draw();
        }

    }
}

