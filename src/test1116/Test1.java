package test1116;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
 * ThreadEx8번의 DataAddThread 를 Runnable 인터페이스를 구현한
 *   방식으로 변경하기 
 */
class DataAddThread implements Runnable {
	String[] data = {"태연","써니","윤아","유리","서현","수영"};
	int interval = 2 * 1000;
	List<String> list = new ArrayList<>();
	@Override
	public void run() {
		while(true) {
			try {
				Thread.sleep(interval);
				list.add(data[(int)(Math.random() * data.length)]);
			} catch(InterruptedException e) {}
		}
	}
	
}
public class Test1 {
	
	public static void main(String[] args) throws InterruptedException {
		Scanner sc = new Scanner(System.in);
		DataAddThread dat = new DataAddThread();
		Thread t1 = new Thread(dat);
		dat.list.add(dat.data[0]);
		System.out.println(dat.list);
		t1.setDaemon(true);
		t1.start();
		while(true) {
			System.out.print(">>");
			String str = sc.next().trim();
			dat.list.remove(str);
			if(dat.list.size() == 0) {
				break;
			}
			System.out.println(dat.list);
		}
		sc.close();
		System.out.println("프로그램 종료");
	}
}