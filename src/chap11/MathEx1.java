package chap11;
/*
 * Math 클래스 : 수치계산관련 메서드, 상수(원주율(PI), 자연로그(E))를 멤버로 가진다
 *             final 클래스
 *             객체생성 못함 : 생성자의 접근제어자가 private
 *             -> 모든 멤버가 static임
 */
public class MathEx1 {

	public static void main(String[] args) {
		//abs() : 절대값
		System.out.println("math.abs(5):" + Math.abs(5));
		System.out.println("math.abs(-5):" + Math.abs(-5));
		System.out.println("math.abs(3.14):" + Math.abs(3.14));
		System.out.println("math.abs(-3.14):" + Math.abs(-3.14));
		// ceil(), floor(), rint() : 근사정수(가까운 정수)
		// ceil() : 현재숫자보다 큰 근사정수
		System.out.println("Math.ceil(5.4):" + Math.ceil(5.4));
		System.out.println("Math.ceil(-5.4):" + Math.ceil(-5.4));
		// floor() : 현재숫자보다 작은 근사정수
		System.out.println("Math.floor(5.4):" + Math.floor(5.4));
		System.out.println("Math.floor(-5.4):" + Math.floor(-5.4));
		// rint() : 가장 가까운 근사정수
		System.out.println("Math.rint(5.4):" + Math.rint(5.4));
		System.out.println("Math.rint(-5.4):" + Math.rint(-5.4));
		
		// max(),min() : 최대, 최소값
		System.out.println("Math.max(5,4):" + Math.max(5, 4));
		System.out.println("Math.max(5.3,5.4):" + Math.max(5.3, 5.4));
		System.out.println("Math.min(5,4):" + Math.min(5, 4));
		System.out.println("Math.min(5.3,5.4):" + Math.min(5.3, 5.4));
		
		// round() : 반올림
		System.out.println("Math.round(5.4):" + Math.round(5.4));
		System.out.println("Math.round(5.5):" + Math.round(5.5));
		
		// random() : 난수(임의의 수) 0 <= x < 1.0
		System.out.println("Math.random():" + Math.random());
		
		// sin(), cos(), tan() : 삼각함수 / 라디안 단위
		// Math.PI/2라디안 : 90도
		System.out.println("Math.sin(Math.PI/2):" + Math.sin(Math.PI/2));
		System.out.println("Math.cos(Math.PI/2):" + Math.cos(Math.PI/2));
		System.out.println("Math.tan(Math.PI/4):" + Math.tan(Math.PI/4));
		// cos 60도
		// toRadians(60) : 60도를 라디안단위로 리턴 라디안 <- 도
		System.out.println("Math.cos(Math.toRadians(60)):" + Math.cos(Math.toRadians(60)));
		// 도 <- 라디안
		System.out.println("Math.toDegress(Math.PI):" + Math.toDegrees(Math.PI));
		// log 함수
		System.out.println("Math.log(Math.E):" + Math.log(Math.E));
		// sqrt() : 제곱근
		System.out.println("Math.sqrt(25):" + Math.sqrt(25));
		// pow() : 제곱
		System.out.println("Math.pow(5,3):" + Math.pow(5, 3));
	}

}
