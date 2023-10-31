package test1025;
/*
 시스템과 가위(1), 바위(2), 보(3)를 하기
  시스템은 1,2,3 중의 한개의 숫자를 저장하고, 
  한개의 숫자를 입력받아 가위바위보 게임하기 
  
  [결과]
  가위(1), 바위(2), 보(3) 를 숫자로 입력하세요
  1
  사용자 승리!

  가위(1), 바위(2), 보(3) 를 숫자로 입력하세요
  1
  시스템 승리!
*/

import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {
		System.out.println("가위(1), 바위(2), 보(3) 를 숫자로 입력하세요");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		int sysNum = (int)(Math.random() * 3 + 1);
		if (num == 1 && sysNum == 2) {
			System.out.println("시스템 승리!");
		} else if (num == 1 && sysNum == 3) {
			System.out.println("사용자 승리!");	
		} else if (num == 2 && sysNum == 1) {
			System.out.println("사용자 승리!");
		} else if (num == 2 && sysNum == 3) {
			System.out.println("시스템 승리!");
		} else if (num == 3 && sysNum == 1) {
			System.out.println("시스템 승리!");
		} else if (num == 3 && sysNum == 2) {
			System.out.println("사용자 승리!");
		} else {
			System.out.println("비김");
		} 
		System.out.println("시스템 : " + sysNum);
		scan.close();
	}

}