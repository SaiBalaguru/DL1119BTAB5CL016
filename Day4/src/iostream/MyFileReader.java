package iostream;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class MyFileReader {
	private static String fileName = "D://data.txt";
	private static String filename1 = "D://user_pass.txt";

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file = new File(fileName);
		System.out.println("File Available ?"+file.exists());
		System.out.println(file.getPath());
		FileReader reader = null;   //opens file for reading
		BufferedReader buffer = null;  //for using readline()
		if(file.exists()) {
			try {
				 reader = new FileReader(file);
			}catch(FileNotFoundException e) {
				System.out.println("File does not Exist");
				e.printStackTrace();
			}
			buffer = new BufferedReader(reader);
			String line = "";
			try {
				line = buffer.readLine();
				while(line!=null) {
					System.out.println(line);
					line = buffer.readLine();
				}
			}catch(IOException e) {
				System.out.println("Error Reading the file "+e.getMessage());
			}
	
		}
		File file1 = new File(filename1);
		FileReader reader1 = null;
		BufferedReader buffer1 = null; 
		try {
			reader1 = new FileReader(file1);
		}catch(FileNotFoundException e) {
			System.out.println("File not found Exception");
			e.printStackTrace();
		}
		buffer1 = new BufferedReader(reader1);
		String line1 = "";
		String[] temp = new String[2] ;				
		try {
			line1 = buffer1.readLine();
			while(line1!=null) {
				temp = line1.split(";");
				System.out.println("Username: "+temp[0]+"password: "+temp[1]);
				line1 = buffer1.readLine();
			}
		}catch(IOException e) {
			System.out.println("Error Reading the file "+e.getMessage());
		}
		
	}

}
