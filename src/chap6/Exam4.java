package chap6;
/*
 * Rectangle3.java 소스의 Rectangle3 클래스 이용하여 구동클래스 구현하기
 * 가로, 세로길이가 20~50사이인 임의의 길이를 가진 사각형 5개를 생성하기
 * 생성된 5개 사각형의 정보 출력
 * 5개 사각형의 넓이의 합과, 둘레의 합을 출력하기
 */
public class Exam4 {

	public static void main(String[] args) {
		Rectangle3[] arr = new Rectangle3[33];
		int sum1 = 0;
		int sum2 = 0;
		for(int i=0; i<arr.length; i++) {
			arr[i] = new Rectangle3();
		}
		for(int i=0; i<arr.length; i++) {
			arr[i].width = (int)(Math.random() * 31 + 20);
			arr[i].height = (int)(Math.random() * 31 + 20);
			arr[i].sno = ++Rectangle3.cnt;
			sum1 += arr[i].length();
			sum2 += arr[i].area();
			System.out.println(arr[i].toString());
		}
		System.out.println();
		System.out.println("전체 사각형 둘레의 합 : " + sum1);
		System.out.println("전체 사각형 넓이의 합 : " + sum2);
	}

}
