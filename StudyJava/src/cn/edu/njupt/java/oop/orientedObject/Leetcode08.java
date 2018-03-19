package cn.edu.njupt.java.oop.orientedObject;

public class Leetcode08 {
	public int myAtoi(String str) {
		long result =0;
		int t0 = (int)'0';
		int t9 = (int)'9';
		int fuhao = 1;
		boolean first = true;
		if(str.length()==0){
			return 0;
		}
		if(str.charAt(0) == '-'){
			fuhao = -1;
			first = false;
		}
		if(str.charAt(0) == '+'){
			fuhao = 1;
			first = false;
		}
		
	    for(int i = 0;i<str.length();i++){
	    	if(str.charAt(i) == ' ' && first ){
                continue;
            }
	    	if(first && str.charAt(i) == '-'){
	    		first =false;
	    		fuhao = -1;
	    		continue;
	    	}
	    	if(first && str.charAt(i) == '+'){
	    		first =false;
	    		fuhao = 1;
	    		continue;
	    	}
	    	int buffer = (int)str.charAt(i);
	    	if(first &&(buffer > t9 || buffer < t0) ){
	    		return 0;
	    	}
	    	
        	if(buffer <= t9 && buffer >= t0){
        		first = false;
        		result = -48+ result * 10 + str.charAt(i) ;
    		  if(fuhao*result>Integer.MAX_VALUE){
    		    	if(fuhao==1){
    		    		return Integer.MAX_VALUE;
    		    	}else{
    		    		return Integer.MIN_VALUE;
    		    	}
    		    	
    		    }
    		    if(fuhao*result <Integer.MIN_VALUE){
    		    	if(fuhao==1){
    		    		return Integer.MAX_VALUE;
    		    	}else{
    		    		return Integer.MIN_VALUE;
    		    	}
    		    }
			}else{
                if(i>0&&first == false){
                    break; 
                }
            }
        }
	    if(fuhao*result>Integer.MAX_VALUE){
	    	if(fuhao==1){
	    		return Integer.MAX_VALUE;
	    	}else{
	    		return Integer.MIN_VALUE;
	    	}
	    	
	    }
	    if(fuhao*result <Integer.MIN_VALUE){
	    	if(fuhao==1){
	    		return Integer.MAX_VALUE;
	    	}else{
	    		return Integer.MIN_VALUE;
	    	}
	    }
		return (int)(fuhao*result);
    }
	public static void main(String[] args) {
		String str = "9223372036854775809";
		Leetcode08 lt08 = new Leetcode08();
		System.out.println(lt08.myAtoi(str));
	}
}
