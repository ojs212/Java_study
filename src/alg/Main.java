package alg;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s1 = sc.next();
		String[] arr1 = s1.split("");
		while(true) {
			s1 = "";
			String s2 = sc.next();
			String[] arr2 = s2.split("");
			for(int i=0; i<arr1.length; i++) {
				for(int j=0; j<arr2.length; j++) {
					if(arr1[i].equals(arr2[j])) {
						arr1[i] = "";
					}
				}
			}
			for(String a : arr1) {
				System.out.print(a);
				s1 += a;
			}
			System.out.println();
			if(s1.equals("")) {
				break;
			}
		}
		System.out.println("FRULA");
	
		sc.close();
	}
}
