package CompareTest;

import java.util.Comparator;

public class StudentCom implements Comparator<StudentClass>{

	@Override
	public int compare(StudentClass o1, StudentClass o2) {
		return Integer.parseInt(o1.getScore()) -Integer.parseInt(o2.getScore()) ;
	}
	
}
