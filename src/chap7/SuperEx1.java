package chap7;
/*
 * super 예약어
 * 
 * super() 생성자 : 부모클래스의 생성자를 호출시 사용. 자손클래스 생성자의 첫줄에 구현해야함
 * 				자손클래스에서 부모클래스의 생성자의 매개변수 설정에 맞도록 호출
 * 				부모클래스의 생성자 중 매개변수가 없는 생성자가 있다면 생략 가능 : super()
 * 				부모클래스의 생성사 중 매개변수가 없는 생성자가 없다면 생략 불가 : super(...)
 * super 참조변수 : 부모클래스의 객체를 참조하는 참조변수
 */
class Parent {
	int x = 10;
	Parent(int x) {
		this.x = x;
	}
}
class Child extends Parent {
	int x = 20;
	Child() {
		super(100); // 부모클래스의 생성자 호출 (반드시 첫줄에서 호출)
		System.out.println("Child 클래스의 생성자");
//		super(); // 부모클래스의 생성자에 맞지 않음
	}
	void method() {
//		int x = 30;
		System.out.println("x=" + x);
		System.out.println("this.x=" + this.x);
		System.out.println("super.x=" + super.x);
	}
}
public class SuperEx1 {

	public static void main(String[] args) {
		Child c = new Child();
		c.method();
	}

}
