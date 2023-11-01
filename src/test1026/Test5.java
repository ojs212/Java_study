package test1026;


import java.util.Scanner;

/*
삼각형의 높이를 입력하세요
3
*****
 ***
  *
 
 */
public class Test5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("삼각형의 높이를 입력하세요");
		int h = sc.nextInt();
		for(int i=h; i>0; i--) {
			for(int j=h; j>i; j--) {
				System.out.print(" ");
			}
			for(int k=i*2-1; k>0; k--) {
				System.out.print("*");
			}
			System.out.println();
		}
		sc.close();
	}
}