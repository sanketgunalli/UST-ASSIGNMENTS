package assignment2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class App2 {

	public static void main(String[] args) {
		try {
			FileReader fr = new FileReader("E:\\student.csv");
			BufferedReader br = new BufferedReader(fr);
			String line;
			boolean t=true;
			while((line = br.readLine()) != null) {
				if(t) {
					t=false;
					continue;
				}
				String data []=line.split(",");
				System.out.println("ID: "+data[0]+"\nName: "+data[1]+"\nMark: "+data[2]);
				System.out.println("----------------");
			}
			br.close();
		}catch(IOException e) {
			System.out.println("An error occurred while read the file");
		}
		

	}

}