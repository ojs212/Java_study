package chap8;
/*
 * 매개변수, 리턴값이 모두 있는 경우
 * (x,y)->{...}
 * 문장에 return 문장만 있는 경우 {}, return 생략 가능
 */
interface LambdaInterface3 {
	int method(int x, int y);
}
public class LambdaEx3 {

	public static void main(String[] args) {
		LambdaInterface3 fi = (x,y)-> {
			return x * y;
		};
		System.out.println("두수의 곱:" + fi.method(2, 5));
		fi = (x,y)-> x*y;
		System.out.println("두수의 곱:" + fi.method(2, 5));
		fi = (x,y)-> x+y;
		System.out.println("두수의 합:" + fi.method(2, 5));
		fi = (x,y)-> {
			if(x > y) {
				return x;
			} else {
				return y;
			}
		};
		System.out.println("두수 중 큰값:" + fi.method(2, 5));
		fi = (x,y)-> {
			if(x < y) {
				return x;
			} else {
				return y;
			}
		};
		System.out.println("두수 중 작은값:" + fi.method(2, 5));
	}

}
