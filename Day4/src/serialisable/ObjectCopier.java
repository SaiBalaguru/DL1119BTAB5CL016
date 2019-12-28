package serialisable;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class ObjectCopier {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student st = new Student("Akash",1234);
		try {
		FileOutputStream fout = new FileOutputStream("std.ser");
		ObjectOutputStream oos = new ObjectOutputStream(fout);
		oos.writeObject(st);
		oos.flush();
		oos.close();
		System.out.println("Object Serialised");
		}catch(IOException e) {
			System.out.println("Object failed to Serialize"+e.getMessage());
		}

	}

}
