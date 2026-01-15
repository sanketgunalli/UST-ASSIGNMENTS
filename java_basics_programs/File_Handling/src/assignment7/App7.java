package assignment7;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class App7 {

	public static void main(String[] args) {
		try {
			FileReader fr = new FileReader("E:\\student.csv");
			BufferedReader br = new BufferedReader(fr);
			String line;
			int count = 0,sum = 0;
			while((line = br.readLine()) != null) {
				if(line.startsWith("id")) {
					continue;
				}
				String data [] = line.split(",");
				sum+=Integer.parseInt(data[2]);
				count++;
			}
			System.out.println("Average Marks of students: "+(double)(sum/count));
			br.close();
		}catch(IOException e) {
			System.out.println("An error occurred while read the file");
		}
		

	}

}