package chap4;
/*
 * if 구문내의 문장이 한개만 존재하는 경우 {} 생략 가능
 */
import java.util.Scanner;

public class IfEx2 {

	public static void main(String[] args) {
		System.out.println("점수를 입력하세요");
		Scanner scan = new Scanner(System.in);
		int score = scan.nextInt();
		if(score >= 90 ) { 	  
			System.out.println("A학점"); 
		 	System.out.println("참 잘했습니다.");
		}
		else if(score >= 80) System.out.println("B학점");
		else if(score >= 70) System.out.println("C학점");
		else if(score >= 60) System.out.println("D학점");
		else 				 System.out.println("F학점");
		scan.close();
	}

}
