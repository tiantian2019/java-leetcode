package cn.edu.njupt.java.oop.orientedObject;

public class LeetCode10 {
	public boolean isMatch(String text, String pattern){
		if(pattern.isEmpty()){
			return text.isEmpty();
		}
		if(pattern.length() == 1){
			if(text.isEmpty()){
				return false;
			}
			return (text.charAt(0) == pattern.charAt(0) || pattern.charAt(0) == '.') && text.length() ==1;
		}
		if(pattern.charAt(1) != '*'){
			if(text.isEmpty()){
				return false;
			}
			return (text.charAt(0) == pattern.charAt(0) || pattern.charAt(0) == '.') && isMatch(text.substring(1),pattern.substring(1));
		}
		while(!text.isEmpty() && (text.charAt(0) == pattern.charAt(0) || pattern.charAt(0) == '.')){
			if(isMatch(text,pattern.substring(2))){
				return true;
			}
			text = text.substring(1);
		}
		return isMatch(text,pattern.substring(2));
	}
	public static void main(String[] args) {
		LeetCode10 lt10 = new LeetCode10();
		System.out.println(lt10.isMatch("", "*"));
	}
}
