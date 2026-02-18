package conngua;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap ten ngua: ");
        String ten = sc.nextLine();

        System.out.print("Nhap tuoi: ");
        int tuoi = sc.nextInt();
        sc.nextLine();

        System.out.print("Nhap mau long: ");
        String mauLong = sc.nextLine();

        System.out.print("Nhap can nang: ");
        double canNang = sc.nextDouble();

        Ngua ngua = new Ngua(ten, tuoi, mauLong, canNang);

        System.out.println("\n--- Thong tin ---");
        System.out.println("Ten: " + ngua.getTen());
        System.out.println("Tuoi: " + ngua.getTuoi());
        System.out.println("Mau long: " + ngua.getMauLong());
        System.out.println("Can nang: " + ngua.getCanNang() +" kg");

        ngua.chay();
        ngua.dungLai();
        ngua.keu();

        sc.close();
	}
}
