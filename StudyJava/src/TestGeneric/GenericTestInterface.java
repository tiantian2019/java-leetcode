package TestGeneric;

public interface GenericTestInterface<V> {
		int k = 1;
		
		public abstract void test(V v);
		
		<T> T test2(T t); 
}

class testClass<V> implements GenericTestInterface<V>{

	@Override
	public void test(Object v) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public  <T> T test2(T t) {
		// TODO Auto-generated method stub
		return null;
	}
}