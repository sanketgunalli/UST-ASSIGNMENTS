package assignment9;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class App9 {

	public static void main(String[] args) {
		try {
			FileReader fr = new FileReader("E:\\student.csv");
			BufferedReader br = new BufferedReader(fr);
			String line;
			while((line=br.readLine())!=null) {
				String [] s=line.split(",");
				if(s.length<3 || s[2].trim().isEmpty()) {
					continue;
				}
				try {
					int mark = Integer.parseInt(s[2]);
					System.out.println("ID: "+s[0]+"\nName: "+s[1]+"\nMark: "+mark);
					System.out.println("---------------------");
				}catch(NumberFormatException e) {
					continue;
				}
			}
			br.close();
			
		}catch(IOException e) {
			System.out.println("Error while readind the file");
		}

	}

}