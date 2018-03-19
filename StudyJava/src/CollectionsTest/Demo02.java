package CollectionsTest;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Collections  
 * 1.同步控制
 * 提供的方法有
 * SynchronizedList SynchronizedMap SynchronizedSet
 * 2.不可变设置  只读设置  
 * 1.emptyxxx();  空的不可变的集合
 * 2.singletonxxx();一个元素不可变的集合
 * 3.unmodifiableXXX() ;不可变容器
 * 
 * @author aa
 *
 */
public class Demo02 {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("123");
		list.add("12");
		list.add("1");
		list = Collections.unmodifiableList(list);
		list.add("123");
		System.out.println(list.size());
	}
	
	public static List getList(List list) {
		if(null == list) {
			return Collections.emptyList();
		}
		return list;
	}
	
}
