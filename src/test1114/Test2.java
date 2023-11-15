package test1114;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

/*
 * 화면에서 파일명을 입력받아서 해당 파일의 내용을 화면에 출력하기.
 * 만약 파일이 없는 경우는 '해당 파일 없음' 을 출력하기
 * 한글은 깨지지 않아야 함.
 * FileInputStream 사용하기
 * 
 * [결과]
화면에 파일명을 입력하세요(종료:exit)
src/chap14/InputStreaEx1.java
해당 파일 없음
화면에 파일명을 입력하세요(종료:exit)
src/chap14/InputStreamEx1.java
해당 파일 없음
화면에 파일명을 입력하세요(종료:exit)
src/test1114/Test1.java
package test1114;
....
.....
 */
public class Test2 {
	public static void main(String[] args) throws IOException{
		Scanner sc = new Scanner(System.in);
		FileInputStream fis;
		while(true) {
			System.out.println("화면에 파일명을 입력하세요(종료:exit)");
			String str = sc.next();
			if(str.equalsIgnoreCase("exit")) {
				break;
			} try {
			fis = new FileInputStream(str);
			} catch(FileNotFoundException e) {
				System.out.println("해당 파일 없음");
				continue;
			}
			int data = 0;
			byte[] buf = new byte[fis.available()];
			while((data = fis.read(buf,0,buf.length)) != -1) {
				System.out.print(new String(buf,0,data));
			}
		}
		sc.close();
	}
}