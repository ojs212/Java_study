package alg;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int star = h * 2 - 1;
		for(int i=0; i<h; i++) {
			for(int j=0; j<star; j++) {
				if(star/2+i >= j && star/2-i <= j) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		for(int i=h-2; i>=0; i--) {
			for(int j=0; j<star; j++) {
				if(star/2+i >= j && star/2-i <= j) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		sc.close();
	}
}