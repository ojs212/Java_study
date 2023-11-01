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
 * 
 * === 프로그램 수정 ===
 * 입력 횟수가 5번 이하인 경우 : 빨리 맞췄습니다.
 * 입력 횟수가 10번 이하인 경우 : 보통입니다.
 * 입력 횟수가 11번 이상인 경우 : 노력하세요.
 */
public class Exam11 {

	public static void main(String[] args) {
		int sys = (int)(Math.random() * 100 + 1);
		Scanner scan = new Scanner(System.in);
		int num = 0;
		while(true) {
			System.out.println("1~100 사이 숫자를 입력");
			int user = scan.nextInt();
			num++;
			if(sys > user) {
				System.out.println(user + "보다 큰수 입니다.");
			} else if(sys < user) {
				System.out.println(user + "보다 작은수 입니다.");
			} else {
				System.out.println("정답입니다.");
				break;
			}
		}
		if (num <= 5) {
			System.out.println(num + "만에 맞췄네요. 빨리 맞췄습니다.");
		} else if (num <= 10) {
			System.out.println(num + "만에 맞췄네요. 보통입니다.");
		} else if (num > 10) {
			System.out.println(num + "만에 맞췄네요. 노력하세요.");
		}
		System.out.println("프로그램 종료");
		scan.close();
	}

}
