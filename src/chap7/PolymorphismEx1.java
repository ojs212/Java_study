package chap7;
/*
 * 다형성 : 참조변수의 형변환
 * 1. 자손타입의 객체는 부모타입의 참조변수로 참조가 가능함 -> 자손객체 내부에 부모객체를 포함
 * 2. 부모타입의 참조변수로 자손객체를 참조시 부모타입의 멤버들만 호출 가능
 * 3. 모든클래스의 객체는 Object 타입의 참조변수로 참조가 가능
 *   -> Object 타입의 참조변수로 참조시 Object 클래스의 멤버만 호출 가능
 */
public class PolymorphismEx1 {

	public static void main(String[] args) {
		AutoBike ab = new AutoBike(2);
		ab.power();
		System.out.println(ab.drive());
		System.out.println(ab.wheel);
		Bike b = ab;
//		b.power();   자손클래스의 메서드라 사용 불가
		System.out.println(b.drive());
		System.out.println(b.wheel);
		Object o = b;
		o.toString();
/*	Object 타입의 참조변수로 AutoBike 객체 참조시, Object 객체의 멤버만 호출 가능
		o.power();
		System.out.println(o.drive());
		System.out.println(o.wheel); */
	}

}
