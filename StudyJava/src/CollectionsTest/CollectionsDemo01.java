package CollectionsTest;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsDemo01 {
	/**
	 * test Collections class
	 */
	public static void test01() {
		List<Integer> list = new ArrayList<Integer>() ;
		for(int i =0; i< 54; i++) {
			list.add(i);
		}
		
		Collections.shuffle(list);
		List<Integer> A = new ArrayList<Integer>() ;
		List<Integer> B = new ArrayList<Integer>() ;
		List<Integer> C = new ArrayList<Integer>() ;
		List<Integer> Last = new ArrayList<Integer>() ;
		for(int i =0 ; i< 51; i = i +3) {
			A.add(list.get(i));
			B.add(list.get(i+1));
			C.add(list.get(i+2));
			
			
		}
		Last.add(list.get(51));
		Last.add(list.get(52));
		Last.add(list.get(53));
		System.out.println(A);
		System.out.println(B);
		System.out.println(C);
		System.out.println(Last);
	}
	
	public static void main(String[] args) {
		
		test01();
		
	}

}
