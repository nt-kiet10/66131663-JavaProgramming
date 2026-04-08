package abstract_HinhHoc;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        // Danh sách chứa nhiều loại Shape (đa hình)
        ArrayList<Shape> list = new ArrayList<>();

        System.out.print("Enter number of shapes: ");
        int n = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < n; i++) {
            System.out.println("\n--- Shape " + (i + 1) + " ---");

            int choice;
            do {
                System.out.println("1. Circle | 2. Rectangle");
                choice = Integer.parseInt(sc.nextLine());
            } while (choice < 1 || choice > 2);

            Shape s; // 👉 biến đa hình

            if (choice == 1) {
                System.out.print("Enter radius: ");
                double r = Double.parseDouble(sc.nextLine());

                System.out.print("Enter color: ");
                String color = sc.nextLine();

                s = new Circle(color, r); // 👉 Shape = Circle

                // Ép kiểu để dùng phương thức riêng
                System.out.println("Diameter: " + ((Circle) s).getD());

            } else {
                System.out.print("Enter width: ");
                double w = Double.parseDouble(sc.nextLine());

                System.out.print("Enter height: ");
                double h = Double.parseDouble(sc.nextLine());
                
                System.out.print("Enter color: ");
                String color = sc.nextLine();
                s = new Rectangle(color, w, h); // 👉 Shape = Rectangle
                System.out.println("Diagonal: " + ((Rectangle) s).getDiagonal());
            }
            // Phóng to
            System.out.print("Enter scale factor: ");
            double f = Double.parseDouble(sc.nextLine());
            s.scale(f);

            // Thêm vào danh sách
            list.add(s);
        }
        for (Shape s : list) {
            s.displayInfo(); // 👉 tự gọi đúng Circle hoặc Rectangle
        }
        sc.close();
	}
}
