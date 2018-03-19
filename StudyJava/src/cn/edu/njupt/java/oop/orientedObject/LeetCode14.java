package cn.edu.njupt.java.oop.orientedObject;
/**
 * 编写一个函数来查找字符串数组中最长的公共前缀字符串。
 * @author Alan
 *
 */
public class LeetCode14 {
	  public String longestCommonPrefix(String[] strs) {
		  	if(strs.length == 0){
			  return "";
		  	}
		  	if(strs.length==1){
		  		return strs[0];
		  	}
	        String result ="";
	        String first = strs[0];
	        for(int i = 0;i<first.length();i++){
	        	result =first.substring(0, i+1);
	        	for(int j=1;j<strs.length;j++){
	        		if(strs[j].indexOf(result) != 0){
	        			System.out.println(i+","+first.substring(0, i));
	        			return first.substring(0, i);
	        		}
	        	}
	        }
	        return result;
	  }
	  public static void main(String[] args) {
		  LeetCode14 lt14 =new LeetCode14();
		  String[] strs ={"a","ab","abc"};
		  System.out.println(lt14.longestCommonPrefix(strs));
	  }
}
