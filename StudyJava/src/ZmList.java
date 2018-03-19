import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;

public class ZmList<T> implements java.lang.Iterable<T>{
	final static int MIN_CAP = 20;
	
	private Object[] listArray = new Object[MIN_CAP]; 
	
	private int size = 0;
	
	private int cap = MIN_CAP;
	
	public int getSize() {
		return this.size;
	}
	
	public void add(T t) {
		if(size == cap) {
			listArray = Arrays.copyOf(listArray, cap = cap << 1);
		}
		listArray[size++] = (T)t;
	}
	public Iterator<T> iterator(){
		
		return new Iterator<T>() {

			int cursor = -1;
			@Override
			public boolean hasNext() {
				return cursor+1<size;
			}

			@Override
			public T next() {
				Object t = listArray[++cursor];
				return (T)t;
			}

			@Override
			public void remove() {
				System.arraycopy(listArray, cursor+1 ,listArray,cursor,size-cursor-1);
				cursor--;
				size --;
			}
		};
	}
	
	
	public static void main(String[] args) {
		ZmList<String> list = new ZmList<String>();
		list.add("123");
		list.add("1234");
		list.add("1235");
		list.add("1236");
		Iterator<String> it = list.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
			it.remove();
		}
		System.out.println(list.getSize());
		Integer a = 1;
		String c = "abc";
		
//		String[] str = {"12","123","1234"};
//		System.arraycopy(str, 1, str, 0, 2);
//		for(String s:str) {
//			System.out.println(s);
//		}
	}
	

}
