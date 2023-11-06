package chap8;
/*
 * 추상메서드에 매개변수가 존재. 리턴타입이 없는경우
 * (매개변수)-> {...}
 * 
 * 매개변수가 한개인경우 () 생략 가능
 * 실행 문장이 한개인 경우 {} 생략 가능
 */
@FunctionalInterface
interface LambdaInterface2 {
	void method(int i);
}
public class LambdaEx2 {

	public static void main(String[] args) {
		LambdaInterface2 fi = (a)-> {
			System.out.println(a * 5);
		};
		fi.method(10);
		fi.method(2);
		fi = a -> System.out.println(a * 5);
		fi.method(10);
		fi.method(2);
		//제곱을 출력하는 람다식 구현하기
		fi = a -> System.out.println(a * a);
		fi.method(10);
		fi.method(2);
		//매개변수까지의 합 출력하는 람다식 구현하기
		fi = a -> {
			int sum = 0;
			for(int i=1; i<=a; i++) {
				sum +=i;
			}
			System.out.println("1~" + a + "까지의 합:" + sum);
		};
		fi.method(100);
		calc(fi,10); // 1~10까지의 합 출력
		calc(a-> {
			int sum = 0;
			for(int i=0; i<=a; i+=2) {
				sum += i;
			}
			System.out.println("1~" + a + "까지의 짝수합" + sum);
		},10); // 1~10까지 짝수의 합 출력
	}
	private static void calc(LambdaInterface2 fi, int a) {
		fi.method(a);
	}

}
