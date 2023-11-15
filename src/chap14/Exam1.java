package chap14;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

/*
 * 화면에서 내용을 exit 문자열이 입력될때 까지 입력받아 data.txt 파일에 저장하기
 * FileOutputStream 이용하기 -> 한글은 깨지지 않도록 저장하기
 */
public class Exam1 {

	public static void main(String[] args) throws IOException{
		Scanner sc = new Scanner(System.in);
		while(true) {
			String s = sc.nextLine();
			if(s.equalsIgnoreCase("exit")) {
				break;
			}
			FileOutputStream fos = new FileOutputStream("data.txt", true);
			fos.write((s + "\n").getBytes());
			fos.flush();
			fos.close();
		}
		sc.close();
	}

}
