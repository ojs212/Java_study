package chap6;

/*
 * 1. 직사각형클래스(Rectangle) 구현하기
 * 멤버변수 : 가로(width),세로(height)
 * 멤버 메서드 : void area() -> 넓이 출력 기능
 * 멤버 메서드 : void length() -> 둘레 출력 기능
 * 
 * 2. 구동클래스(Exam1.java) : main 메서드가 존재하는 클래스
 *    - Rectangle 클래스의 객체 생성하여 r1 참조변수로 참조하기
 *    - 가로, 세로 길이를 10, 5
 *    - r1 사각형의 넓이, 둘레 출력하기
 */
class Rectangle {
	double width;
	double height;

	void area() {
		System.out.println("사각형의 넓이 : " + width * height);
	}

	void length() {
		System.out.println("사각형의 둘레 : " + (width + height) * 2);
	}
}

public class Exam1 {

	public static void main(String[] args) {
		Rectangle r1 = new Rectangle();
		r1.width = 10;
		r1.height = 5;
		r1.area();
		r1.length();
	}

}
