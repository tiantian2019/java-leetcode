package cn.edu.njupt.java.oop.orientedObject;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TryCatchTestClass {
	/**
	 * try -- catch -- return ����
	 * @author Alan
	 *
	 */
	public String tryCatchTest(){
		File file = new File("e:/case0.txt");
		FileReader fr = null;
		try{
			System.out.println("try ");
			fr = new FileReader(file);
			System.out.println(fr.read());
			System.out.println("1 ");
			return "1 ";
		}catch(FileNotFoundException e){
			System.out.println("FileNotFoundException ");
			e.printStackTrace();
			System.out.println("�ļ�������");
			System.out.println("2 ");
			return " 2 ";
		}catch(IOException e){
			e.printStackTrace();
			System.out.println("��ȡ����");
			return " 3 ";
		}finally{
			System.out.println("final ");
			if(file != null){
				try{
					fr.close();
				}catch(Exception e){
					System.out.println("file���ز���");
				}
			}
		}
	}
	public static void main(String[] args) {
		TryCatchTestClass t = new TryCatchTestClass();
		t.tryCatchTest();
				
	}

}
