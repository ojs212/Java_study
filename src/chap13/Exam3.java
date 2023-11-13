package chap13;

import java.util.*;

/*
 * TreeSet 을 이용하여 Lotto 번호 생성 구현하기
 */
public class Exam3 {

	public static void main(String[] args) {
		TreeSet<Integer> ts = new TreeSet<>();
		while(ts.size() < 6) {
			ts.add((int)(Math.random() * 45 + 1));
		}
		System.out.println(ts);
		// Random 클래스를 이용
//		Random ball = new Random();
//		ball.setSeed(System.currentTimeMillis());
//		while(ts.size() < 6) {
//			ts.add(ball.nextInt(45) + 1);
//		}
//		System.out.println(ts);
	}

}
