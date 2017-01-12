package lxj;

import java.io.File;
import java.io.IOException;
import java.io.UnsupportedEncodingException;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			System.out.println("中文");

			System.out.println("中文".getBytes());

			System.out.println("中文".getBytes("GB2312"));

			System.out.println("中文".getBytes("ISO8859_1"));

			System.out.println(new String("中文".getBytes()));

			System.out.println(new String("中文".getBytes(), "UTF-8"));

			System.out.println(new String("中文".getBytes(), "ISO8859_1"));

			System.out.println(new String("中文".getBytes("GB2312")));

			System.out.println(new String("中文".getBytes("GB2312"), "GB2312"));

			System.out.println(new String("中文".getBytes("GB2312"), "ISO8859_1"));

			System.out.println(new String("中文".getBytes("ISO8859_1")));

			System.out.println(new String("中文".getBytes("ISO8859_1"), "GB2312"));

			System.out.println(new String("中文".getBytes("ISO8859_1"), "UTF-8"));
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
	}

	public static void createFile() {

		// path表示你所创建文件的路径
		String path = "C:/Users/haipeng.sun/Desktop/";
		File f = new File(path);
		if (!f.exists()) {
			f.mkdirs();
		}
		// fileName表示你创建的文件名；为txt类型；
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
