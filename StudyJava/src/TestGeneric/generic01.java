package TestGeneric;
/**
 * ���Է��ͳ�����
 * 
 * @author aa
 *
 */
public abstract class generic01<T,V> {
	T t ;
	
	public void test(V v) {
		System.out.println(v);
	}
}

class test001 extends generic01{
	
}