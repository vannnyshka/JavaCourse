package lessons.six.links.shapes;

import java.awt.*;

public class Shape {

    protected int x;
    protected int y;
    protected Color color;

    public Shape(int x, int y, Color color) {
        this.x = x;
        this.y = y;
        this.color = color;
    }

    public void draw(Graphics2D g2d) {
        g2d.setColor(this.color);
    }
}


