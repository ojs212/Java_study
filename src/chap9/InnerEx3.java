package chap9;
/*
 * 중첩클래스 객체에서 this
 */
class P {
	int iv = 0;
}
class Outer3 extends P {
	int iv = 10;
	int iv2 = 20;
	class InstanceInner {
		int iv = 100;
		void method() {
			int iv = 300;
			System.out.println("iv=" + iv);
			System.out.println("iv2=" + iv2);
			// this : 중첩클래스의 객체 참조변수
			System.out.println("this.iv=" + this.iv);                 // InstanceInner.iv
			System.out.println("Outer3.this.iv=" + Outer3.this.iv);   // Outer3.iv
			System.out.println("Outer3.super.iv=" + Outer3.super.iv); // P.iv
		}
	}
}
public class InnerEx3 {

	public static void main(String[] args) {
		new Outer3().new InstanceInner().method();
	}

}
