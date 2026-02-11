package thuchanh2;
import java.util.Scanner;
public class thuchanh2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      double vnd;
      double usd=25000,eu=30000;
      Scanner c = new Scanner(System.in);
      System.out.printf("Nhap so tien:");
      vnd = c.nextDouble()	;
      System.out.printf("quy đổi USD sang VND=%.3f đ\n",vnd*usd);
	  System.out.printf("quy đổi EUR sang VND=%.3f đ\n",vnd*eu);
	c.close();
	}
   
}
