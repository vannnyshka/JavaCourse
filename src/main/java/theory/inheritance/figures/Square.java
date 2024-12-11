package theory.inheritance.figures;

public class Square extends Rectangle{

    public Square(int width, int height){
        if(width != height){
            System.out.println("У квадрата не может ширина не равняться высоте.");
        } else {
            this.width = width;
            this.height = height;
        }
    }

    public Square(int with){
        super(with,with);
    }

    @Override
    public void setWidth(int width) {
        this.width = width;
        this.height = width;
    }

    //or

    @Override
    public void setHeight(int height) {
        super.setHeight(height);
        super.setWidth(height);
    }
}
