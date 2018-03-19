package cn.edu.njupt.java.oop.orientedObject;

import java.util.Date;

public class Leetcode11 {
	public int maxArea(int[] height) {
		int maxArea = 0;
		int foreMaxHeight = 0;
		int backMaxHeight = 0;
		for(int i = 0; i< height.length;i++ ){
            if(i>0){
                 if(height[i] <= foreMaxHeight){
                    continue;
                 }
                 foreMaxHeight = height[i];
            }
			for(int j = height.length-1;j>i;j--){
				 if(j< height.length-1 ){
                    if(height[j] <= backMaxHeight){
					    continue;
                    }
                    backMaxHeight = height[j];
				}
				 maxArea = Math.max(maxArea, Math.min(height[i], height[j]) * (j-i));
			}
		}
        return maxArea;
    }
	public int maxArea(int[] height, int mode){
		 int maxArea = 0;
			int foreMaxHeight = height[0];
			int backMaxHeight = height[height.length-1];
			int left =0;
			int right = height.length - 1;
			while(left < right){
				maxArea = Math.max(maxArea, Math.min(height[left], height[right])*(right-left));
				if(height[left] < height[right]){
					int buffer = left;
//					do{
//						right--;
//					}while(height[right]<= height[buffer] && left< right);
					for(;height[++left]<= height[buffer] && left< right;){
	                    if(left == height.length-1){
	                        break;
	                    }
					}
				}else{
					int buffer = right;
					for(;height[--right]<= height[buffer] && left< right;){
	                    if(right == 0){
	                        break;
	                    }
					}
				}
				System.out.println(left+" "+ right);
			}
			return maxArea;
	}
	 public int maxArea(int[] height,boolean mode) { // height.length >= 2
		    int i = 0;
		    int j = height.length - 1;
		    int max = Integer.MIN_VALUE;
		    while(i < j) {
		      final int left = height[i];
		      final int right = height[j];
		      final int x = j - i;
		      if(left > right) {
		        final int area = right * x;
		        if(area > max) {
		          max = area;
		        }
		        do {
		          --j;
		        } while(height[j] <= right && i < j);
		      } else { // left <= right
		        final int area = left * x;
		        if(area > max) {
		          max = area;
		        }
		        do {
		          ++i;
		        } while(height[i] <= left && i < j);
		      }
		    }
		    return max;
		  }
	public static void main(String[] args) {
		long start = new Date().getTime();
		Leetcode11 lt11 = new Leetcode11();
		int[] height = {1,2,3,4,5,25,24,3,4};
		System.out.println(lt11.maxArea(height,1));
		long end = new Date().getTime();
		System.out.println(end - start);
		
		
	}																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																															
}
