public class TestCircle {
    public static void main(String[] args) {
        Circle_ circle1 = new Circle_();
        System.out.println("Radius: " + circle1.getRadius());
        System.out.println("Area: " + circle1.getArea());
        Circle_ circle2 = new Circle_(2.5);
        System.out.println("Radius: " + circle2.getRadius());
        System.out.println("Area: " + circle2.getArea());
    }
}
