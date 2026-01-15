package assignment10;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class App10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String line,result="";
		int max = 0;
		try(BufferedReader br = new BufferedReader(new FileReader("E:\\student.csv"))){
			while((line = br.readLine())!=null) {
				if(line.startsWith("id")) {
					continue;
				}
				else {
					String [] s = line.split(",");
					int mark = Integer.parseInt(s[2]);
					if(max<mark) {
						max = mark;
						result = line;
					}
				}
			}
			System.out.println(result);
			
		}catch(IOException e) {
			System.out.println("An error occurred while reading");
		}
	}

}