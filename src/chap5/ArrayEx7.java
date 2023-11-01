package chap5;

public class ArrayEx7 {

	public static void main(String[] args) {
		String[] arr = {"123", "333", "234", "135"};
		//arr 배열의 모든 숫자 자리수의 합을 출력하기
		int sum = 0;
		for(int i=0; i<arr.length; i++) {
			for(int j=0;j<arr[i].length();j++) { // arr[0].length() : String 의 문자열 길이값
				sum += arr[i].charAt(j) - '0';   // arr[0].charAt(j) : j번째 존재하는 char 문자 리턴
			}
		}
		for(int i=0; i<arr.length; i++) {
			
		}
		System.out.println(sum);
	}

}
