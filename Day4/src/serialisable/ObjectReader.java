package serialisable;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;

public class ObjectReader {

	public static void main(String[] args) {
		try {
		// TODO Auto-generated method stub
		InputStream fis = new FileInputStream("std.ser");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Student st = (Student)ois.readObject();
		System.out.println(st);
		ois.close();
		}catch(IOException e) {
			System.out.println("Object could not be read"+e.getMessage());
		}catch(ClassNotFoundException e1) {
			System.out.println("Class not found"+e1.getMessage());
		}
	}

}
