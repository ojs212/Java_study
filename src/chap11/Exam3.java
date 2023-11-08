package chap11;
/*
 * 문자열 1,20,30,40,50 의 숫자 합을 출력하기
 */
public class Exam3 {

	public static void main(String[] args) {
		String s = "1,20,30,40,50";
		String[] arr = s.split(",");
		int sum = 0;
		for(int i=0; i<arr.length; i++) {
			sum += Integer.parseInt(arr[i]);
		}
		System.out.printf("%s의 합 : %d\n",s, sum) ;
	}

}
