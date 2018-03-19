package TreeSetAndTreeMapTest;

import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

import CompareTest.StudentClass;


public class test01 {
	/**
	 *  Arraylist ����˳��ṹ�� hashMap ��hashset ������ʽ�ṹ
	 * @param args
	 */
	
	public static void main(String[] args) {
		/**
		 * hash set ����
		 */
		Set<StudentClass> s = new HashSet<StudentClass>();
		StudentClass s1 = new StudentClass("12", "����", "100");
		StudentClass s2 = new StudentClass("12", "����", "50");
		StudentClass s4 = new StudentClass("12", "����", "70");
		StudentClass s3 = new StudentClass("12", "����", "50");
		
		s.add(s1);
		s.add(s2);
		s.add(s3);
		
		s.add(s4);
		
		System.out.println(s);
		
		
		/**
		 *  hash map ����
		 */
		
		Map<StudentClass,String> m = new HashMap<StudentClass,String>();
		m.put(s1, "123");
		m.put(s2, "123");
		m.put(s3, "123");
		m.put(s4, "123");
		System.out.println(m);
		
		/**
		 * TreeSet ����
		 */
		
		Set<StudentClass> st = new TreeSet<StudentClass>();
		
		st.add(s1);
		st.add(s2);
		st.add(s3);
		st.add(s4);
		System.out.println(st);
		phone p1 = new phone("ƻ��", 5000);
		phone p2 = new phone("��Ϊ", 3000);
		phone p3 = new phone("С��", 1000);
		phone p4 = new phone("С��", 4000);
		Set<phone> p = new TreeSet<phone>(new Comparator<phone>() {
			@Override
			public int compare(phone o1, phone o2) {
				if(o1.getName().equals(o2.getName())) {
					System.out.println("+++++++");
					return 0;
				}
				return o1.getValue() - o2.getValue();
			}
		});
		p.add(p1);
		p.add(p2);
		p.add(p3);
		p.add(p4);
		System.out.println(p);
		/**
		 * TreeMap ����
		 */
		
		Map<phone,String> ma = new TreeMap <phone,String>(new Comparator<phone>() {

			@Override
			public int compare(phone o1, phone o2) {
				return o1.getValue() - o2.getValue();
			}
			
		});
		ma.put(p1, "as");
		ma.put(p2, "as");
		ma.put(p3, "as");
		ma.put(p4, "as");
		System.out.println(ma);
	}
}

class phone{
	
	private final String name;
	private final int value;
	
	public phone() {
		this.name = null;
		this.value = 0;
	} 
	
	public phone(String name, int value) {
		this.name = name;
		this.value = value;
	}
	
	public String getName() {
		return this.name;
	}
	
	public int getValue() {
		return this.value;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.getName() + "-->"+this.getValue() ;
	}
	
	
}
