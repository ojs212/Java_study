package chap14;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * InputStreamEx1.java 소스를 읽어서, InputStreamEx1.bak 파일로 복사하기
 * FileInputStream을 이용, 한글 깨지지 않도록 한다
 */
public class Exam3 {

	public static void main(String[] args) throws IOException {
		FileOutputStream fos = new FileOutputStream("src/chap14/InputStreamEx1.bak");
		FileInputStream fis = new FileInputStream("src/chap14/InputStreamEx1.java");
		byte[] buf;
		int data = 0;
		buf = new byte[fis.available()];
		while((data = fis.read(buf,0,buf.length)) != -1) {
			fos.write(buf,0,data);
		}
		fos.flush();
		fos.close();
		fis.close();
	}

}
