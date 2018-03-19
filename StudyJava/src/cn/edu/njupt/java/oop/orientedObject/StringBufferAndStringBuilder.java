package cn.edu.njupt.java.oop.orientedObject;
//stringBuilder 速度快线程不安全 stringBuffer 线程不安全
public class StringBufferAndStringBuilder {
	public static void main(String[] args) {
		StringBuffer sb1 = new StringBuffer();
		sb1.append("123").append(123).append(0);//方法链 因为源码中返回的是this 这里有两个对象
		String str = new String("123");
		Integer it = new Integer(123);
	}
}
