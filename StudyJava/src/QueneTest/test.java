package QueneTest;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;
import java.util.Queue;

public class test {

	public static void main(String[] args) {
		Queue<Request> q = new ArrayDeque<Request>();
		
		for(int i =0; i < 5; i++ ) {
			final int fi = i;
			q.offer(new Request() {
				@Override
				public void saveMoney() {
					System.out.println("µÚ" + fi +"ÈË");
				}
			});
		}
		
		Iterator<Request> it = q.iterator();
		while (it.hasNext()) {
			Request b = it.next();
			b.saveMoney();
		}
		
		
		Request buffer;
		while((buffer = q.poll()) != null ) {
			buffer.saveMoney();
		}
		
	}
	
		
}


interface Request {
	
	public void saveMoney();
	
	
}