package assignment5;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class App5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//    	File f= new File("sample.txt");

		BufferedReader br = null;
		BufferedWriter bw = null;

        try {
            // without this below line it throws exception
//        	if(f.createNewFile()) {
//        		System.out.println("file created successfully");
//        	}
//        	else {
//        		System.out.println("file already exist");
//        	}
//        	bw = new BufferedWriter(new FileWriter("data.txt"));
//        	bw.write("Welcome");
//        	bw.newLine();
//        	bw.write("to Java Program");
//        	bw.close();
//        	System.out.println("write successfully");
        	
        	 // Simulate file opening
            br = new BufferedReader(new FileReader("data.txt"));
            System.out.println("File opened successfully");

            // Simulate file reading
            String line;
            while((line= br.readLine())!=null) {
            	System.out.println(line);
            }
            System.out.println("Reading file...");
            

        } catch (IOException e) {
            System.out.println("Error while handling the file");

        } finally {
            // This block always executes
            try {
                if (br != null) {
                    br.close();
                    System.out.println("File closed in finally block");
                }
            } catch (IOException e) {
                System.out.println("Error while closing the file");
            }
	}

}
}