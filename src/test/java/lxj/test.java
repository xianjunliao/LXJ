package lxj;

import java.io.File;
import java.io.IOException;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		createFile();
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
