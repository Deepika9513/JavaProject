public class rectanglejava {


    public static int area_of_rectangle(int l, int b) {
        int a;
        a = l * b;
        return a;
    }

    public static int perimeter_of_rectangle(int l, int b) {
        int p;
        p = 2*(l + b);
        return p;
    }

    public static void main(String[] args) {

        int area=area_of_rectangle(3,4);
        int perimeter=perimeter_of_rectangle(3,4);
        System.out.println("Area of the rectangle: " +area);
        System.out.println("perimeter of the Rectangle: " +perimeter);
    }
}





