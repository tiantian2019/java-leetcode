package CollectionsTest;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Collections  
 * 1.ͬ������
 * �ṩ�ķ�����
 * SynchronizedList SynchronizedMap SynchronizedSet
 * 2.���ɱ�����  ֻ������  
 * 1.emptyxxx();  �յĲ��ɱ�ļ���
 * 2.singletonxxx();һ��Ԫ�ز��ɱ�ļ���
 * 3.unmodifiableXXX() ;���ɱ�����
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
