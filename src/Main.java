public class Main {
    public static void main(String[] args) {

        Circle circle = new Circle();
        Circle.setRadius(5);
        System.out.println("Area of circle = "+Circle.area());
        System.out.println("Circumference of circle = "+Circle.circumference());

    }
}