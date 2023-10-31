package chap4;
import java.util.Scanner;
/*
 * 농장에 강아지, 병아리가 있다.
 * 강아지, 병아리의 전체 마리수와 다리수를 입력받고
 * 강아지의 마리수와 병아리 마리수를 출력하기
 * [결과]
 * 마리수 입력 : 20
 * 다리수 입력 : 60
 * 강아지 : 10
 * 병아리 : 10
 */
public class Exam10 {

	public static void main(String[] args) {
		System.out.println("마리수 입력");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		System.out.println("다리수 입력");
		int leg = scan.nextInt();
		boolean check = false;
		
		for(int i = 0; i <= num; i++) {
			for(int j = 0; j <= num; j++) {
				if(i + j == num && (4 * i) + (2 * j) == leg) {
						System.out.println("강아지 : " + i);
						System.out.println("병아리 : " + j);
						check = true;
				} 
			}
		}
		if(!check) {
			System.out.println("성립 X");
		}
		scan.close();
		
	}

}
