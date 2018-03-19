package CompareTest;

import java.util.List;

public class utils {
	
	public static void sort(List<StudentClass> list,StudentCom com) {
		Object[] t = list.toArray();
		sort(t,com);
		for(Object s : t ) {
			System.out.println(s.toString());
		}
		int index = 0;
		for(Object t1 : t) {
			list.set(index++, (StudentClass)t1);
		}
	}
	public static void sort(Object[] arr,StudentCom com) {
		boolean isSort = false;
		for(int i =0 ; i < arr.length && !isSort;i++) {
			isSort = true;
			for(int j = arr.length - 1; j > i ; j--) {
				if(com.compare((StudentClass)arr[j-1], (StudentClass)arr[j]) < 0 ) {
					StudentClass flag = (StudentClass)arr[j];
					arr[j] = arr[j-1];
					arr[j-1] = flag;
				    isSort = false;
				}
			}
		}
	}
	
	public static <T extends Comparable<T>> void SortList(List<T> list) {
		Object[] t = list.toArray();
		sorts(t);
		int index = 0;
		for(Object t1 : t) {
			list.set(index++, (T)t1);
		}
	}
	
    /**
     * extends 表示泛型的上限
     * @param t
     */
	public static <T extends Comparable<T>>void sortsGeneric(T[] arr) {
		boolean isSort = true;
		for(int i = 0; i< arr.length ;i++ ) {
			isSort = true;
			for(int j= i + 1 ; j < arr.length; j++){
				int compareTo = arr[i].compareTo(arr[j]);
				if(compareTo < 0 ) {
					T flag = arr[i];
					arr[i] = arr[j];
					arr[j] = flag;
					isSort = false;
				}
			}
			if(isSort) {
				break;
			}
		}
	}

	public static <T extends Comparable<T>> void bubbleSort(T[] arr) {
		boolean isSort = false;
		for(int i =0 ; i < arr.length && !isSort;i++) {
			isSort = true;
			for(int j = arr.length - 1; j > i ; j--) {
				int compareTo = ((Comparable<T>) arr[j-1]).compareTo(arr[j]);
				if(compareTo < 0 ) {
					T flag = arr[j];
					arr[j] = arr[j-1];
					arr[j-1] = flag;
					 isSort = false;
				}
			}
		}
	}
	public static void bubbleSort(Object[] arr) {
		boolean isSort = false;
		for(int i =0 ; i < arr.length && !isSort;i++) {
			isSort = true;
			for(int j = arr.length - 1; j > i ; j--) {
				int compareTo = ((Comparable<Object>) arr[j-1]).compareTo(arr[j]);
				if(compareTo < 0 ) {
					Object flag = arr[j];
					arr[j] = arr[j-1];
					arr[j-1] = flag;
					 isSort = false;
				}
			}
		}
		
	}
	
	public static void sorts(Object[] arr) {
		boolean isSort = true;
		for(int i = 0; i< arr.length ;i++ ) {
			isSort = true;
			for(int j= i + 1 ; j < arr.length; j++){
				int compareTo = ((Comparable<Object>) arr[i]).compareTo(arr[j]);
				if(compareTo < 0 ) {
					Object flag = arr[i];
					arr[i] = arr[j];
					arr[j] = flag;
					isSort = false;
				}
			}
			if(isSort) {
				break;
			}
		}
	}
	
	public static void main(String[] args) {
		Integer[] a = {30,100,50,80};
		bubbleSort(a);
		for(int i : a) {
			System.out.print(i + ",");
		}
//		System.out.println();
//		String[] s = {"abc","a","b","d"};
//		sortsGeneric(s);
//		for(String b: s) {
//			System.out.print(b + ",");
//		}
//		
//		List<Integer> list = new ArrayList<Integer>();
//		list.add(1);
//		list.add(3);
//		list.add(7);
//		list.add(2);
//		list.add(5);
//		
//		SortList(list);
//		
//		Iterator it  = list.iterator();
//		
//		while(it.hasNext()) {
//			System.out.print(it.next()+",");
//		}
		
	}
	
}	
