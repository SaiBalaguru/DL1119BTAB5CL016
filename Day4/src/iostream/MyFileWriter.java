package iostream;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class MyFileWriter {
	private static String filename = "D://passwords.txt";

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileWriter fw = null;
		try {
			fw = new FileWriter(filename);
		}catch(IOException e) {
			e.printStackTrace();
		}
		PrintWriter out = null;
		out = new PrintWriter(fw);
		out.println("Hello");
		out.println("Good");
		out.println("Morning");
		out.flush();
		if(fw!=null) {
			try {
				fw.close();
			}catch(IOException e) {
				e.printStackTrace();
			}
		}

	}

}
