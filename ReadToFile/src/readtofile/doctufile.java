package readtofile;
import java.io.BufferedReader;
import java.io.FileReader;
public class doctufile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		        try {
		            FileReader fr = new FileReader("input.txt");
		            BufferedReader br = new BufferedReader(fr);

		            String line;
		            while ((line = br.readLine()) != null) {
		                System.out.println(line);
		            }

		            br.close();
		            fr.close();
		        } catch (Exception e) {
		            System.out.println("Lỗi đọc file!");
		            e.printStackTrace();
		        }
		    }
	}

		 

