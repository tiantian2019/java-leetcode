package cn.edu.njupt.java.oop.orientedObject;

public class Median {
	public double findMedianSortedArrays(int[] A, int[] B) {
		int a = A.length+B.length;
		int count = 0;
		int indexA = 0;
		int indexB = 0;
		int[] result =new int[a+10];
		if(A.length == 0){
			return (B.length & 0x01) == 1? B[(B.length-1)/2]:(double)((B[(B.length)/2]+B[(B.length)/2-1]))/2;
		}
		if(B.length == 0){
			return (A.length & 0x01) == 1? A[(A.length-1)/2]:(double)((A[(A.length)/2]+A[(A.length)/2-1]))/2;
		}
		if((a & 0x01) == 1){//ÅÐ¶ÏÆæÊý
			for(;;){
				if(A[indexA] > B[indexB]){
					result[++count] = B[indexB];
					indexB++;
					if(indexB == B.length){
						if(count == ((a+1)/2)){
							return result[(a+1)/2];
						}
					 	for(;;){
					 		result[++count] = A[indexA];	
					 		indexA++;
					 		if(count == ((a+1)/2)){
								return result[(a+1)/2];
							}
					 	}
					}
				}else{
					result[++count] = A[indexA];
					indexA++;
					if(indexA == A.length){
						if(count == ((a+1)/2)){
							return result[(a+1)/2];
						}
					 	for(;;){
					 		result[++count] = B[indexB];
					 		indexB++;
					 		if(count == ((a+1)/2)){
								return result[(a+1)/2];
							}
					 	}
					}
				}
				if(count == ((a+1)/2)){
					return result[(a+1)/2];
				}
			}
		}else{//ÅÐ¶ÏÅ¼Êý
			for(;;){
				if(A[indexA] > B[indexB]){
					result[++count] = B[indexB];
					indexB++;
					if(indexB == B.length){
						if(count ==(a/2+1)){
							return (double)((result[a/2]+result[a/2+1]))/2;
						}
					 	for(;;){
					 		result[++count] = A[indexA];
					 		indexA++;
					 		if(count ==(a/2+1)){
								return (double)((result[a/2]+result[a/2+1]))/2;
							}
					 	}
					}
				}else{
					result[++count] = A[indexA];
					indexA++;
					if(indexA == A.length){
						if(count ==(a/2+1)){
							return (double)((result[a/2]+result[a/2+1]))/2;
						}
					 	for(;;){
					 		result[++count] = B[indexB];
					 		indexB++;
					 		if(count ==(a/2+1)){
								return (double)((result[a/2]+result[a/2+1]))/2;
							}
					 	}
					}
				}
				if(count ==(a/2+1)){
					return (double)((result[a/2]+result[a/2+1]))/2;
				}
			}	
		}
    }
	public double findKValue(){
		
		return 0;
	}
	public static void main(String[] args) {
		int[] A = {1};
		int[] B = {2,3};
		Median median = new Median();
		System.out.println(median.findMedianSortedArrays(A, B));
	}
}
