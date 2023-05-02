package lec_14;
//Борисков Д.А.
// Абстрактный класс Figure
abstract class Figure {
    protected double centerX;
    protected double centerY;

    // Constructor
    public Figure(double centerX, double centerY) {
        this.centerX = centerX;
        this.centerY = centerY;
    }

    // Абстрактный метод получения площади фигуры
    public abstract double getArea();

    // Абстрактный метод получения периметра фигуры
    public abstract double getPerimeter();
}

// Класс Rectangle, который расширяет фигуру
class Rectangle extends Figure {
    protected double width;
    protected double height;

    // конструктор
    public Rectangle(double centerX, double centerY, double width, double height) {
        super(centerX, centerY);
        this.width = width;
        this.height = height;
    }

    // Override getArea() метод вычисления площади прямоугольника
    @Override
    public double getArea() {
        return width * height;
    }

    // Override getPerimeter() метод вычисления периметра прямоугольника
    @Override
    public double getPerimeter() {
        return 2 * (width + height);
    }
}

// Класс Triangle, который расширяет фигуру
class Triangle extends Figure {
    protected double side_a;
    protected double side_b;
    protected double side_c;

    // Constructor
    public Triangle(double centerX, double centerY, double side_a, double side_b, double side_c) {
        super(centerX, centerY);
        this.side_a = side_a;
        this.side_b = side_b;
        this.side_c = side_c;
    }

    // Override getArea() метод вычисления площади треугольника по формуле Герона
    @Override
    public double getArea() {
        double s = (side_a + side_b + side_c) / 2; // semi-perimeter
        return Math.sqrt(s * (s - side_a) * (s - side_b) * (s - side_c));
    }

    // Override getPerimeter() метод вычисления периметра треугольника
    @Override
    public double getPerimeter() {
        return side_a + side_b + side_c;
    }
}

public class lec_14_1 {
    public static void main(String[] args) {
        // Создание прямоугольника
        Rectangle rectangle = new Rectangle(0, 0, 5, 10);
        System.out.println("Прямоугольник:");
        System.out.println("Центр: (" + rectangle.centerX + ", " + rectangle.centerY + ")");
        System.out.println("Ширина: " + rectangle.width);
        System.out.println("Высота: " + rectangle.height);
        System.out.println("Площадь: " + rectangle.getArea());
        System.out.println("Периметр: " + rectangle.getPerimeter());

        System.out.println();

        // Создание треугольника
        Triangle triangle = new Triangle(0, 0, 3, 4, 5);
        System.out.println("Треугольник:");
        System.out.println("Центр: (" + triangle.centerX + ", " + triangle.centerY + ")");
        System.out.println("Сторона А: " + triangle.side_a);
        System.out.println("Сторона В: " + triangle.side_b);
        System.out.println("Сторона С: " + triangle.side_c);
        System.out.println("Площадь: " + triangle.getArea());
        System.out.println("Периметр: " + triangle.getPerimeter());
    }
}
