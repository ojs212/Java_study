package chap8;
/*
 * 추상클래스와 인터페이스의 객체화 -> 이름없는 객체(익명개체) 이름없는 내부클래스
 */
interface Action {
	void action();
}
abstract class Abs {
	int num = 100;
	abstract void method();
}
public class InterfaceEx4 {

	public static void main(String[] args) {
		// 인터페이스의 객체화
		Action a = new Action() {
			@Override
			public void action() {
				System.out.println("Action 인터페이스의 action 메서드");
			}
		};
		a.action();
		// 추상클래스의 객체화
		Abs ab = new Abs() {
			void method() {
				System.out.println("num=" + num);
			}
		};
		ab.method();
	}

}
