package chap12;
/*
 * wait(), notify(), notifyAll() 메서드
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
					notifyAll();
					break;
				}
				withDraw();
				if(money % 20000 == 0) {
					try {
						wait();
					} catch(InterruptedException e) {}
				} else {
					notifyAll();
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
