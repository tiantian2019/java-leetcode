package cn.edu.njupt.java.oop.orientedObject;

public class LeetCode12 {
	/*
	 * Input is guaranteed to be within the range from 1 to 3999.
	 */
	public String intToRoman(int num) {
		String input = num + "";
		StringBuilder sb = new StringBuilder();
		String[] romanArr = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
		int[] value = {1000,900,500,400, 100,90,50,40,10,9,5,4,1};
		for(int i = 0;i< input.length();i++){
			int data = (int) (Character.getNumericValue(input.charAt(i))* Math.pow(10, input.length()-1-i));
			int j;
			for(j=0;j < value.length;j++){
				if(data >= value[j] ){
					int number = (int) (data / value[j] + (data % value[j]) / Math.pow(10, input.length()-1-i)) ;
					sb.append(romanArr[j]);
					for(int z = 0;z< number-1;z++){
						switch (input.length()-1-i) {
						case 0:
							sb.append("I");
							break;
						case 1:
							sb.append("X");
							break;
						case 2:
							sb.append("C");
							break;
						case 3:
							sb.append("M");
							break;
						default:
							break;
						}
					}
					System.out.println(number);
					break;
				}
			}
		}
		return sb.toString();
	}
	/**
	 * 主要采用贪心策略每次都减去一个最大的参数
	 * @param num
	 * @param mode
	 * @return
	 */
	public  String intToRoman(int num,int mode){
		String result = "";
		String[] romanArr = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
		int[] value = {1000,900,500,400, 100,90,50,40,10,9,5,4,1};
		for(int i = 0; i < value.length; i++ ){
			while(num >= value[i]){
				num = num - value[i] ;
				result = result + romanArr[i]; 
			}
		}
		return result;
	}
	public static void main(String[] args) {
		System.out.println("chengxu yunx ");
		LeetCode12 lc12 = new LeetCode12();
		System.out.println(lc12.intToRoman(999));
		System.out.println(lc12.intToRoman(999));
	}
}
