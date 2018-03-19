package QueneTest;

public class Test02 {

	
	public static void main(String[] args) {
		MyStack<String> s = new MyStack<String>();
		
		s.push("1234");
		s.push("12345");
		s.push("123456");
		s.push("1234567");
		
		
		while(s.getSize() != 0) {
			System.out.println(s.pop());
		}
		
		
	}
}
