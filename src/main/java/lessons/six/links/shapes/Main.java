package lessons.six.links.shapes;

import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {

        ShapeDraw drawing = new ShapeDraw();

        // Создание фигур
        Circle circle = new Circle(150, 100, 25, Color.YELLOW);

        int[] xPoints = {50, 100, 20};
        int[] yPoints = {20, 100, 100};
        Rectangle triangle = new Rectangle(xPoints, yPoints,Color.RED);

        drawing.setBackground(Color.BLACK);

        // Добавление фигур в список фигур в классе ShapeDrawing
        drawing.addShape(circle);
        drawing.addShape(triangle);

        // Создаем фрейм
        JFrame frame = new JFrame();

        // Устанавливаем размер фрейма (250 пикселей в ширину и 250 пикселей в высоту)
        frame.setSize(250, 250);


        // Устанавливаем действие по умолчанию при закрытии фрейма на выход из программы
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.getContentPane().add(drawing);

        // Отображаем фрейм
        frame.setVisible(true);


    }
}

