package test1027;
import java.util.Scanner;
/*
 * 1부터 9까지의 숫자 중 중복되지 않는  숫자 3개를 선택하고, 정렬하여 출력하기.
 * 
 * 1. 1 ~ 9 저장한 배열 생성.
 * 2. 선택 숫자를 저장할 배열 선언. 3개 값
 * 3. 1 ~ 9 배열을 섞기.
 * 4. 섞인 배열에서 3개의 숫자를 선택된 배열에 저장
 * 5. 선택된 배열을 정렬하여 출력
 */
public class Test6 {
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6,7,8,9};
		Scanner sc = new Scanner(System.in);
		int[] v = new int[3];
		System.out.println("1부터 9까지 숫자를 3개 입력하세요");
		for(int i=0; i<10000; i++) {
			int num1 = (int)(Math.random() * arr.length);
			int num2 = (int)(Math.random() * arr.length);
			int tmp = arr[num1];
			arr[num1] = arr[num2];
			arr[num2] = tmp;
		}
		for(int i=0; i<v.length; i++) {
			v[i] = sc.nextInt();
		}
		for(int i=0; i<v.length; i++) {
			for(int j=0; j<v.length-1-i; j++) {
				if(v[j] > v[j+1]) {
					int tmp = v[j];
					v[j] = v[j+1];
					v[j+1] = tmp;
				}
			}
		}
		for(int a : v) {
			System.out.print(a + " ");
		}
		System.out.println();
		sc.close();
	}
}