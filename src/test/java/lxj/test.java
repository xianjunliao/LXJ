package lxj;

import java.io.File;
import java.io.IOException;
import java.io.UnsupportedEncodingException;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			System.out.println("����");

			System.out.println("����".getBytes());

			System.out.println("����".getBytes("GB2312"));

			System.out.println("����".getBytes("ISO8859_1"));

			System.out.println(new String("����".getBytes()));

			System.out.println(new String("����".getBytes(), "UTF-8"));

			System.out.println(new String("����".getBytes(), "ISO8859_1"));

			System.out.println(new String("����".getBytes("GB2312")));

			System.out.println(new String("����".getBytes("GB2312"), "GB2312"));

			System.out.println(new String("����".getBytes("GB2312"), "ISO8859_1"));

			System.out.println(new String("����".getBytes("ISO8859_1")));

			System.out.println(new String("����".getBytes("ISO8859_1"), "GB2312"));

			System.out.println(new String("����".getBytes("ISO8859_1"), "UTF-8"));
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
	}

	public static void createFile() {

		// path��ʾ���������ļ���·��
		String path = "C:/Users/haipeng.sun/Desktop/";
		File f = new File(path);
		if (!f.exists()) {
			f.mkdirs();
		}
		// fileName��ʾ�㴴�����ļ�����Ϊtxt���ͣ�
		String fileName = "test.java";
		File file = new File(f, fileName);
		if (!file.exists()) {
			try {
				file.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}
}
