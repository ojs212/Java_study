package chap14;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * 화면에서 파일명을 입력받고, 출력을 시작한 라인번호와 출력라인수를 입력받기
 * 파일에서 시작라인부터 라인수까지만 화면 출력하기
 * Scanner 사용 불가
 */
public class Exam4 {

	public static void main(String[] args) throws IOException{
		BufferedReader fn = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("파일명을 입력하세요");
		String s = fn.readLine(); // 화면에서 한줄을 입력 / String 으로 입력
		System.out.println("시작라인");
		String sl = fn.readLine();
		System.out.println("라인수");
		String li = fn.readLine();
		// 출력을 시작할 라인 : 정수형으로 변경
		int start = Integer.parseInt(sl);
		// 화면에 출력할 라인수 : 정수형으로 변경
		int len = Integer.parseInt(li);
		// 입력받은 파일을 읽기
		BufferedReader br = new BufferedReader(new FileReader(s));
		String data = null;
		int line = 0; // 화면에 표시할 라인 / 파일의 라인수
		int cnt = 0; // 현재시점에 출력한 라인갯수
		while((data = br.readLine()) != null) {
			++line;
			if(len < start) { // 출력 시작할 라인번호가 될때까지 continue 
				continue;
			}
			if(cnt >= len) {
				break;
			}
			++cnt;
			System.out.printf("%2d %s\n",line ,data);
		}
		br.close();
	}

}
