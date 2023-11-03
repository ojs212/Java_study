package chap7;
import chap7.test.Modifier2;
/*
 * 접근제어자 : private < (default) < protected, < public
 * 
 *   멤버변수, 멤버메서드 : private < (default) < protected, < public 가능
 *   클래스           : (default) < public
 *                    (default) 클래스 : 같은 패키내에서만 접근 허용
 *                    
 */
 class Modifier3 extends Modifier2 {
	public void method() {
		System.out.println("chap7.Modifier3 클래스의 method");
//		System.out.println("v1=" + v1); Modifier2 클래스 내부에서만 접근 허용
//		System.out.println("v2=" + v2); chap7.test 패키지 내부 클래스에서만 접근 허용
		System.out.println("v3=" + v3); // 상속관계 / 정상(Modifier3가 Modifier2의 하위클래스 )
		System.out.println("v4=" + v4);
	}
}
public class ModifierEx2 { // chap7.ModifierEx2

	public static void main(String[] args) {
		Modifier2 m2 = new Modifier2(); // chap7.test.Modifier2
		m2.method(); // public 제어자 이므로 정상
//		System.out.println(m2.v1); // Modifier2 클래스 내에서만 접근 허용
//		System.out.println(m2.v2); // chap7.test 패키지 내부의 클래스 에서만 접근 허용
//		System.out.println(m2.v3); // 상속관계에서만 접근 허용
		System.out.println(m2.v4); // public 제어자이므로 정상
		
		Modifier3 m3 = new Modifier3();
		m3.method();
	}

}
