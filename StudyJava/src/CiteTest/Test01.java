package CiteTest;

import java.lang.ref.WeakReference;

public class Test01 {
	public static void main(String[] args) {
		String a = new String("123");
		WeakReference<String> w = new WeakReference<String>(a);
		//垃圾回收机制之前
		System.out.println(w.get());
		
		a = null;
		
		System.gc();
		System.runFinalization();
		
		System.out.println(w.get());
		
	}
	
	public static void StrongCiteTest() {
		String a = "123";
		WeakReference<String> w = new WeakReference<String>(a);
		//垃圾回收机制之前
		System.out.println(w.get());
		
		a = null;
		
		System.gc();
		System.runFinalization();
		
		System.out.println(w.get());
	}
}
