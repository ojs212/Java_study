package alg;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[]arr = new int[n];
		int x = sc.nextInt();
		for(int i=0; i<arr.length; i++) {
			int na = sc.nextInt();
			arr[i] = na;
		}
		for(int a : arr) {
			if(x > a) {
				System.out.print(a + " ");
			}
		}
		sc.close();
	}
}
