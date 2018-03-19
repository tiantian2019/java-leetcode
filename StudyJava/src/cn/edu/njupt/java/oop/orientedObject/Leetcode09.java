package cn.edu.njupt.java.oop.orientedObject;

public class Leetcode09 {
	public boolean isPalindrome(int x) {
		String buffer = "";
		buffer = String.valueOf(x);
		int left =0;
		int right = buffer.length() - 1;
		while(true){
			if(left == right){
				return true;
			}
			if(buffer.charAt(left) != buffer.charAt(right)){
				return false;
			}
			left++;
			right--;
		}
    }
	public static void main(String[] args) {
		Leetcode09 lt09 = new Leetcode09();
		System.out.println(lt09.isPalindrome(121));
	}
}
