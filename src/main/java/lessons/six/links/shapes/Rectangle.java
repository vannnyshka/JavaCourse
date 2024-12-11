package lessons.six.links.shapes;

import java.awt.*;
import java.awt.geom.Path2D;


public class Rectangle extends Shape {

    int[] xPoints;
    int[] yPoints;

    private int x2;
    private int y2;
    private int x3;
    private int y3;
    private Color color;

    public Rectangle(int[] xPoints, int[] yPoints, Color color) {
        super(xPoints[0], yPoints[0], color);
        this.yPoints = yPoints;
        this.xPoints = xPoints;
    }

    @Override
    public void draw(Graphics2D g2d) {
        super.draw(g2d);
        Path2D path = new Path2D.Double();
        path.moveTo(xPoints[0], yPoints[0]);
        path.lineTo(xPoints[1], yPoints[1]);
        path.lineTo(xPoints[2], yPoints[2]);
        path.closePath();
        g2d.fill(path);
    }


}
