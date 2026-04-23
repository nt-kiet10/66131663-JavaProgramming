package thigk2.nguyentuankiet_bai3;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;
public class DocFile {

	public static void main(String[] args) {
		String fileName = "number.txt";
		ArrayList<Integer> File =new ArrayList<Integer>();
		try {
            File file = new File(fileName);
            if (!file.exists()) {
                PrintWriter pw = new PrintWriter(file);
                for (int i = 1; i <= 100; i++) pw.println((int)(Math.random() * 100));
                pw.close();
            }
          BufferedReader br = new BufferedReader(new FileReader(fileName));
            String line;
            System.out.println("Nội dung danh sách số trong file:");
            while ((line = br.readLine()) != null) {
                int n = Integer.parseInt(line.trim());
                File.add(n);
                System.out.print(n + " ");
            }
            br.close();
	
		Scanner sc = new Scanner(System.in);
    System.out.print("\n\nNhập giá trị X (ký tự cuối MSSV): ");
    int x = sc.nextInt();

    if (File.contains(x)) {
        System.out.println("Giá trị " + x + " CÓ trong danh sách.");
    } else {
        System.out.println("Giá trị " + x + " KHÔNG có trong danh sách.");
    }

     
	}catch (IOException e) {
    System.out.println("Lỗi đọc file: " + e.getMessage());
    } catch (NumberFormatException e) {
    System.out.println("File chứa dữ liệu không phải số nguyên.");
    } finally {
		
	}
  }
}
