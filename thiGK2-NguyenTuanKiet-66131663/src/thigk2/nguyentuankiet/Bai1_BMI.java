package thigk2.nguyentuankiet;
import java.util.Scanner;
public class Bai1_BMI {
    
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner sc = new Scanner(System.in);
      
      System.out.println("Nhap can nang cua ban:");
      double weight = sc.nextDouble();
      System.out.println("Nhap chieu cao cua ban:");
      double height = sc.nextDouble();
      
      double bmi = weight / (height * height );
      System.out.println("Chi so BMI:" + bmi);
      
      if (bmi < 18.5) {
          System.out.println("Phân loại: Thiếu cân");
      } else if (bmi < 25) {
          System.out.println("Phân loại: Bình thường");
      } else if (bmi < 30) {
          System.out.println("Phân loại: Thừa cân");
      } else {
          System.out.println("Phân loại: Béo phì");
      }
      sc.close();
      
	}

}
