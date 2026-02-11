package thuchanh1;
import java.util.Scanner;

public class thuchanh1 {

    public static void main(String[] args) {

        int gio;
        double tongluong, luong;

        Scanner c = new Scanner(System.in);

        System.out.print("Nhập số giờ làm: ");
        gio = c.nextInt();

        System.out.print("Nhập lương mỗi giờ: ");
        luong = c.nextDouble();

        if (gio < 0 || luong < 0) {
            System.out.println("Dữ liệu không hợp lệ!");
        } else {
            if (gio <= 40) {
                tongluong = luong * gio;
            } else {
                int tangca = gio - 40;
                tongluong = luong * 40 + tangca * luong * 1.5;
            }

            System.out.printf("Tổng lương sau %d giờ là: %.1f đồng\n", gio, tongluong);
        }

        c.close();
    }
}
