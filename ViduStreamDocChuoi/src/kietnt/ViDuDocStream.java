package kietnt;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ViDuDocStream {

	public static void main(String[] args) throws IOException{
		//Khai báo biến đối tượng InputStreamReader 
		InputStreamReader ipReader = new InputStreamReader(System.in);
		
		//Khai báo biến đối tượng 
		BufferedReader bufReader = new BufferedReader(ipReader);
		
		//In ra một phần hướng dẫn để User cần làm gì 
		System.out.print("Nhập một chuỗi bất kì :");
		
		//Đọc dữ liệu từ bàn phím, cất vào biến chuỗi 
			String lineRead = bufReader.readLine();
		
		//In ra dòng đọc được 
        System.out.print(lineRead);
	}
}
