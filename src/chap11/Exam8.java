package chap11;
import java.util.*;
public class Exam8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Calendar cal = Calendar.getInstance();
		System.out.println("년도와 월을 입력하세요");
		int year = sc.nextInt();
		int mon = sc.nextInt();
		String w = " 일월화수목금토";
		int lastDay = 0;
		int cnt = 0;
		cal.set(year, mon-1, 1);
		lastDay = cal.getActualMaximum(Calendar.DATE);
		System.out.println("\t\t" + year + "년 " + mon + "월");
		System.out.println();
		
		for(int i=1; i<w.length(); i++) {
			System.out.print(w.charAt(i) + "\t");
		}
		System.out.println();
		for(int i=1; i<7; i++) {
			if(i < cal.get(Calendar.DAY_OF_WEEK)) {
				System.out.print("\t");
				cnt++;
			} else {
				break;
			}
		}
		for(int i=1; i<=lastDay; i++) {
			System.out.print(i+ "\t");
			cnt++;
			if(cnt % 7 == 0) {
				System.out.println();
			}
		}
		System.out.println();
		System.out.println();
		System.out.println("\t" + year + "년 " + mon + "월");
		System.out.println();
		cnt=0;
		for(int i=1; i<w.length(); i++) {
			System.out.print(w.charAt(i) + "  ");
		}
		System.out.println();
		for(int i=1; i<7; i++) {
			if(i < cal.get(Calendar.DAY_OF_WEEK)) {
				System.out.print("   ");
				cnt++;
			} else {
				break;
			}
		}
		for(int i=1; i<=lastDay; i++) {
				System.out.printf("%2d ",i);
				cnt++;
			if(cnt % 7 == 0) {
				System.out.println();
			}
		}
	}

}
