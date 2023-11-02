package chap7;
/*
 * 부모클래스의 멤버와 자손클래스의 멤버가 같은멤버인 경우
 *   멤버변수 : 참조변수의 자료형을 기준으로 호출됨
 *   멤버메서드 : 객체의 최종 오버라이딩된 메서드가 호출됨
 */
class Parent2 {
	int x = 10;
	void method() {
		System.out.println("Parent2 클래스의 method");
	}
}
class Child2 extends Parent2 {
	int x = 20;
	void method() {
		System.out.println("Child2 클래스의 method");
	}
}
public class PolymorphismEx2 {

	public static void main(String[] args) {
		Parent2 p = new Child2();
		System.out.println(p.x);
		p.method();
	}

}
