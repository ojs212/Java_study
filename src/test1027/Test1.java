package test1027;

import java.util.Scanner;

/*
 * 대칭수 구하는 프로그램을 작성하기
   대칭수란 숫자를 거꾸로 읽어도 앞으로 읽는 것과  같은 수를 말한다.
   12321 : 대칭수
   12345 : 대칭수 아님
 */
public class Test1 {
	public static void main(String[] args) {
		System.out.println("숫자를 입력해주세요");
		Scanner sc = new Scanner(System.in);
		String num = sc.next();
		String[] arr = {num};
		char[] arr1 = arr[0].toCharArray();
		int n = arr1.length-1;
		for(int i=0; i<arr1.length; i++) {
			if (arr1[i] == arr1[n]){
				n--; 
			} else {
				System.out.println(num + " : 대칭수 아님");
				break;
			}
			if(i == arr1.length-1) {
				System.out.println(num + " : 대칭수");
			}
		}
		sc.close();
	}
}