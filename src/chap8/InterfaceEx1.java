package chap8;
/*
 * 인터페이스
 * 1. 인터페이스 멤버 : 상수, 추상메서드, default 메서드, static 메서드만 가능
 * 2. 인터페이스접근제어자 : public만 가능
 * 3. 객체화불가 -> 구현클래스(인터페이스를 구현)의 객체화로 객체화
 * 4. 클래스와 인터페이스는 구현으로 표현 -> implements 예약어 사용
 *    -> 다중 구현 가능
 * 5. 인터페이스간의 상속 가능 -> 다중 상속 가능
 * 
 * 인터페이스 멤버
 *  상수 : [public static final] int NUM=100; (o)
 *       [public static] final int NUM=100; (o)
 *       protected int NUM=100;             (x)
 * 추상메서드 : [public abstract] void method(); (o)
 *          [public] abstract void method(); (o)
 * default 메서드 : 구현부가 있는 메서드 / 인스턴스멤버 jdk8 이후에서 가능
 * static 메서드 : 구현부가 있는메서드 / 클래스멤버 jdk8 이후에서 가능
 * 
 * 참조자료형 : 배열, 클래스, 인터페이스
 */
interface Printerable {
	int INK = 100; // 상수 (public static final 생략)
	void print(); // 추상메서드 (public abstract 생략)
}
interface Scannerable {
	void scan();
}
interface Faxable {
	String FAX_NO = "02-1111-2222";
	void send(String no);
	void receive(String no);
}
// 인터페이스간의 상속 : 다중상속 가능
interface Complexerable extends Printerable, Scannerable, Faxable {}
// 클래스간의 상속 : 단일상속
// 클래스와 인터페이스간의 구현 : 다중 구현 가능
class Complexer extends Object implements Complexerable {
// 구현클래스
// class Complexer extends Object implements Printerable, Scannerable, Faxable {
	int ink; // 변수
	Complexer() {
		ink = INK;
	}
	@Override
	public void print() { // 접근제어자는 같거나 넓은 범위만 가능
		System.out.println("프린트 출력합니다. 남은 잉크량: " + --ink);
	}
	@Override
	public void scan() {
		System.out.println("이미지를 스캔합니다.");
	}
	@Override
	public void send(String no) {
		System.out.println(FAX_NO + " 에서 " + no + "로 FAX를 전송합니다.");
	}
	@Override
	public void receive(String no) {
		System.out.println(no + " 에서 " + FAX_NO + "로 FAX를 받았습니다.");
	}
}
public class InterfaceEx1 {

	public static void main(String[] args) {
//		Printerable.INK = 1000; 
		System.out.println(Printerable.INK);
		Complexer com = new Complexer();
		System.out.println("기본잉크량 : " + Complexer.INK);
		System.out.println("기본잉크량 : " + Complexerable.INK);
		System.out.println("기본잉크량 : " + Printerable.INK);
		System.out.println("팩스번호 : " + Complexer.FAX_NO);
		System.out.println("팩스번호 : " + Complexerable.FAX_NO);
		System.out.println("팩스번호 : " + Faxable.FAX_NO);
		com.print();
		com.scan();
		com.receive("02-2222-3333");
		com.send("02-3333-4444");
		System.out.println("남은 잉크 : " + com.ink);
		if(com instanceof Complexerable) {
			System.out.println("c 객체는 Complexerable 객체임");
			Complexerable c = com;
			c.print();
			c.scan();
			c.receive("02-2222-3333");
			c.send("02-2222-3333");
//			System.out.println("남은잉크:" +c.ink);
		}
		if(com instanceof Printerable) {
			System.out.println("p 객체는 Printerable 객체임");
			Printerable p = com;
			p.print();
//			p.scan();
//			p.receive("02-2222-3333");
//			p.send("02-2222-3333");
//			System.out.println("남은잉크:" +p.ink);
		}
		if(com instanceof Scannerable) {
			System.out.println("s 객체는 Scannerable 객체임");
			Scannerable s = com;
//			s.print();
			s.scan();
//			s.receive("02-2222-3333");
//			s.send("02-2222-3333");
//			System.out.println("남은잉크:" +s.ink);
		}
		if(com instanceof Faxable) {
			System.out.println("f 객체는 Faxable 객체임");
			Faxable f = com;
//			f.print();
//			f.scan();
			f.receive("02-2222-3333");
			f.send("02-2222-3333");
//			System.out.println("남은잉크:" +f.ink);
		}
	}

}
