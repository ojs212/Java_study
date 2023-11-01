package chap4;

import java.util.Scanner;

/*
 * 삼각형의 높이를 입력받아서 *로 삼각형 출력하기
 * [결과]
 * 삼각형의 높이 : 3
   * 
   ** 
   ***
 * =========2
   ***
   ** 
   * 
   =========3
     *
    **
   ***
 */
public class Exam6 {

	public static void main(String[] args) {	
		System.out.print("삼각형의 높이 : ");
		Scanner scan = new Scanner(System.in);
		int height = scan.nextInt();
		System.out.println("1번 삼각형");
		for(int i=1; i<=height; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print("*");			
			}
			System.out.println();
		}
		System.out.println("2번 삼각형");
		for(int i=height; i>=1; i--) {
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("3번 삼각형");
		for(int i=height; i>=1; i--) {
			for(int j=1; j<=height; j++) {
				if(i <= j) {
				System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		System.out.println("4번 삼각형");
		for(int i=1; i<=height; i++) {
			for(int j=height; j>=1; j--) {
				if(i >= j) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		scan.close();
	}
}


