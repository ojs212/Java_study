package alg;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s1 = sc.nextLine();
		String[] arr1 = s1.split("");
		int cnt = 0;
		while(true) {
		String s2 = sc.nextLine();
		String[] arr2 = s2.split("");
			for(int i=0; i<arr1.length; i++) {
				for(int j=0; j<arr2.length; j++) {
					if(arr1[i].equals(arr2[j])) {
						arr1[i] = "";
						cnt++;
					}
				}
			}
			for(String a : arr1) {
			System.out.print(a);
			}
			System.out.println();
			if(cnt == arr1.length) {
				System.out.println("FRULA");
				break;
			}
		}
	
		sc.close();
	}
}
