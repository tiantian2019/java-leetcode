package cn.edu.njupt.java.oop.orientedObject;

public class Test01 {
	public static void animalVoice(Animal c){
		c.call();
	} 
	
	public static void main(String[] args) {
		Animal a = new cat();
		animalVoice(a);
	}
}
