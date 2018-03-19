package cn.edu.njupt.java.oop.orientedObject;

public class Leetcode06 {
	 public String convert(String s, int numRows) {
		 if(numRows == 1){
			 return s;
		 }
		 String result="";
		 StringBuilder [] sArr = new StringBuilder[numRows] ;
		 for(int i =0 ;i< numRows;i++){
			 sArr[i] = new StringBuilder();
		 }
		 for(int i =0;i< s.length();i++){
			 int remainder = i %((numRows-1)*2); 
			 if(remainder < numRows){
				 sArr[remainder].insert(sArr[remainder].length(), s.charAt(i));
			 }else{
				 int index = (numRows-1)*2 - remainder;
				 sArr[index].insert(sArr[index].length(), s.charAt(i));
			 }
			
	     }
		 for(int i =0;i< numRows;i++){
			 result = result+ sArr[i]+"";
		 }
		 System.out.println(result);
		 return result;
	 }
	 public String convert(String s, int numRows, int flag){
		 char[] result1 = new char[s.length()];
		 char[] result = new char[s.length()+1000];
		 if(numRows == 1){
			 return s;
		 }
		 int col = s.length() / ((numRows - 1)) +1;
		 for(int i =0; i< s.length(); i++){
			int remainder = i % ((numRows - 1)*2);
			int indexHead =0 ;
			if( remainder > 0 && remainder <= numRows - 1 ){
				indexHead = (remainder)* (col + col -1) - (col -1);  
			}else if(remainder == 0){
				indexHead = 0;
			}else {
				indexHead = ((numRows-1)*2 - remainder)* (col + col -1) - (col -1);  
			}
			
			int rounding = i / ((numRows - 1)*2);
			if(remainder == 0 || remainder == numRows-1){
				result[indexHead+rounding] = s.charAt(i) ;
				continue;
			}
			rounding = i / ((numRows - 1));
			result[indexHead+rounding] = s.charAt(i) ;
		 }
		 int index = 0;
		 for(int i =0;i< result.length;i++){
			 if(result[i] != '\u0000'){
				 result1[index++] = result[i];
			 }
		 }
		 return String.valueOf(String.copyValueOf(result1));
	 }
	 public String convertBest(String s ,int numRows){
		 if(numRows == 1) {
	            return s;
	        }
	        char[] arr = s.toCharArray();
	        int range = (numRows << 1) - 2;
	        char[] result = new char[arr.length];
	        int index = 0;
	        //first line
	        for(int i = 0; i < arr.length; i += range) {
	            result[index++] = arr[i];
	        }
	        // medium line
	        for(int i = 1; i < numRows - 1; i++) {
	            int right = i << 1;
	            int left = range - right;
	            boolean isLeft = true;
	            for(int j = i; j < arr.length;) {
	                result[index++] = arr[j];
	                if(isLeft) {
	                    j = j + left;
	                    isLeft = false;
	                } else {
	                    j = j + right;
	                    isLeft = true;
	                }
	            }
	        }
	        //final line
	        for(int i = numRows - 1; i < arr.length; i += range) {
	            result[index++] = arr[i];
	        }
	        return new String(result);
	    }
	 public static void main(String[] args) {
//		StringBuilder s = new StringBuilder();
//		s.insert(s.length(), "abcd");
//		s.toString();
//		System.out.println(s);
		String s= "ABCDE";
		Leetcode06 leet6 = new Leetcode06();
		leet6.convert(s, 4,1);
		leet6.convert(s, 4);
	}
}
