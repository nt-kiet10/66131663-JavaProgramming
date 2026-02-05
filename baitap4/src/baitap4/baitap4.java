package baitap4;

import java.util.Scanner;

public class baitap4 {
    public static void main(String[] args) {
    	/* Tính tiền điện theo bậc thang:
        - 0-50 kWh: 1,678 đ/kWh
        - 51-100 kWh: 1,734 đ/kWh
        - 101-200 kWh: 2,014 đ/kWh
        - 201-300 kWh: 2,536 đ/kWh
        - Trên 300 kWh: 2,834 đ/kWh
        */
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số điện tiêu thụ (kWh): ");
        int soDien = sc.nextInt();

        double tien = 0;

        if (soDien <= 50) {
            tien = soDien * 1678;
        } else if (soDien <= 100) {
            tien = 50 * 1678 + (soDien - 50) * 1734;
        } else if (soDien <= 200) {
            tien = 50 * 1678 + 50 * 1734 + (soDien - 100) * 2014;
        } else if (soDien <= 300) {
            tien = 50 * 1678 + 50 * 1734 + 100 * 2014 + (soDien - 200) * 2536;
        } else {
            tien = 50 * 1678 + 50 * 1734 + 100 * 2014 + 100 * 2536 + (soDien - 300) * 2834;
        }

        System.out.println("Số điện tiêu thụ: " + soDien + " kWh");
        System.out.printf("Tiền điện phải trả: %.0f đ\n", tien);

        sc.close();
    }
}
