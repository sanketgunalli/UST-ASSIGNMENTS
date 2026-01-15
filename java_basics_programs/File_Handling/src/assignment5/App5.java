package assignment5;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class App5 {

	public static void main(String[] args) {
		try {
			FileReader fr = new FileReader("E:\\student.csv");
			BufferedReader br = new BufferedReader(fr);
			String line;
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the Student Name: ");
			String name = sc.nextLine();
			boolean t = true;
			
			while((line = br.readLine()) != null) {
				String data [] = line.split(",");
				if(data[1].equalsIgnoreCase(name)) {
					t=false;
					System.out.println("ID: "+data[0]+"\nName: "+data[1]+"\nMark: "+data[2]);
				}	
			}
			if(t)
			System.out.println("Details Not found");
			br.close();
			sc.close();
		}catch(IOException e) {
			System.out.println("An error occurred while read the file");
		}
		

	}

}