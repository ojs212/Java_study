package chap7;
/*
 *  추상클래스
 * 1. 추상메서드를 멤버로 가질수 있는 클래스 -> abstract 예약어 사용
 * 2. 객체화 불가 -> 상속으로 자손클래스의 객체화로 객체화됨
 * 3. 그외는 일반클래스와 동일(생성자, 멤버변수, 초기화블럭, 상속받기...)
 * 
 *  추상메서드
 * 1. 메서드의 선언부만 존재함 / 구현부{} 가 없다 -> abstract 예약어 사용
 * 2. 자손클래스에서 반드시 오버라이딩 필요
 */
abstract class Shape {
	String type;
	Shape(String type) {
		this.type = type;
	}
	abstract double area();
	abstract double length();
}
class Circle extends Shape {
	int r;
	Circle(int r) {
		super("원");
		this.r = r;
	}
	@Override
	double area() {
		return r * r * Math.PI;
	}
	@Override
	double length() {
		return 2 * r * Math.PI;
	}
}
public class AbstractEx1 {

	public static void main(String[] args) {
//		Shape s = new Shape("도형"); // 추상클래스는 객채화 불가
		Shape s = new Circle(10);
		System.out.println(s.area());
		System.out.println(s.length());
		System.out.println(((Circle)s).r);
		Circle c = (Circle)s;
		System.out.println(c.r);
	}

}
