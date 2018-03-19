package HashTable;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Properties;

/**
 * HashTable 和 HashMap 的区别
 * 1. HashTable 是线程安全的，同步 ，效率相对比较低   HashMap 是线程不安全的，非同步，效率比较高
 * 2. 父类不同， HashTable 是 Dictionary  HashMap 是abstractMap
 * 3. null: HashTable 键与值都不允许为null 
 *    HashMap 键可以一个为空，值可以多个为空
 * 
 * 主要测试 HashTable 的是子类properties  
 * 作用 ： 读写配置文件
 * 键与值只能为字符串  
 * @author aa
 *
 */
public class HashTable {
	public static void main(String[] args) throws FileNotFoundException, IOException {

		Properties p = new Properties();
		p.setProperty("driver", "oracle.jdbc.driver.oracleDriver");
		p.setProperty("url", "jdbc:oracle:thin:@localhost:1521:orcl");
		p.setProperty("name", "tiantian");
		p.setProperty("password", "123");
//		p.store(new FileOutputStream(new File("d:/db.propreties")), null);
//		p.storeToXML(new FileOutputStream(new File("d:/db.xml")), null);
		p.store(new FileOutputStream(new File("src/HashTable/db.propreties")), null);
		
	}
	
}
