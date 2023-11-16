package chap12;
/*
 * 동기화 예제 : 동기화블럭
 */
class PrintThread1 extends Thread {
	char ch;
	static Object lock = new Object(); // 모든 스레드 객체가 공유하는 공유객체
//	static int lock = 10;  기본자료형은 lock객체로 사용 불가
	PrintThread1(char ch) {
		this.ch = ch;
	}
	@Override
	public void run() {
		for(int i=0; i<20; i++) {
			synchronized (lock) { // lock을 가진 Thread만 동기화블럭 실행함
				for(int j=0; j<80; j++) {
					System.out.print(ch);
				}
				System.out.println();
			} // synchronized 끝 / lock 해제
		}
	}
}
public class ThreadEx5 {

	public static void main(String[] args) {
		PrintThread1 t1 = new PrintThread1('A');
		PrintThread1 t2 = new PrintThread1('B');
		PrintThread1 t3 = new PrintThread1('C');
		t1.start(); t2.start(); t3.start();
	}

}
