package baitap3;
import java.util.Scanner;

public class baitap3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    Scanner sc = new Scanner(System.in);
        
	    System.out.println("Nhập cân nặng (kg) :");
	    double weight = sc.nextDouble(); 
	    
	    System.out.println("Nhập chiều cao (m) :");
	    double height = sc.nextDouble(); 
	    
        double bmi = weight / (height * height);
        System.out.println("Chỉ số BMI: "+bmi );
        
        // Phân loại BMI
        if (bmi < 18.5) {
            System.out.println("Phân loại: Thiếu cân");
        } else if (bmi < 25) {
            System.out.println("Phân loại: Bình thường");
        } else if (bmi < 30) {
            System.out.println("Phân loại: Thừa cân");
        } else {
            System.out.println("Phân loại: Béo phì");
        }
	}

}
