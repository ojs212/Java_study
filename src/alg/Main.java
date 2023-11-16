package alg;
// abc =3  def = 4 ghi = 5 jkl = 6 mno = 7 pqrs = 8 tuv = 9 wxyz = 10
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next().trim();
		String[] arr = s.split("");
		int result = 0;
		for(int i=0; i<s.length(); i++) {
			if("ABC".contains(arr[i])) {
				result += 3;
			} else if("DEF".contains(arr[i])) {
				result += 4;
			} else if("GHI".contains(arr[i])) {
				result += 5;
			} else if("JKL".contains(arr[i])) {
				result += 6;
			} else if("MNO".contains(arr[i])) {
				result += 7;
			} else if("PQRS".contains(arr[i])) {
				result += 8;
			} else if("TUV".contains(arr[i])) {
				result += 9;
			} else if("WXYZ".contains(arr[i])) {
				result += 10;
			}
		}
		System.out.println(result);
		sc.close();
	}
}