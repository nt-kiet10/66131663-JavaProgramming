package abstract_HinhHoc;

public abstract class Shape {
    
    // Thuộc tính chung: màu sắc
    protected String color;

    // Constructor
    public Shape(String color) {
        this.color = color;
    }

    // Getter
    public String getColor() {
        return color;
    }

    // Setter
    public void setColor(String color) {
        this.color = color;
    }

    // Lớp con BẮT BUỘC phải override
    public abstract double getArea();        // tính diện tích
    public abstract double getP();   // tính chu vi
    public abstract void scale(double factor); // phóng to hình

    // Phương thức có sẵn (dùng chung)
    public void displayInfo() {
        System.out.println("Color: " + color);
        System.out.println("Area: " + getArea());
        System.out.println("Perimeter: " + getP());
    }
}