package iostream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.RandomAccessFile;


public class MyRandomAccessFile {
	private static String fileName = "D://passwords.txt";

	public static void main(String[] args) {
		File file = new File(fileName);
		System.out.println("File Available ?"+file.exists());
		RandomAccessFile raf = null;
		String s;
		try {
			raf = new RandomAccessFile(file,"r");
		}catch(FileNotFoundException e) {
			System.out.println("File not found exception"+e.getMessage());
		}
		try {
			raf.seek(10);
			//byte[] bytes = new byte[2];
			
			int bites = raf.read();
			
			while(bites != -1) {
				System.out.print((char)bites);
				bites = raf.read();
			}
		
		}catch(IOException e){
			System.out.println("There is IO Exception"+e.getMessage());
		}
	}

}
