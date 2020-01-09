package iostream;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.File;
import java.io.FileInputStream;
public class MyBinaryStream {
	
	
	public static void main(String[] args) {g
		if(args.length<2) {
			System.out.println("Usage: Java fileCopier infile outfile");
		} else {
			
			String inFile = args[0];
			String outFile = args[1];
			System.out.println(inFile+" "+outFile);
			FileInputStream fis = null;
			try {
				System.out.println(new File(inFile).exists());
				fis = new FileInputStream(inFile);
			}catch(FileNotFoundException e) {
				System.out.println(e.getMessage());
			}
			FileOutputStream fout = null;
			PrintStream out  =  null;
			try {
				fout = new FileOutputStream(outFile);
			}catch(FileNotFoundException e) {
				System.out.println(e.getMessage());
			}
			try {
				out = new PrintStream(fout);
				int bite = fis.read();
				while(bite!=-1) {
					out.print((char)bite);
					bite = fis.read();
				}
				out.flush();
			}catch(IOException e) {
				System.out.println(e.getMessage());
			}
		}	
	}

}
