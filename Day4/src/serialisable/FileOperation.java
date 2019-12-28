package serialisable;

import java.io.File;
import java.sql.Date;

public class FileOperation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file = new File("D://mydata");
		boolean done = file.mkdir();
		System.out.println(done);
		String[] files = file.list();
//		for(String s: files) {
//			System.out.println(s);
//		}
		listFile(file);
	}
	public static void listFile(File file) {
		System.out.println("File Name       Last Modified      Size");
		for(File s: file.listFiles()) {
			System.out.println(s.getName()+"\t"+(new Date(s.lastModified()))+"\t"+s.getTotalSpace());
		}
	}

}
