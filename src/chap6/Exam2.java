package chap6;
/*
 * Rectangle 클래스 생성하기
 *  멤버변수 : 가로(width), 세로(height), 사각형번호(cnt), 생성된 사각형 갯수(cnt)
 *  멤버메서드 : 넓이(area), 둘레(length) 출력
 *            toString : 1번사각형 : 가로(10), 세로(20), 생성된 사각형 갯수(1)       
 */
class Rectangle2 {
	int width, height, sno;
	static int cnt;
	public String toString() {
		return sno + "번 사각형 : " + "가로(" + width + "), 세로(" + height + "), 생성된 사각형 갯수(" + cnt + ")";
	}
	void area() {
		System.out.println("넓이 : " + width * height);
	}
	void length() {
		System.out.println("둘레 : " + (width + height) * 2);
	}
}
public class Exam2 {

	public static void main(String[] args) {
		Rectangle2 r1 = new Rectangle2();
		r1.width = 10; r1.height = 20;
		r1.sno = ++Rectangle2.cnt;
		r1.area(); r1.length();
		System.out.println(r1.toString());
		System.out.println();
		
		Rectangle2 r2 = new Rectangle2();
		r2.width = 20; r2.height = 30;
		r2.sno = ++Rectangle2.cnt;
		r2.area(); r2.length();
		System.out.println(r2.toString());
		System.out.println();
		
		Rectangle2 r3 = new Rectangle2();
		r3.width = 50; r3.height = 60;
		r3.sno = ++Rectangle2.cnt;
		r3.area(); r3.length();
		System.out.println(r3.toString());
		System.out.println();
	}

}
