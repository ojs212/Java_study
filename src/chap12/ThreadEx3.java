package chap12;

import java.util.Arrays;
import java.util.List;

/*
 *  1~1000까지의 합을 5개의 스레드로 나누어 구하기
 *  main 스레드는 모든 스레드가 종료할때까지 대기
 */
class SumThread extends Thread {
	int startNum, lastNum, sum;
	SumThread(int startNum, int lastNum) {
		this.startNum = startNum;
		this.lastNum = lastNum;
	}
	@Override
	public void run() { // startNum ~ lastNum 합구하기
		for(int i=startNum; i<=lastNum; i++) {
			sum += i;
		}
	}
	
}
public class ThreadEx3 {

	public static void main(String[] args) throws InterruptedException {
		// Arrays.asList(객체들) : 객체들을 List 객체로 리턴 
		List<SumThread> list = Arrays.asList(new SumThread(1,200),
		new SumThread(201,400),new SumThread(401,600),
		new SumThread(601,800),new SumThread(801,1000));
		int sum = 0;
		for(SumThread s : list) {
			s.start(); // 멀티 스레드 환경
//			s.run();      싱글 스레드 환경
			s.join();  // s 스레드가 종료까지 main 스레드가 대기상태
			sum += s.sum;
		}
		System.out.println("1~1000까지의 전체합:" + sum);
	}

}
