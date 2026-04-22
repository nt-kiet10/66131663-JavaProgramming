package abtract_hinhhoc;

public abstract class Shape {
   private String color;

   public Shape(String color) {
	this.color = color;
   }

   public String getColor() {
	return color;
   }

   public void setColor(String color) {
	this.color = color;
   }
   
   public abstract double getArea();
   public abstract double getChuVi();
   public abstract void scale(double factor);

   public String displayInfo() {
	   return String.format("%s [Màu: %s, Diện tích: %.2f, Chu vi: %.2f]", 
               this.getClass().getSimpleName(), getColor(), getArea(), getChuVi());
   }
   
}
