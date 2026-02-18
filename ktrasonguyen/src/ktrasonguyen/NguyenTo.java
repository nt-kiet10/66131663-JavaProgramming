package ktrasonguyen;
import java.util.Scanner; 
public class NguyenTo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner sc = new Scanner(System.in);
      System.out.println("Nhap day so : ");
      int n = sc.nextInt();
      boolean laSNT = true;
      
      if(n<2) {
    	  laSNT=false;
      }
      else {
    	  for(int i = 2; i<=Math.sqrt(n);i++) {
    		  if(n%i==0) {
    		  laSNT = true;
    		  break;
    	  }
      }
    	  if(laSNT==true) {
    		  System.out.print(n + "la so nguyen to!");
    	  }
    	  else {
    		  System.out.print(n + "khong la so nguyen to!");
    	  }
       sc.close();
	}
}
}
