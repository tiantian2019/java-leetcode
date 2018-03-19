package HashTable;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Properties;

/**
 * HashTable �� HashMap ������
 * 1. HashTable ���̰߳�ȫ�ģ�ͬ�� ��Ч����ԱȽϵ�   HashMap ���̲߳���ȫ�ģ���ͬ����Ч�ʱȽϸ�
 * 2. ���಻ͬ�� HashTable �� Dictionary  HashMap ��abstractMap
 * 3. null: HashTable ����ֵ��������Ϊnull 
 *    HashMap ������һ��Ϊ�գ�ֵ���Զ��Ϊ��
 * 
 * ��Ҫ���� HashTable ��������properties  
 * ���� �� ��д�����ļ�
 * ����ֵֻ��Ϊ�ַ���  
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
