package chap9;
/*
 * 외부클래스의 private 멤버를 중첩 클래스에서 접근
 */
class Outer2 {
	private int outeriv = 10;
	private static int outercv = 20;
	class InstanceInner {
		int iiv = outeriv;
		int iiv2 = outercv;
	}
	static class StaticInner {
//		int siv = outeriv;
		int siv = new Outer2().outeriv;
		static int scv = outercv;
		int siv2 = outercv;
	}
	// LocalInner.method() 호출하기
	void method(int pv) {
		int max = 1000;
//		max++;
		class LocalInner {
			int liv = outeriv;
			int liv2 = outercv;
/*
 * 지역중첩클래스의 멤버메서드에서 외부메서드의 지역변수는 상수화 되어야 한다
 * 지역변수(pv)의 변경이 없는경우는 상수로 판단함
 * 지역변수 변경이 되는 경우는 오류 발생
 */
			void method(int num) { // LocalInner의 멤버 메서드
				System.out.println("outeriv=" + outeriv);
				System.out.println("outercv=" + outercv);
				System.out.println("liv=" + liv);
				System.out.println("liv2=" + liv2);
				num = liv + liv2;
				System.out.println("num=" + num);
//				pv = outeriv + outercv;
				System.out.println("pv=" + pv);
				System.out.println("max=" + max);
			}
		}
		LocalInner li = new LocalInner();
		li.method(3);
	}
}
public class InnerEx2 {

	public static void main(String[] args) {
		Outer2 out = new Outer2();
		out.method(30);
		//InnerEx2 클래스에서 Outer2의 Private 멤버 접근 불가
//		System.out.println(out.outeriv); 
//		System.out.println(out.outercv);
		// InstanceInner, StaticInner의 멤버변수를 화면 출력하기
		Outer2.InstanceInner oi = new Outer2().new InstanceInner();
		System.out.println("iiv=" + oi.iiv);
		System.out.println("iiv2=" + oi.iiv2);
		Outer2.StaticInner os = new Outer2.StaticInner();
		System.out.println("siv=" + os.siv);
		System.out.println("siv2=" + os.siv2);
		System.out.println("scv=" + Outer2.StaticInner.scv);
	}

}
