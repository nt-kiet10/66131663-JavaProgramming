package kietnt;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.FileInputStream;

public class ViDuDocFile {

	public static void main(String[] args) throws IOException{
		
	    FileInputStream fInput = new FileInputStream("baihat.txt");
		//Khai báo biến đối tượng InputStreamReader 
		InputStreamReader ipReader = new InputStreamReader(fInput);
		
		//Khai báo biến đối tượng 
		BufferedReader bufReader = new BufferedReader(ipReader);
		
		//Đọc dòng 1 từ file 
		String line1 = bufReader.readLine();
		//In ra dòng đọc được 
        System.out.println(line1);
        String line2 = bufReader.readLine();
		//In ra dòng đọc được 
        System.out.println(line2);
	}
}
