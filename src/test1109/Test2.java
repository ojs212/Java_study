package test1109;
import java.util.Random;
/*
 * int getRand(f,t) : 함수 구현하기
 *   f ~ t 또는 t~ f 까지  범위에 숫자를 임의의 수로 리턴하는 함수
 *   f, t 값은 포함됨. 
 
[결과]
-2,1,0,-3,-2,1,-1,0,-2,0,0,1,0,-3,0,-1,-1,-2,-2,1,
3,3,0,0,-1,-1,0,3,2,3,0,-1,1,1,-1,3,0,0,1,-1,    
 */
public class Test2 {
	public static void main(String[] args) {
		for(int i=0;i<20;i++) {
			System.out.print(getRand(1,-3)+",");
		}
		System.out.println();
		for(int i=0;i<20;i++) {
			System.out.print(getRand(-1,3)+",");
		}
	}
	static int getRand(int a, int b) {
		Random r = new Random();
		int sum = Math.abs(a) + Math.abs(b) + 1;
		int c = Integer.max(a, b);
		int[] arr = new int[sum];
		for(int i=0; i<arr.length; i++) {
			arr[i] = c--;
		}
		int result = r.nextInt(arr[arr.length-1], arr[0]+1);
		return result;
	}
	static int getRand1(int a, int b) {
		Random r = new Random();
		int c = Integer.max(a, b);
		int d = Integer.min(a, b);
		return r.nextInt(d, c+1);
	}
}