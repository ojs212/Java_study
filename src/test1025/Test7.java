package test1025;
import java.util.Scanner;
/*
 * 삼각형의 높이를 입력받아 다음 삼각형을 출력하기
 [결과]
 삼각형의 높이 : 3
          i   j
    *     1   3
   ***    2  234
  *****   3 12345
 
 */
public class Test7 {
	public static void main(String[] args) {
		System.out.print("삼각형의 높이 :");
		Scanner scan = new Scanner(System.in);
		int h = scan.nextInt();
		for(int i=0; i<h; i++) {
			for(int j=i; j<h-1; j++) {
				System.out.print(" ");
			}
			for(int k=0; k<(i+1)*2-1; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		scan.close();
	}
}