package chap6;
/*
 * this, this() 예제
 * 
 * this 참조변수 : 자기참조변수
 *       현재 객체의 참조값을 저장하고있음.
 *       인스턴스메서드에서만 사용 가능 -> 인스턴스메서드 내부에 지역변수로 선언
 *       지역변수와 멤버변수 구분시 사용함
 *       -> 버변수와, 지역변수는 같은 이름을 사용할 수 있다 -> 지역변수 우선
 *       
 * this() 생성자 : 클래스의 생성자에서 오버로딩된 다른 생성자를 호출시 사용
 *       -> 반드시 첫줄에 구현해야함
 */
class Car4 {
	String color;
	int number;
	int sno;
	static int cnt;
	Car4(String color, int number) {
		System.out.println("Car4(String clor, int number) 생성자 호출");
		this.color = color; // 멤버변수 color <- 매개변수 color 대입
		this.number = number;
		this.sno = ++cnt; // this 생략가능
	}
	Car4() {
		//this()는 반드시 생성자의 첫 줄에 구현해야함
		this("White", 1111); // 생성자중 (String,int) 형인 생성자 호출
		System.out.println("Car4() 생성자 호출");
	}
	Car4(String color) {
		this(color, 1111);
		System.out.println("Car4(String color) 생성자 호출");
	}
	Car4(int number) {
		this("White", number);
		System.out.println("Car4(int number) 생성자 호출");
	}
	public String toString() {
		return sno + "번자동차:" + color + "," + number;
	}
}
public class ThisEx1 {

	public static void main(String[] args) {
		System.out.println("=== c1 객체 생성");
		Car4 c1 = new Car4("Blue", 1234);
		System.out.println("=== c2 객체 생성");
		Car4 c2 = new Car4();
		System.out.println("=== c3 객체 생성");
		Car4 c3 = new Car4("Red");
		System.out.println("=== c4 객체 생성");
		Car4 c4 = new Car4(3333);
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		System.out.println(c4);
	}

}
