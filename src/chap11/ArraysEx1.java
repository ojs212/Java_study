package chap11;
import java.util.Arrays;
import java.util.Comparator;
/*
 * Arrays 클래스 : 배열의 복사, 비교, 정렬 기능을 가진 클래스
 */
public class ArraysEx1 {

	public static void main(String[] args) {
		String[] arr1 = {"홍길동","이몽룡","김삿갓"};
		for(String a : arr1) {
			System.out.print(a + ",");
		}
		System.out.println();
		// arr1의 배열의 값을 김길동으로 채우기
		Arrays.fill(arr1, "김길동");
		for(String a : arr1) {
			System.out.print(a + ",");
		}
		System.out.println();
		// arr1의 1, 2번 인덱스 값을 홍길동전으로 채우기
		Arrays.fill(arr1, 1, 3, "홍길동전");
		for(String a : arr1) {
			System.out.print(a + ",");
		}
		System.out.println();
		// arr1 배열 정렬하기
		Arrays.sort(arr1);
		for(String a : arr1) {
			System.out.print(a + ",");
		}
		System.out.println();
		// arr1 배열 내침차순 정렬하기
		Arrays.sort(arr1, Comparator.reverseOrder());
		for(String a : arr1) {
			System.out.print(a + ",");
		}
		System.out.println();
		// arr1 배열 복사하기
		String[] arr2 = Arrays.copyOf(arr1, arr1.length);
		for(String a : arr2) {
			System.out.print(a + ",");
		}
		System.out.println();
		// arr1, arr2 배열을 출력하기
		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr2));
	}

}
