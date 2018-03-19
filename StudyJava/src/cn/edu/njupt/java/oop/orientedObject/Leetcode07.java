package cn.edu.njupt.java.oop.orientedObject;

public class Leetcode07 {
	 public int reverse(int x) {
		 double rangeL = -2147483648;
		 double rangeR = 2147483647;
		 int buffer = x;
		 double reverse = 0;
		 int result=0;
		 while(buffer != 0){
			 result = buffer % 10;
	    	 reverse = reverse*10 + result;
	    	 buffer = buffer / 10;
		 }
		 if(reverse < rangeL ||reverse > rangeR){
			 return 0;
		 }else{
			 return (int)reverse;
		 }
	}
	 public static void main(String[] args) {
		int x = 1534;
		Leetcode07 lc07 = new Leetcode07();
		System.out.println(lc07.reverse(x));
	}
}
