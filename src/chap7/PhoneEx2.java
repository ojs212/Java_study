package chap7;
/*
 * 자손클래서에서 객체 생성시 부모클래스의 객체 생성을 먼저함
 * -> 자손클래스의 생성자에서 부모클래스의 생성을 호출해야함
 *    이때 부모클래스의 생성자 중 매개변수가 없는 생성자가 없다면 
 *    super(부모클래스의 매개변수에 맞는 값)을 넣어서 따로 호출
 *    부모클래스의 생성자 중 매개변수가 없는 생성자가 존재하면 super()는 생략 가능
 *    컴파일 단계에서 구현됨
 */
class Phone2 {
	boolean power;
	int number;
	Phone2() {
		
	}
	Phone2(int number) {
		super(); // 생략됨
		System.out.println("부모클래스의 생성자");
		this.number = number;
	}
	void power() {
		power = !power;
	}
	void send() {
		if (power) {
			System.out.println("전화 걸기");
		}
	}
	void receive() {
		if (power) {
			System.out.println("전화 받기");
		}
	}
}
class SmartPhone2 extends Phone2 {
	SmartPhone2() { // 자손클래스의 생성자
		// 부모클래스의 생성자를 호출해야함
//		super(1234);
		System.out.println("자손클래스의 생성자");
	}
	void setApp(String name) {
		System.out.println(name + "앱을 설치함");
	}
}
public class PhoneEx2 {

	public static void main(String[] args) {
//		SmartPhone2 sp = new SmartPhone2();
	}
}
