package abstract_HinhHoc;

public class Circle extends Shape {
    
    // Thuộc tính riêng của hình tròn
    private double radius;

    // Constructor
    public Circle(String color, double radius) {
        super(color); // gọi constructor lớp cha
        this.radius = radius;
    }

    // Override phương thức tính diện tích
    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    // Override phương thức tính chu vi
    @Override
    public double getP() {
        return 2 * Math.PI * radius;
    }

    // Phóng to hình (tăng bán kính)
    @Override
    public void scale(double factor) {
        radius *= factor;
    }

    // Phương thức riêng của hình tròn
    public double getD() {
        return radius * 2;
    }
}
