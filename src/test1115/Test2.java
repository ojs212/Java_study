package test1115;

import java.io.*;

/*
   src/chap14 폴더의 .java 파일 중 InputStream 관련 모든 소스 내용을  
   InputStream예제.txt  파일 하나에 저장 하기
   InputStream 관련 모든 소스 : XXXInputStreamXXX.java
   
   InputStream예제.txt 파일 참조
*/
public class Test2 {
	public static void main(String[] args) throws IOException {
		String s1 = "src/chap14/";
		String s2 = "InputStreamEx1";
		File f = new File(s1);
		String[] list = f.list();
		FileInputStream fis; 
		FileOutputStream fos; 
		FileWriter fr; 
		for(String a : list) {
			if(a.contains(s2)) {
				fis = new FileInputStream(s1 + a);
				fos = new FileOutputStream("InputStream.txt", true);
				fr = new FileWriter("InputStream.txt", true);
				byte[] buf = new byte[fis.available()];
				int data = 0;
				fr.write("\n\n***************" + a + "***************\n\n");
				fr.flush();
				while((data = fis.read(buf)) != -1) {
					fos.write(buf,0,data);
					fos.flush();
				}
			}
		}
		
	}
}