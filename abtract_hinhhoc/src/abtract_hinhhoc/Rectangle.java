package abtract_hinhhoc;

public class Rectangle extends Shape {
	
	private double width;
	private double height;
	public Rectangle(String color,double width,double height) {	
		super(color);
		this.height=height;
		this.width=width;
}
	@Override
	public double getArea() {
		return width * height ;
	}
	@Override
	public double getChuVi() {
		return (width+height)*2;
	}
	public void scale(double factor) {
		width*=factor;
		height*=factor;
	}
    public double getDiagonal()
    {
    	return Math.sqrt(height*height + width*width);
    }
}
