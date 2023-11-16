package chap12;
/*
 * Thread 생성
 * 1. Thread 클래스 상속 / run() 메서드 구현
 *    run() : Thread 기능 구현 메서드
 */
class Thread1 extends Thread { // Thread 클래스 상속
	Thread1(String name) {
		super(name); // Thread 이름 설정
	}
	/*
	 * Runnalbe -> 스케줄러(프로그래머가 관여 못함) -> Running 상태
	 */
	@Override
	public void run() { // Running 상태 : run() 메서드 실행 상태
		for(int i=1;i<=5;i++) {
			// getName() : Thread 객체의 이름
			System.out.println(i + "=" + getName());
			try {
				sleep(1000); // 1000밀리초(1초) 대기
			} catch(InterruptedException e) {}
		}
	}
}
public class ThreadEx1 {

	public static void main(String[] args) {
		System.out.println("mian 스레드 시작");
		Thread t1 = new Thread1("First"); // New 상태
		Thread t2 = new Thread1("Second"); // New 상태
		t1.start(); t2.start(); // Runnable 상태 / 실행가능상태
		/*
		 * start() 메서드
		 * : New 상태 스레드를 Runnable 상태로 변경 
		 * 1. 스택을 병렬화
		 * 2. 병렬화된 스택영역에 run() 메서드 호출 -> Running 상태
		 */
		System.out.println("main 스레드 종료"); // main 메서드 종료
	}

}
