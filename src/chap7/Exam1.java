package chap7;
/*
 * Product 클래스
 *   멤버변수 : 가격(price), 포인트(point)
 *   생성자 : 가격을 입력받아 가격의 10%를 포인트로 저장
 *   
 * Tv클래스 : Product 클래스의 하위 클래스
 *   가격 : 100
 *   toString : TV 리턴
 * Computer 클래스 : Product 클래스의 하위 클래스
 *   가격 : 200
 *   toString : Computer 리턴
 * HandPhone 클래스 : Product 클래스의 하위 클래스
 *   가격 : 150
 *   toString : HandPhone 리턴
 */
class Product {
	int price, point;
	Product() {
		point = price / 10;
	}
}
class Tv extends Product {
	Tv() {
		price = 100;
	}
	public String toString() {
		return "TV";
	}
}
class Computer extends Product {
	Computer() {
		price = 200;
	}
	public String toString() {
		return "Computer";
	}
}
class HandPhone extends Product {
	HandPhone() {
		price = 150;
	}
	public String toString() {
		return "HandPhone";
	}
}
public class Exam1 {

	public static void main(String[] args) {
		Tv t = new Tv();
		Computer c = new Computer();
		HandPhone h = new HandPhone();
		System.out.println(t.point);
		System.out.println(c.point);
		System.out.println(h.point);
	}

}
