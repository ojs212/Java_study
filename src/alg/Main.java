package alg;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		s = s.trim();
		String[] arr = s.split(" ");
		System.out.println(arr.length);
		sc.close();
	}
}
