package abtract_hinhhoc;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
		ArrayList<Shape> list = new ArrayList<Shape>();
		
		System.out.print("Nhap so hinh :");
		int n = Integer.parseInt(sc.nextLine());
		for(int i=0;i<n;i++)
		{
			System.out.print("Hinh thu " + (i+1) + ":");
			
			int x;
			
			do {
				System.out.print("(1.Circle | 2.Rectangle):");
				x= Integer.parseInt(sc.nextLine());
			}while(x<1||x>2);
			
			Shape s;
			if(x==1)
			{
				System.out.print("Radius: " );
				double r = Double.parseDouble(sc.nextLine());
				
				System.out.print("Color: " );
				String color = sc.nextLine();
				
				s = new Circle(color, r);
				
				System.out.println("Diameter: " + ((Circle)s).getDiameter());
				
			}
			else {
				System.out.print("Width: " );
				double w = Double.parseDouble(sc.nextLine());
				
				System.out.print("Height: " );
				double h = Double.parseDouble(sc.nextLine());
				
				System.out.print("Color: " );
				String color = sc.nextLine();
				
				s= new Rectangle(color, w, h);
				
				System.out.println("Diagonal: " + ((Rectangle)s).getDiagonal());
			}
			
			System.out.print("Enter scale factor: ");
			double f= Double.parseDouble(sc.nextLine());
			s.scale(f);
			list.add(s);
		}
		
		for(Shape s:list) {
			System.out.println(s.displayInfo());
		}
       sc.close();
	}

}
