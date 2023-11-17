package chap12;
/*
 * wait(), notify(), notifyAll() 메서드
 * 1. 동기화 영역에서만 호출 가능
 * 2. Object 클래스의 멤버메서드 -> 모든 객체에서 호출이 가능
 * 3. wait() : 실행중인 스레드를 대기상태로 변환 / Lock 헤제
 *    notify() : wait() 스레드 한개를 Runnable 상태로 변경 / 개발자 선택 불가
 *    notifyAll() wai,t() 스레드 모두를 Runnable 상태로 변경
 */
class ATM2 implements Runnable {
	private int money = 100000;
	public void run() {
		try {
			Thread.sleep((int)(Math.random() * 1000));
		} catch(InterruptedException e) {}
		synchronized(this) {
			while(true) {
				if(money <= 0) {
					notifyAll(); // 프로그램 종료 전 대기 중인 모든스레드를 Runnable 상태로 변경
					break;
				}
				withDraw();
				if(money % 20000 == 0) {
					try {
						wait(); // 대기상태 / lock 해제
					} catch(InterruptedException e) {}
				} else {
					notifyAll(); // wait() 사태인 스레드 전부 Runnable 상태로
				}
			}
		}
	}
	private void withDraw() {
		if(money <= 0) {
			return;
		}
		money -= 10000;
		System.out.println(Thread.currentThread().getName() + "출금. 잔액:" + money);
	}
	
}
public class ThreadEx11 {

	public static void main(String[] args) {
		ATM2 atm = new ATM2();
		Thread alpha = new Thread(atm, "ALPHA");
		Thread beta = new Thread(atm, "BETA");
		alpha.start(); beta.start();
	}

}
