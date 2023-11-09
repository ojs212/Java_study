package alg;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		char c = 'a';
		char[] arr = new char[26];
		for(char a : arr) {
			a += c++;
			System.out.print(a);
		}
		for(int i=0; i<s.length(); i++) {
		}
		sc.close();
	}
}
