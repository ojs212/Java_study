package chap8;
/*
 * 람다식(함수객체) 예제 : jdk8 이후부터 사용가능함
 * 					 람다식으로 사용할 수 있는 인터페이스는 FunctionalInterface 여야함
 * 
 * FunctionalInterface : 추상메서드가 한개만 존재하는 인터페이스
 * 
 * 추상메서드의 매개변수가 없고, 리턴타입도 없는 경우
 * ()-> {...}
 * 람다식 내부에 실행되는 문장이 한개인 경우 {} 생략 가능
 */
@FunctionalInterface // 어노테이션 검증
interface LambdaInterface1 { // 람다식에서 사용하기 위해서는 FunctionalInterface 여야함
	void method();
}
public class LambdaEx1 {

	public static void main(String[] args) {
		// 익명객체 방식
		LambdaInterface1 fi = new LambdaInterface1() {
			@Override
			public void method() {
				System.out.println("익명 객체 방식으로 코딩");
			}
		};
		fi.method();
		// 람다 방식 코딩 1
		fi = ()-> {
			System.out.println("1.람다 방식으로 코딩");
		};
		fi.method();
		// 람다 방식 코딩 2
		fi = ()-> System.out.println("2.람다 방식으로 코딩");
		fi.method();
		// 람다 방식 코딩 3 : 1~100까지의 합 출력하기
		fi = ()-> {
			int sum = 0;
			for(int i=1; i<=100; i++) {
				sum += i;
			}
			System.out.println("3. 1~100까지의 합:" + sum);
		};
		fi.method();
	}

}
