package chap12;
/*
 * Thread 생성
 * 2. Runnable 인터페이스 구현 -> 구현클래스가 Thread 클래스는 아님
 *    new Thread(Runnable 객체)
 *    run() 메서드 구현
 */
class Runnable1 implements Runnable { // -> Thread 클래스가 아님
	@Override
	public void run() {
		for(int i=1; i<=5; i++) {
			// Thread.currentThread() : 현재 실행중인 스레드 객체의 getName() 리턴
			System.out.println(i + "=" + Thread.currentThread().getName());
			try {
				Thread.sleep(1000);
			} catch(InterruptedException e) {}
		}
	}
}
public class ThreadEx2 {

	public static void main(String[] args) { // 스레드
		System.out.println(Thread.currentThread().getName() + "스레드 시작");
		Runnable r = new Runnable1(); // Runnable 객체 생성
		// t1 스레드가 Running시 r 객체의 run 메서드를 실행
		Thread t1 = new Thread(r, "first"); // New 상태
		// t2 스레드가 Running시 r 객체의 run 메서드를 실행
		Thread t2 = new Thread(r, "second"); // New 상태
		t1.start(); t2.start(); // 병렬화, r.run() 호출
		System.out.println(Thread.currentThread().getName() + "스레드 종료");
	}

}
