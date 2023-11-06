package chap8;
/*
 * jdk 8 이전 : 인터페이스의 멤버는 상수와 추상메서드만 가능
 * jdk 8 이후 : default 메서드, static 메서드 추가 -> 구현부 존재 가능 
 * 인터페이스 내에 구현부가 존재하는 메서드
 * default 메서드 : 인스턴스 멤버
 * static 메서드 : 클래스 멤버
 * 
 * 인터페이스는 다중 구현이 가능함
 *   -> 구현클래스의 객체에서 같은메서드 전재
 *   -> 구현클래스에서 default 메서드를 오버라이딩 필요
 *   
 *   static 메서드는 같은 메서드가 여러개 존재해도, 인터페이스명.메서드명 으로 호출되므로 상관없다
 */
interface MyInterface1 {
	void method();
	default void method1() {
		System.out.println("MyInterface1의 default 메서드 : method1");
	}
	static void method2() {
		System.out.println("MyInterface1의 static 메서드 : method2");
	}
}
interface MyInterface2 {
	void method();
	default void method1() {
		System.out.println("MyInterface1의 default 메서드 : method1");
	}
	static void method2() {
		System.out.println("MyInterface1의 static 메서드 : method2");
	}
}
class Parent {
	public void pmethod() {
		System.out.println("Parent 클래스의 pmethod()");
	}
}
class Child extends Parent implements MyInterface1, MyInterface2 {
	@Override
	public void method() {
		System.out.println("Child 클래스의 method()");
	}
	@Override
	public void method1() { // default 메서드는 오버라이딩 가능
		MyInterface1.super.method1(); // MyInterface1의 method1 호출
		MyInterface2.super.method1(); // MyInterface2의 method1 호출
	}
}
public class InterfaceEx5 {

	public static void main(String[] args) {
		Child c = new Child();
		c.method();
		c.method1(); // MyInterFace1.method1 default 메서드 / 참조변수명.메서드 호출가능
//		c.method2(); method2는 인터페이스의 static 메서드 / 인터페이스명.메서드명 호출해야함
//		Child.method2();
		MyInterface1.method2(); // static 메서드 호출
		c.pmethod();
	}

}
