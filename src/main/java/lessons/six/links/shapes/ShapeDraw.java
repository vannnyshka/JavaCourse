package lessons.six.links.shapes;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class ShapeDraw extends JPanel {

    private List<Shape> shapes = new ArrayList<>();

    public void addShape(Shape shape) {
        shapes.add(shape);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        Graphics2D g2d = (Graphics2D) g;

        for (Shape shape : shapes) {
            shape.draw(g2d);
        }

    }
}
