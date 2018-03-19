package cn.edu.njupt.java.oop.orientedObject;

import java.util.ArrayList;
import java.util.List;

public class LeetCode17 {
	 String[] ref = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
	 private List<String> result ;
	 public List<String> letterCombinations(String digits) {
		 List<String> list = new ArrayList<String>();
		 list.add("");
		 System.out.println(list.size());
		 if(digits == ""){
			 result = new ArrayList<String>();
			 result.add("12");
			 return result;
		 }
		 helper(0,list,digits);
		 return result;
	 }
	 public void helper(int index,List<String> list,String digits){
		 if(index  == digits.length()){
			 return;
		 }
		 int buffer = Character.getNumericValue(digits.charAt(index));
		 System.out.println(buffer);
		 if(buffer == 0 || buffer == 1){
			 helper(index+1,list ,digits);
			 return;
		 }
		 result = new ArrayList<String>();
		 for(int i =0;i < list.size();i++){
			 for(int j=0; j < ref[buffer].length();j++){
				String bufferStr  = list.get(i) +  ref[buffer].charAt(j);
				result.add(bufferStr);
			 }
		 }
		 helper(index+1,result ,digits);
	 }
	 public static void main(String[] args) {
		String digits = "2";
		LeetCode17 leetCode17 = new LeetCode17();
		leetCode17.letterCombinations(digits);
	}
	 
}
