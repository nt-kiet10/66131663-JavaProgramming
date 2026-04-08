package abstract_HinhHoc;

public class Rectangle extends Shape {

	    // Thuộc tính riêng
	    private double width;
	    private double height;

	    // Constructor
	    public Rectangle(String color, double width, double height) {
	        super(color);
	        this.width = width;
	        this.height = height;
	    }

	    // Tính diện tích
	    @Override
	    public double getArea() {
	        return width * height;
	    }

	    // Tính chu vi
	    @Override
	    public double getP() {
	        return 2 * (width + height);
	    }

	    // Phóng to hình (tăng cả chiều dài và rộng)
	    @Override
	    public void scale(double factor) {
	        width *= factor;
	        height *= factor;
	    }

	    // Phương thức riêng
	    public double getDiagonal() {
	        return Math.sqrt(width * width + height * height);
	    }
     }

	
