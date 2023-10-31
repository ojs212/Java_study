package chap3;
import java.util.Scanner;
/*
 * 화면에서 3자리 자연수를 입력받아 100자리 미만을 버리고 출력하기
 * [결과]
 * 세자리 자연수를 입력하세요
 * 321
 * 300
 * 
 * 1. Scanner 객체 생성
 * 2. int num = scan.nextInt()
 * 3. num - num%100
 * 4. 결과값 출력하기
 */
public class Exam3 {
	public static void main(String[] args) {
		System.out.println("세자리 자연수를 입력하세요");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		System.out.println(num - (num % 100));
		System.out.println(num / 100 * 100);  //자바의 특성을 이용 (int <= int / int)
		scan.close();
	}
}
