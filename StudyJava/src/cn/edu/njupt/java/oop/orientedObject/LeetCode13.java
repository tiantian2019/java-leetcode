package cn.edu.njupt.java.oop.orientedObject;

import java.util.HashMap;

public class LeetCode13 {
	/**
	 * 罗马数字转整型
	 * @param s
	 * @return
	 */
	public int romanToInt(String s) {
		int result = 0;
		int buffer = Integer.MAX_VALUE ;
		String[] romanArr = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
		int[] value = {1000,900,500,400, 100,90,50,40,10,9,5,4,1};
		HashMap<String,Integer> hs = new HashMap<String,Integer>();
		for(int i=0;i<romanArr.length;i++){
			hs.put(romanArr[i], value[i]);
		}
		for(int i = 0;i<s.length();i++){
			if(hs.get(s.charAt(i)+"") > buffer){
				result = result - buffer + hs.get(""+s.charAt(i-1)+s.charAt(i));
			}else{
				result += hs.get(s.charAt(i)+"");
			}
			buffer = hs.get(s.charAt(i)+"");
		}
        return  result;
    }
	public static void main(String[] args) {
		LeetCode13 lc13 =new LeetCode13();
		String s = "MCMIX";
		System.out.println(lc13.romanToInt(s));
	}
}
