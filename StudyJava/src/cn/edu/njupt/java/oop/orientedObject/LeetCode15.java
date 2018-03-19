package cn.edu.njupt.java.oop.orientedObject;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class LeetCode15 {
	public List<List<Integer>> threeSum(int[] nums) {
		List<List<Integer>> result = new ArrayList<List<Integer>>();
		Arrays.sort(nums);
		for(int i=0; i< nums.length;i++){
			if(nums[i] > 0){
				break;
			}
			if(i>0 && nums[i] == nums[i-1]){
				continue;
			}
			int left = i+1;
			int right = nums.length-1;
			while(left < right){
				while(left < right && nums[left] + nums[right] > -nums[i] ){
					right--;
				}
				while(left < right && nums[left] + nums[right] < -nums[i] ){
					left++;
				}
				if(left < right && nums[left] + nums[right] == -nums[i]){
					List<Integer> buffer = new ArrayList<Integer>();
					buffer.add(nums[i]);
					buffer.add(nums[left]);
					buffer.add(nums[right]);
					result.add(buffer);
					while(left < right && nums[left] == nums[left+1]){
						left++;
					}
					while(left < right && nums[right] == nums[right-1]){
						left++;
					}
					right--;
					left++;
				}
			}
		}
		for(int i =0 ;i<result.size();i++){
			for(int j=0;j<result.get(i).size();j++){
				System.out.print(result.get(i).get(j)+",");
			}
			System.out.println();
		}
		return result;
    }
	public List<List<Integer>> threeSum(int[] nums,int mode) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
		HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
		List<String> strList = new ArrayList<String>();
		for(int i=0;i<nums.length;i++){
			map.put(nums[i], i);
		}
		for(int i = 0; i < nums.length;i++){
			for(int j = i+1; j < nums.length;j++){
				int buffer = 0 - nums[i] - nums[j];
				if(map.get(buffer) != null && map.get(buffer) > j){
					if(map.get(buffer)!= i&& map.get(buffer)!=j){
						 List<Integer> resultBuff  = new ArrayList<Integer>();
						 int[] arr = new int[3];
						 arr[0] = nums[i];
						 arr[1] = nums[j];
						 arr[2] = buffer;
						 Arrays.sort(arr);
						 if(strList.isEmpty()){
							 strList.add(""+arr[0]+arr[1]+arr[2]);
							 resultBuff.add(arr[0]);
							 resultBuff.add(arr[1]);
							 resultBuff.add(arr[2]);
							 result.add(resultBuff);
						 }else{
							 if(!strList.contains(""+arr[0]+arr[1]+arr[2])){
								 strList.add(""+arr[0]+arr[1]+arr[2]);
								 resultBuff.add(arr[0]);
								 resultBuff.add(arr[1]);
								 resultBuff.add(arr[2]);
								 result.add(resultBuff);
							 }
						 }
					}
				}
			}
		}
		for(int i =0 ;i<result.size();i++){
			for(int j=0;j<result.get(i).size();j++){
				System.out.print(result.get(i).get(j)+",");
			}
			System.out.println();
		}
        return result;
    }
	 public void sort(int[] arrs){
		 for(int i = 0;i<arrs.length;i++){
			 for(int j=i+1;j<arrs.length;j++){
				 if(arrs[i] > arrs[j]){
					 int buffer =arrs[i];
					 arrs[i] =  arrs[j];
					 arrs[j] = buffer;
				 }
			 }
		 }
	 }
	 public static void main(String[] args) {
		LeetCode15 lt15 = new LeetCode15();
		int[] nums = {-1, 0, 1, 2, -1, -4};
//		lt15.sort(nums);
//		for(int i:nums){
//			System.out.print(i+",");
//		}
		lt15.threeSum(nums);
	}
}
