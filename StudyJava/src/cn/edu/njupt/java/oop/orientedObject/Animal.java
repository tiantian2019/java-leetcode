package cn.edu.njupt.java.oop.orientedObject;

public class Animal {
	public void voice(){
		System.out.println("�������");
	}
	public void call(){
		System.out.println("Animal.call()");
		voice();
	}
}
class cat extends Animal{
	public void voice(){
		System.out.println("������");
	}
	public void run(){
		System.out.println("���ܵıȽϿ�");
	}
}

class dog extends Animal{
	public void voice(){
		System.out.println("������");
	}
}
class pig extends Animal{
	public void voice(){
		System.out.println("zzz");
	}
}