package test1026;


import java.util.Scanner;

/*
 * [결과]
삼각형의 높이를 입력하세요
3
		9			
	8	7	6		
5	4	3	2	1	
 
*/
public class Test4 {
	public static void main(String[] args) {
		System.out.println("삼각형의 높이를 입력하세요");
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int num = 0;
		for(int i=1; i<=h; i++) {
			num = i * i;
		}
		for(int i=1; i<=h; i++) {
			for(int j=h; j>i; j--) {
				System.out.print("\t");
			}
			for(int k=1; k<=i*2-1; k++) {	  
				System.out.print(num-- + "\t");
			}	
			
			System.out.println();
		}
		sc.close();
	}
}