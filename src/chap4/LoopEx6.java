package chap4;
import java.util.Scanner;
/*
 * 1~100 사이 임의의 수를 컴퓨터가 저장함
 * 사용자는 숫자를 입력받아서 저장된 숫자를 맞추기
 * 시스템 : 37 가정
 * [결과]
 * 1~100 사이 숫자를 입력 : 50
 * 작은수 입니다.
 * 1~100 사이 숫자를 입력 : 25
 * 큰수 입니다
 * 1~100 사이 숫자를 입력 : 37
 * 정답입니다.
 * 프로그램 종료
 */
public class LoopEx6 {

	public static void main(String[] args) {
		int sys = (int)(Math.random() * 100 + 1);
		Scanner scan = new Scanner(System.in);
		while(true) {
			System.out.println("1~100 사이 숫자를 입력");
			int user = scan.nextInt();
			if(sys > user) {
				System.out.println(user + "보다 큰수 입니다.");
			} else if(sys < user) {
				System.out.println(user + "보다 작은수 입니다.");
			} else {
				System.out.println("정답입니다.");
				break;
			}
		}
		System.out.println("프로그램 종료");
		scan.close();
	}

}
