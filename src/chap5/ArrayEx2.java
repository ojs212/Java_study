package chap5;
/*
 * 배열의 선언, 생성, 초기화하기
 */
public class ArrayEx2 {

	public static void main(String[] args) {
		int arr[] = {10, 20, 30, 40, 50};
		for(int i=0; i<arr.length; i++) {
			System.out.println("arr[" + i + "] = " +arr[i]);
		}
		// 생성, 초기화
		arr = new int[]{100, 200, 300};
		for(int i=0; i<arr.length; i++) {
			System.out.println("arr[" + i + "] = " +arr[i]);
		}
	}

}
