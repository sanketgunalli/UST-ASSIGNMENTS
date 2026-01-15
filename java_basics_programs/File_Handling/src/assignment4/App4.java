package assignment4;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class App4 {

	public static void main(String[] args) {
		try {
			FileReader fr = new FileReader("E:\\student.csv");
			BufferedReader br = new BufferedReader(fr);
			String line;
			int count = 0;
			while((line = br.readLine()) != null) {
				if(line.startsWith("id")) {
					continue;
				}
				count++;
			}
			System.out.println("Total number of students: "+count);
			br.close();
		}catch(IOException e) {
			System.out.println("An error occurred while read the file");
		}
		
	}

}