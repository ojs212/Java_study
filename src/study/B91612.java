package study;

import java.util.Scanner;

public class B91612 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cnt = sc.nextInt();
		int num[] = new int[cnt];
		int n;
		
		for(int i=0; i<=num.length; i++) {
			n = sc.nextInt();
			n = num[i];
		}
		for(int i=0; i<num.length; i++) {
			if(num[i] > 0) {
				i += 1;
			}
		}
		sc.close();
	}

}
