package HashTable;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class readTest {
	public static void main(String[] args) throws FileNotFoundException, IOException {
		Properties p = new Properties();
		p.load(new FileReader("src/HashTable/db.propreties"));
		
		//加载器
//		"/" 表示bin 目录
//		p.load(readTest.class.getResourceAsStream("/HashTable/db.propreties"));
		
//		空表示bin
		p.load(Thread.currentThread().getContextClassLoader().getResourceAsStream("HashTable/db.propreties"));
		System.out.println(p.get("name"));
	}
}
  