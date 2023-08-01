//// question:- Wpj to set the value of radius of a cylinder and get the value of
//// area back to main method using getter and setter.
////set value of radius using setter.
////get me back the area using getter.
public class Cylinder1 {
    private double radius;
    private double height;

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public void setHeight(double height) {
        this.height = height;
    }

    public double getArea() {
        return 2 * Math.PI * radius * radius+2*Math.PI*radius*height;
    }
    public static void main(String[] args) {
        Cylinder1 cylinder1 = new Cylinder1();
        cylinder1.setRadius(8.1);
        cylinder1.setHeight(5.5);
        System.out.println("the area of the cylinder is:" + cylinder1.getArea());
    }
}






