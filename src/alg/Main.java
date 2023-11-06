package alg;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int gold = 0;
		int max = 0;
		if(a > b) {
			if(a > c) {
				max = a;
			} else {
				max = c;
			}
		} else if(b > a) {
			if(b > c) {
				max = b;
			}
		}
		if(a == b) {
			if(a == c) {
				gold = 10000 + a * 1000; 
			} else {
				gold = 1000 + a * 100;
			}
		} else if(a != b && b != c && a != c) {
			gold = max * 100;
		}
		if(a == c) {
			if(a != b) {
				gold = 1000 + a * 100;
			}
		}
		if(b == c) {
			if(b != a) {
				gold = 1000 + a * 100;
			}
		}
		System.out.println(gold);
		sc.close(); 
	}
}
