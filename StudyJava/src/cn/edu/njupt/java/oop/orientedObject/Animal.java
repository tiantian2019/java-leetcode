package cn.edu.njupt.java.oop.orientedObject;

public class Animal {
	public void voice(){
		System.out.println("动物叫声");
	}
	public void call(){
		System.out.println("Animal.call()");
		voice();
	}
}
class cat extends Animal{
	public void voice(){
		System.out.println("喵喵喵");
	}
	public void run(){
		System.out.println("喵跑的比较快");
	}
}

class dog extends Animal{
	public void voice(){
		System.out.println("汪汪汪");
	}
}
class pig extends Animal{
	public void voice(){
		System.out.println("zzz");
	}
}