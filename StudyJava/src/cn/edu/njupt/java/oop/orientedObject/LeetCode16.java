package cn.edu.njupt.java.oop.orientedObject;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LeetCode16 {
	public int threeSumClosest(int[] nums, int target) {
        int result = Integer.MAX_VALUE;
        int dis = 0;
        Arrays.sort(nums);
        for(int i =0; i< nums.length && nums[i] <= target;i++){
        	int left = i+1;
        	int right = nums.length-1;
        	while(left < right){
        		dis = target - nums[i] - nums[left] - nums[right];
        		if(Math.abs(dis) <Math.abs(result)){
        			result = dis;
        		}
        		if(dis > 0){
        			left++;
        			continue;
        		}
        		if(dis < 0){
        			right--;
        			continue;
        		}
        		if(dis==0){
        			return target;
        		}
        		
        	}
        }
        System.out.println(target-result);
        return target-result;
    }
	public static void main(String[] args) {
		LeetCode16 lt16 = new LeetCode16();
		int[] nums ={1,1,1,1};
		int target = 0;
		lt16.threeSumClosest(nums, target);
	}
}
