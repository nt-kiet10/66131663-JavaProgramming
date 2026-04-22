package abtract_hinhhoc;

public class Circle extends Shape {
   
	private double radius;
	
	public Circle(String color,double radius)
	{
		super(color);
		this.radius=radius;
		
	}

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return Math.PI * Math.pow(radius, 2);
	}

	@Override
	public double getChuVi() {
		// TODO Auto-generated method stub
		return Math.PI * radius * 2;
	}

	@Override
	public void scale(double factor) {
		// TODO Auto-generated method stub
		radius*=factor;
	}
	public double getDiameter()
	{
		return radius * 2;
	}
}
