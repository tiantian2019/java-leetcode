package cn.edu.njupt.java.oop.orientedObject;

public class LeetCode05 {
	public String longestPalindrome(String s) {
		int recordResult = 0;
		int recordIndex = 0;
		for(int i = 0 ; i < s.length();i++){
			int odd = checkMaxLongest(s,i,i);
			int even = checkMaxLongest(s, i, i+1);
			int resultLength = Math.max(odd, even);
			if(recordResult < resultLength){
				recordResult = resultLength;
				recordIndex = i;
			}
		}
		
		int left = recordIndex - recordResult / 2 ;
		int right = recordIndex + recordResult- recordResult / 2;
		return s.substring(left,right+1);
	}
	public int checkMaxLongest(String s,int l,int r){
		int left = l;
		int right = r;
		while(left >= 0 && right <= s.length()-1 && (s.charAt(left) == s.charAt(right))){
			left--;
			right++;
		}
		return right - left - 2;
	}
	public static void main(String[] args) {
		long startTime = System.currentTimeMillis();
		String s = "";
		LeetCode05 subSting = new LeetCode05();
		System.out.println(subSting.longestPalindrome(s));
		long endTime = System.currentTimeMillis();
		System.out.println(endTime - startTime+"ms");
	}
}
