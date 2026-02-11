package thuchanh1;
import java.util.Scanner;


public class thuchanh1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int gio;
      double tongluong,luong;
      
      Scanner c= new Scanner(System.in);
      System.out.println("Nhập số giờ làm :");
      gio = c.nextInt();
      System.out.println("Nhập số lương :");
      luong = c.nextDouble();
      
      if(gio<=40) {
    	  tongluong = luong*gio;
      }
      else {
    	  int tangca = gio-40;
    	  tongluong = luong*40 + tangca*luong*1.5;
      }
      System.out.printf("Tổng lương của nhân viên sau %dh:%.1f đồng",gio,tongluong);
	}

}
