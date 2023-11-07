package chap9;
/*
 * 
 */
class Outer {
	public int iv = 10;
	void method() {
		int iv = 20; 
//		iv++;  지역변수를 중첩클래스의 메서드에서 사용시 상수화 필요
		Runnable r = new Runnable() {
//			int iv = 100; // 중첩클래스의 멤버변수
			@Override
			public void run() {
				System.out.println(iv);
//				System.out.println(this.iv);
				System.out.println(Outer.this.iv);
			}
		};
		r.run();
	}
	void method2() {
		int iv = 20; 
//		iv++;  람다함수에서 사용되는 지역변수는 상수화 필요
		Runnable r = () -> {
			System.out.println(iv);
			System.out.println(this.iv); // Outer.iv 호출
			System.out.println(Outer.this.iv);
		};
		r.run();
	}
}
public class InnerEx4 {

	public static void main(String[] args) {
//		new Outer().method();
		new Outer().method2();
	}

}
