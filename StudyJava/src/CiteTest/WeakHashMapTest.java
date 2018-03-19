package CiteTest;

import java.util.WeakHashMap;

public class WeakHashMapTest {
	public static void main(String[] args) {
		WeakHashMap<String,String>m = new WeakHashMap<String,String>();
		String s = new String("123");
		m.put("1234", "123");
		m.put(s, "123");
		m.put(new String("123"), "123");
		m.put(new String("123"), "123");
		System.out.println(m.size());
		
		
		System.gc();
		System.runFinalization();
		System.out.println(m.size());
	}
}
