package test1027;
import java.util.Scanner;
/*
 * 10진수를 2,8,10,16 진수로 변경하기
 * [결과]
10진수 값을 입력하세요
16

16의 2진수 :10000
16의 8진수 :20
16의 10진수 :16
16의 16진수 :10

*/
public class Test3 {
	public static void main(String[] args) {
		System.out.println("10진수 값을 입력하세요");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] bin = new int[32];
		int div = n;
		int index = 0;
		while(div > 0) {
			bin[index++] = div % 2;
			div /= 2;
		}
		System.out.print(n + "의 2진수 : ");
		for(int i=index-1; i>=0; i--) {
			System.out.print(bin[i]);
		}
		System.out.println();
		
		int[] octa = new int[32];
		int div2 = n;
		int index2 = 0;
		while(div2 > 0) {
			octa[index2++] = div2 % 8;
			div2 /= 8;
		}
		System.out.print(n + "의 8진수 : ");
		for(int i=index2-1; i>=0; i--) {
			System.out.print(octa[i]);
		}
		System.out.println();
		
		System.out.println(n + "의 10진수 : " + n);
		char[] c = "0123456789ABCDEF".toCharArray();
		char[] hex = new char[12];
		int div3 = n;
		int index3 = 0;
		while(div3 > 0) {
			hex[index3++] = c[div3 % 16];
			div3 /= 16;
		}	
		System.out.print(n + "의 16진수 : ");
		for(int i=index3-1; i>=0; i--) {
			System.out.print(hex[i]);
		}
		System.out.println();
		sc.close();
	}
}