package CompareTest;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class demo1 {
	public static void main(String[] args) {
		List<StudentClass> list = new ArrayList<StudentClass>();
		StudentClass s1 = new StudentClass("12", "天天", "100");
		StudentClass s2 = new StudentClass("12", "明神", "50");
		StudentClass s3 = new StudentClass("12", "张明", "80");
		list.add(s1);
		list.add(s2);
		list.add(s3);
		System.out.println("**********************");
		utils.sort(list, new StudentCom());
		Iterator<StudentClass> it = list.iterator();
		while(it.hasNext()) {
			System.out.println(it.next().toString());
		}
		
	}
}
