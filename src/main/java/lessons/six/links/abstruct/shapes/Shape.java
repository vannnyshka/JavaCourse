package lessons.six.links.abstruct.shapes;


public abstract class Shape {

    private Color color;

    public Color getColor() {
        return color;
    }

    public Shape(Color color) {
        this.color = color;
    }

    public abstract void draw();
}
