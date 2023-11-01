package test1024;
import java.util.Scanner;
/*
 * 화면에서 점수를 입력받아서 
 * 90점 이상이면 A학점,80점 이상이면 B학점
 * 70점 이상이면 C학점,60점 이상이면 D학점
 * 60 점 미만이면 F학점을 출력하기
 */
public class Test3 {
	public static void main(String[] args) {
		System.out.println("점수를 입력해주세요.");
		Scanner scan = new Scanner(System.in);
		int score = scan.nextInt();
		char grade = score >= 90 ? 'A' : (score >= 80 ? 'B' : (score >= 70 ? 'C' : (score >= 60 ? 'D' : 'F')));
		System.out.println("당신은 " + grade + "학점 입니다.");
		scan.close();
	}
}