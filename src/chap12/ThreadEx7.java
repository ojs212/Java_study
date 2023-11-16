package chap12;
/*
 * 데몬스레드
 * 1. 일반스레드의 보조기능 / 무한반복 처리함
 *    가비지콜렉터 : 데몬스레드
 * 2. 일반스레드가 종료되는 데몬스레드도 자동 종료됨
 * 3. setDaemon(true) -> New 상태에서만 설정이 되야함
 */
class DaemonThread extends Thread {
	@Override
	public void run() {
		while(true) {
			// this.toString() : Thread[스레드명,우선순위,스레드그룹명]
			System.out.println(this);
			try {
				sleep(100); //0.1초
			} catch (InterruptedException e) {}
		}
	}
}
public class ThreadEx7 {

	public static void main(String[] args) throws InterruptedException {
		DaemonThread t1 = new DaemonThread();
		DaemonThread t2 = new DaemonThread();
		t1.setDaemon(true); t2.setDaemon(true); // 데몬스레드로 설정 / New 상태에서 설정
		t1.start(); t2.start();
		Thread.sleep(2000);
		System.out.println(Thread.currentThread().getName() + " 종료");
	}

}
