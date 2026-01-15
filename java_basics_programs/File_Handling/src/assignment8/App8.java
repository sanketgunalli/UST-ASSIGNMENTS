package assignment8;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class App8 {

	public static void main(String[] args) {
		try {
			FileReader fr = new FileReader("E:\\student.csv");
			BufferedReader br = new BufferedReader(fr);
			File f1 = new File("E:\\passed_students.csv");
			FileWriter fw = new FileWriter(f1);
			String line;
			line = br.readLine();
			fw.write(line+"\n");
			while((line = br.readLine()) != null) {
				String data [] = line.split(",");
				if(Integer.parseInt(data[2]) >=50) {
					fw.write(line+"\n");
				}
			}
			br.close();
			fw.close();
			System.out.println("Passed Student Copied Successfully");
		}catch(IOException e){
			System.out.println("An error occurred while reading");
		}
		
	}

}