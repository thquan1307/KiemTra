package quan.dev;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class Project03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			FileInputStream fis = new FileInputStream("in.txt");
		BufferedReader br = new BufferedReader(new InputStreamReader(fis));
		
		String line;
		while((line = br.readLine()) != null) {
			System.out.println(line);
		}
		br.close();
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}

}
