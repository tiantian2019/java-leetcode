package QueneTest;

import java.util.ArrayDeque;
import java.util.Deque;

public class MyStack<T> {
	private Deque<T> d = new ArrayDeque<T>();

	private int size =0;
	private int cap ;
	
	public MyStack(){
		
	}
	
	public MyStack(int cap){
		this.cap = cap;
	}
	
	
	public boolean push(T t) {
		if(size + 1 == cap ) {
			return false;
		}
		size++;
		return d.offerLast(t);
	}
	
	public T pop() {
		size--;
		return d.pollLast();
	}
	
	public int  getSize() {
		return this.size;
	}
	
}
