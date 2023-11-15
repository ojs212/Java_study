package chap14;

import java.io.File;

/*
 * C:/windows 폴더의 하위 폴더 갯수와 파일의 갯수, 파일의 총 크기 출력하기
 */
public class Exam5 {

	public static void main(String[] args) {
		File f1 = new File("C:/windows");
		String[] list = f1.list();
		int dir = 0;
		int files = 0;
		long size = 0;
		for(String a : list) {
			File f2 = new File(f1, a);
			if(f2.isDirectory()) {
				dir++;
			} else {
				files++;
				size += f2.length();
			}
		}
		System.out.printf("폴더 갯수 : %d개\n", dir);
		System.out.printf("파일 갯수 : %d개\n", files);
		System.out.printf("파일의 총 크기 : %,dbyte\n", size);
	}

}
