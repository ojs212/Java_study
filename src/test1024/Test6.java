package test1024;
import java.util.Scanner;
//  반지름을 입력받아 원의 둘레와 면적을 소숫점 2자리로 출력하기
public class Test6 {
	public static void main(String[] args) {
		double pi = 3.141592;
		System.out.println("반지름을 입력하세요");
		Scanner scan = new Scanner(System.in);
		double r = scan.nextDouble();
		System.out.printf("원의 둘레 : %.2f \n", r * pi * 2);
		System.out.printf("원의 면적 : %.2f \n", r * r * pi);
		scan.close();
	}
}