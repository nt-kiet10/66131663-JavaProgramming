package circle;

public class runCircle {

    public static void main(String[] args) {

        Circle c1 = new Circle();
        System.out.println("C1 -> Bán kính: " + c1.getRadius()
                + ", Màu: " + c1.getColor()
                + ", Diện tích: " + c1.getArea());

        Circle c2 = new Circle(3.0);
        System.out.println("C2 -> Bán kính: " + c2.getRadius()
                + ", Màu: " + c2.getColor()
                + ", Diện tích: " + c2.getArea());

        Circle c3 = new Circle(5.0, "blue");
        System.out.println("C3 -> Bán kính: " + c3.getRadius()
                + ", Màu: " + c3.getColor()
                + ", Diện tích: " + c3.getArea());
    }
}