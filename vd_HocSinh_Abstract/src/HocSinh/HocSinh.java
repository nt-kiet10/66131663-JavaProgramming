package HocSinh;
import java.util.Scanner;
public class HocSinh {
       private String tenHS ;
       private int namSinh;
       
       public String getTen() {
		return tenHS;
	   }

	   public void setTen(String tenHS) {
		   this.tenHS = tenHS;
	   }

	   public int getNamSinh() {
		   return namSinh;
	   }

	   public void setNamSinh(int namSinh) {
		   this.namSinh = namSinh;
	   }

	   public HocSinh() 
          {
		   
          }
       
	   
	   public HocSinh(String tenHS,int namSinh ) {
		   this.tenHS = tenHS;
		   this.namSinh = namSinh;
	   }
	   
	   public void Nhap() {
		   Scanner sc = new Scanner(System.in);
		   System.out.print("Họ tên học sinh:");
		   tenHS = sc.nextLine();
		   System.out.print("\nNăm sinh:");
		   namSinh = sc.nextInt();
		   
	   }
	   
       
