interface Shape1 {
    void input();

    void area();
    void perimeter();
}

class Circle implements Shape1 {
    int r = 0;
    double pi = 3.14, area = 0, perimeter =0;

    @Override
    public void input() {
        r = 5;
    }

    @Override
    public void area() {
        area = pi * r * r;
        System.out.println("Area of circle: " + area);
    }
    @Override
    public void perimeter() {
        perimeter = 2 * pi * r;
        System.out.println("Perimeter of circle: " + perimeter);
    }
}

class Cylinder extends Circle {
    int h = 0;
    int r = 0;
    double area;

    public void input() {
        super.input();
        h = 6;
        r = 4;
    }
    @Override
    public void area() {
        super.area();
        area = (2 * pi * r * r)+(2 * pi * h);
        System.out.println("Area of Cylinder: " + area);
    }
    @Override
    public void perimeter() {
        super.perimeter();
        perimeter = (4 * r)+ 2 * h;
        System.out.println("Perimeter of Cylinder: " + perimeter);
    }
}

public class Shape {
    public static void main(String[] args) {
        Cylinder obj = new Cylinder();
        obj.input();
        obj.area();
        obj.perimeter();
    }
}