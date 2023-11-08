package test1107;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
  1부터 100까지 중 임의의 숫자를 컴퓨터가 저장하고, 
  값을 입력받아 저장된 값을 맞추는 프로그램을 작성하기
  -1 부터 100까지의 숫자가 아닌 경우 : 1 과 100사이의 숫자만 입력하세요 메세지출력 
  -숫자가 입력이 안된 경우 :  숫자만 입력하세요  메세지 출력
  계속 입력을 받는다.
  몇번의 입력만에 숫자를 맞추었는지 출력하기.
  단 입력 오류된 입력도 입력 건수에 포함된다.
  
  1. 임의의 수를 저장
  2. 반복문으로 데이터 입력 받기.
     정답과 비교
  3. 입력횟수 증가         
*/
public class Test1 {
	public static void main(String[] args) {
		int sysNum = (int)(Math.random() * 100 + 1);
		Scanner sc = new Scanner(System.in);
		System.out.println("1~100 사이 숫자를 입력하세요");
		int a = 0;
		int cnt = 0;
		while(true) {
			try {
				a = sc.nextInt();
				cnt++;
				if(a > 100 || a < 1) {
					throw new Exception("숫자를 다시 입력해주세요");
				}
			} catch(InputMismatchException e) {
				System.out.println("숫자만 입력하세요");
				sc.next();
				cnt++;
				continue;
			} catch(Exception e) {
				System.out.println(e.getMessage());
				continue;
			}
			if(a == sysNum) {
				System.out.println("정답입니다.");
				System.out.println(cnt + "번 만에 맞췄습니다.");
				break;
			} else if (a > sysNum) {
				System.out.println(a + "보다 작은 수 입니다.");
			} else {
				System.out.println(a + "보다 큰 수 입니다.");
			}
		}
		sc.close();
	}
}