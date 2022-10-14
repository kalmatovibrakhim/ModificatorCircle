public class Circle {
    private static final double PI=3.14;
    private static int radius;

    public Circle() {
    }

    public double getPI() {
        return PI;
    }

    public static int getRadius() {
        return radius;
    }

    public static void setRadius(int radius) {
        Circle.radius = radius;
    }

    public static double area(){
        return   PI*(radius*radius);
    }
    public static double circumference(){
        return PI*2*radius;
    }
}
