package Collection;
import java.util.Comparator;

public class StudentNameSorter implements Comparator<Student> {

	@Override
	public int compare(Student s1, Student s2) {
		// TODO Auto-generated method stub
		return s1.getName().compareToIgnoreCase(s2.getName());
	}

}
