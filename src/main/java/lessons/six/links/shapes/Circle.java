package lessons.six.links.shapes;


import java.awt.*;
import java.awt.geom.Ellipse2D;

public class Circle extends Shape {

    private int radius;
    private Color color;

    public Circle(int x, int y, int radius, Color color) {
        super(x, y, color);
        this.radius = radius;
    }

    @Override
    public void draw(Graphics2D g2d) {
        super.draw(g2d);
        g2d.fill(new Ellipse2D.Double(x - radius, y - radius, radius * 2, radius * 2));
    }
}
