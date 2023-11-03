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
	Product(int price) {
		this.price = price;
		point = price / 10;
	}
}
class Tv extends Product {
	Tv() {
		super(100);
	}
	public String toString() {
		return "TV";
	}
}
class Computer extends Product {
	Computer() {
		super(200);
	}
	public String toString() {
		return "Computer";
	}
}
class HandPhone extends Product {
	HandPhone() {
		super(150);
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
		System.out.printf("TV의 가격:%d, 포인트:%d\n", t.price, t.point);
		System.out.printf("Computer의 가격:%d, 포인트:%d\n", c.price, c.point);
		System.out.printf("HandPhone의 가격:%d, 포인트:%d\n", h.price, h.point);
		//Product 타입의 배열로 저장
		Product[] parr = new Product[3];
		parr[0]=t;
		parr[1]=c;
		parr[2]=h;
		// Product 객체의 가격 합과 포인트의 합 출력하기
		int totPrice = 0;
		int totPoint = 0;
		for(int i=0; i<parr.length; i++) {
			totPrice += parr[i].price;
			totPoint += parr[i].point;
		}
		System.out.println("가격의 합:" + totPrice + ", 포인트의 합:" + totPoint);
	}

}
