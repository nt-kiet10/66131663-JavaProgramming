package thuchanh3;
import java.util.Scanner;
public class thuchanh3 {
	public static void main(String[] args) {
		int a,b;
		Scanner c=new Scanner(System.in);
		System.out.println("nhập a:");
		a=c.nextInt();
		System.out.println("nhập b:");
		b=c.nextInt();
		if(a!=0&&b!=0) {
			double d=(double)-b/a;
			System.out.printf("phương trình có nghiệm x=%f",d);
		}else if(b==0){
			System.out.println("phương trình vô số nghiệm.");
		}else {
			System.out.println("phương trình vô nghiệm.");
		}
		c.close();
	}
}
