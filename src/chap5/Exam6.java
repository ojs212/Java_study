package chap5;
import java.util.Scanner;

public class Exam6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("삼각형의 높이를 입력하세요");
		int h = sc.nextInt();
		int num = 0;
		for(int i=1; i<=h; i++) {
			num += i;
		}
		for(int i=0; i<h; i++) {
			for(int j=0; j<h; j++) {
				if(i <= j) {
					System.out.print(num-- + "\t");
				} else {
					System.out.print("\t");
				}		
			}
			System.out.println();
		}
		sc.close();
	}

}
