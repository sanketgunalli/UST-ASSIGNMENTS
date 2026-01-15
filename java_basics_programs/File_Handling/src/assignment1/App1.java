
package assignment1;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class App1 {

	public static void main(String[] args) {
		try {
			File f1 = new File("E:\\student.csv");
			if(f1.createNewFile()) {
				System.out.println("File created: "+f1.getName());
			}
			else {
				System.out.println("File already Exist");
			}
			FileWriter w1 = new FileWriter(f1);
			w1.write("id,name,marks\n");
			w1.write("101,Ravi,78\n");
			w1.write("102,Anita,85\n");
			w1.write("103,Sunil,35\n");
			w1.write("104,Priya,92\n");
			w1.write("105,Aman,42\n");
//			w1.write("106,Harish\n");
			w1.close();
			System.out.println("Data written Successfully");
		}catch(IOException e) {
			System.out.println("An error occurred.");
		}
	}

}