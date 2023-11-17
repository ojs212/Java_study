package chap15;

import java.util.function.IntBinaryOperator;
import java.util.function.IntPredicate;

/*
 * IntBinaryOperator 인터페이스와 IntPredicate 인터페이스를 이용한 예제
 */
public class LambdaEApiEx6 {
	private static int[] arr = new int[10];
	
	public static void main(String[] args) {
		for(int i=0; i<arr.length; i++) {
			arr[i] = (int)(Math.random() * 100 + 1);
			System.out.print(arr[i] + ",");
		}
		System.out.println();
		System.out.println("홀수 최대값:" + maxOrMin((a,b) -> (a >= b) ? a : b, a -> a % 2 != 0));
		System.out.println("짝수 최대값:" + maxOrMin((a,b) -> (a >= b) ? a : b, a -> a % 2 == 0));
		System.out.println("홀수 최소값:" + maxOrMin((a,b) -> (a <= b) ? a : b, a -> a % 2 != 0));
		System.out.println("짝수 최소값:" + maxOrMin((a,b) -> (a <= b) ? a : b, a -> a % 2 == 0));
		System.out.println("최대값:" + maxOrMin((a,b) -> (a >= b) ? a : b, a -> true));
		System.out.println("최소값:" + maxOrMin((a,b) -> (a <= b) ? a : b, a -> true));
	}
	private static int maxOrMin(IntBinaryOperator op, IntPredicate p) {
		int result = 0;
		for(int a : arr) {
			if(p.test(a)) {
				if(result == 0) {
					result = a;
				} else {
					result = op.applyAsInt(result, a);
				}
			}
		}
		return result;
	}
}
