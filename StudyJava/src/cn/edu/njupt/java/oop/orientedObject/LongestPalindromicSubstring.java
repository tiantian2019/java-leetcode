package cn.edu.njupt.java.oop.orientedObject;
public class LongestPalindromicSubstring {
	int startIndex = 0;
	int recordLength = 0;
	public String longestPalindrome(String s) {
		int recordIndex =0;
		String result;
		for(int i = s.length()-1;i>0;i--){
			String s1 = s.substring(0, i+1); 
			if(i < recordLength){
				break;
			}
			int palength = checkMaxPSubstring(s1,s.charAt(i),i);
			if(palength >=499){
				result= s.substring(i-palength, i+1);
				return result;
			}
			if(palength == -1){
				continue;
			}else
			{
				if(i-palength==0){
					result= s.substring(0, palength+1);
					return result;
				}
			}
			if(recordLength < palength){
				recordLength = palength;
				recordIndex = i;
			}
		}
		result= s.substring(recordIndex-recordLength, recordIndex+1);
		return result;
	}
	public int checkMaxPSubstring(String s,char a, int index){
		for(int i=0;i<index;i++){
			if(index - i < recordLength){
				break;
			}
			if(s.charAt(i) == a){//有回文串潜质
				String sBuffer = s.substring(i,index+1);
				if(checkPSubstring(sBuffer)){
					return index-i;
				}
			}
		}
		return -1;
	}
	public boolean checkPSubstring(String s){
		int stringLength = s.length();
		for(int i=0;(double)i<(double)(stringLength-1)/2;i++){
			if(s.charAt(i) != s.charAt(stringLength - i - 1)){
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args) {
		long startTime = System.currentTimeMillis();
		String s = "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaabcaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa";
		LongestPalindromicSubstring subSting = new LongestPalindromicSubstring();
		subSting.longestPalindrome(s);
		long endTime = System.currentTimeMillis();
		System.out.println(endTime - startTime+"ms");
	}
}
