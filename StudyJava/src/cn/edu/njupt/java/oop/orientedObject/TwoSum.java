 package cn.edu.njupt.java.oop.orientedObject;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
	 public int[] twoSum(int[] nums, int target) {
		 Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		 int[] result = new int[2];
		 for(int i = 0;i<nums.length;i++){
			 int flag = target -nums[i];
			 if(map.containsKey(flag)){
				return new int[]{i,map.get(flag)};
			 }
			 map.put(nums[i],i);
		 }
		throw null;
}
	 public static void main(String[] args) {
		int[] input={-6,4,6,90};
		int target = 0;
		int[] result = new int[2];
		TwoSum twoSum = new TwoSum();
		result = twoSum.twoSum(input, target);
		System.out.println(result[0]+" "+result[1]);
	}
}
