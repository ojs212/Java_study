package test1115;

import java.io.*;

/*
 1. 반복문을 이용하여 
   파일명을 입력받아서 해당 파일이 존재하면 해당파일명.bak 파일 복사하기
   파일명에 exit 가 입력되면, 프로그램 종료.
   해당 파일이 없으면, 복사할 파일이 없습니다. 메세지 출력

[결과]
 파일명을 입력하세요(종료:exit)
 aaa.txt
 aaa.txt=>aaa.bak 복사완료
 파일명을 입력하세요(종료:exit)
 bbb.txt  
 복사할 파일이 없습니다.
파일명을 입력하세요(종료:exit)
exit
 */
public class Test1 {
	public static void main(String[] args) throws IOException{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		while(true) {
			try {
			System.out.println("파일명을 입력하세요(종료:exit)");
			String fileName = bf.readLine();
			if(fileName.equalsIgnoreCase("exit")) {
				break;
			}
			FileInputStream fis = new FileInputStream(fileName + ".txt");
			FileOutputStream fos = new FileOutputStream(fileName + ".bak");
			int data = 0;
			byte[] buf = new byte[fis.available()];
			while((data = fis.read(buf)) != -1) {
				fos.write(buf, 0, data);
				fos.flush();
			}
			System.out.println(fileName + ".txt => " + fileName + ".bak 복사완료");
			fis.close();
			fos.close();
			} catch(FileNotFoundException e) {
					System.out.println("복사할 파일이 없습니다.");
			}
		}
		
	}
}