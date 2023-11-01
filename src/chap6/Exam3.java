package chap6;
/*
 * Exam2.java 소스의 Rectangle2 클래스 이용하여 구동클래스 구현하기
 * 가로, 세로길이가 20~50 사이인 임의의 길이를 가진 사각형 5개를 생성하고
 * 각각의 넓이, 둘레, 정보 출력하기
 */ 
public class Exam3 {

	public static void main(String[] args) {
		Rectangle2[] arr = new Rectangle2[5];
		for(int i=0; i<arr.length; i++) {
			arr[i] = new Rectangle2();
		}
		for(int i=0; i<arr.length; i++) {
			arr[i].width = (int)(Math.random() * 31 + 20);
			arr[i].height = (int)(Math.random() * 31 + 20);
			arr[i].sno = ++Rectangle2.cnt;
			arr[i].area();
			arr[i].length();
			System.out.println(arr[i]);
		}
		for(Rectangle2 r : arr) {
			System.out.println(r);
		}
			
	}

}
