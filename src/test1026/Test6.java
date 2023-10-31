package test1026;


import java.util.Scanner;
/*

삼각형의 높이를 홀수로 입력하세요
5
*****
 ***
  *
 ***
*****


 */
public class Test6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int h = 0;
		while(true) {
			System.out.println("삼각형의 높이를 홀수로 입력하세요");
			h = sc.nextInt();
			if(h % 2 != 0) {
				break;
			}
		}
		for(int i=h/2; i>0; i--) {
			for(int j=h/2; j>i; j--) {
				System.out.print(" ");
			}
			for(int k=(i+1)*2-1; k>0; k--) {
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i=1; i<=h/2+1; i++) {
			for(int j=i; j<=h/2; j++) {
				System.out.print(" ");
			}
			for(int k=1; k<=i*2-1; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		sc.close();
	}
}