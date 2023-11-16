package chap12;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 * ThreadEx3.java 소스의 SumThread를, Runnable을 구현한 SumRunnable 클래스로 변경하여 구현하기 
 */
class SumRunnable implements Runnable {
	int startNum, lastNum, sum;
	SumRunnable(int startNum, int lastNum) {
		this.startNum = startNum;
		this.lastNum = lastNum;
	}
	@Override
	public void run() {
		for(int i=startNum; i<=lastNum; i++) {
			sum += i;
		}
	}
	
}
public class Exam1 {

	public static void main(String[] args) throws InterruptedException {
		System.out.println(Thread.currentThread().getName() + "스레드 시작");
		List<SumRunnable> list = Arrays.asList(new SumRunnable(1,200),
				new SumRunnable(201,400),new SumRunnable(401,600),
				new SumRunnable(601,800),new SumRunnable(801,1000));
		List<Thread> tlist = new ArrayList<>();
		for(SumRunnable a: list) {
			tlist.add(new Thread(a));
		}
		for(Thread a : tlist) {
			a.start();
			a.join();
		}
		int sum = 0;
		for(SumRunnable a : list) {
			sum += a.sum;
		}
		System.out.println("1~1000의 합:" + sum);
		System.out.println(Thread.currentThread().getName() + "스레드 종료");
	}

}
