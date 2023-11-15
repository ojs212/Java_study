package alg;
// abc =3  def = 4 ghi = 5 jkl = 6 mno = 7 pqrs = 8 tuv = 9 wxyz = 10
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = "ABC,DEF,GHI,JKL,MNO,PQRS,TUV,WXYZ";
		String[] arr = str.split(",");
		String s = sc.next();
		int result = 0;
		for(int i=0; i<15; i++) {
			char c = 'A';
			if(s.indexOf(c) >= 'A' && s.indexOf(c) <= 'C') {
				result += 3;
				c++;
			} else {
				c++;
				break;
			}
		}
		System.out.println(result + "" + arr);
		sc.close();
	}
}