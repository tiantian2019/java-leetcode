package cn.edu.njupt.java.oop.orientedObject;
//stringBuilder �ٶȿ��̲߳���ȫ stringBuffer �̲߳���ȫ
public class StringBufferAndStringBuilder {
	public static void main(String[] args) {
		StringBuffer sb1 = new StringBuffer();
		sb1.append("123").append(123).append(0);//������ ��ΪԴ���з��ص���this ��������������
		String str = new String("123");
		Integer it = new Integer(123);
	}
}
