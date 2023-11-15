package chap14;

import java.io.*;

/*
 * apple.gif 를 apple2.gif 파일로 복사하기
 */
public class Exam6 {

	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("apple.gif");
		FileOutputStream fos = new FileOutputStream("apple2.gif");
		byte[] buf = new byte[8096];
		int len = 0;
		while((len = fis.read(buf)) != -1) {
			fos.write(buf, 0, len);
		}
		fis.close();
		fos.close();
//		FileReader fr = new FileReader("apple.gif");
//		FileWriter fw = new FileWriter("apple2.gif");
//		char[] buf = new char[8096];
//		int len = 0;
//		while((len = fr.read(buf)) != -1) {
//			fw.write(buf, 0, len);
//		}
//		fr.close();
//		fw.close();
	}

}
