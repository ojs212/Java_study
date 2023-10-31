package chap5;
import java.util.Scanner;
/*
 * int값을 5개 저장할 수 있는 배열을 생성하고,
 * 화면에서 정수값 5개를 입력받아 입력받은 수의 합계, 평균, 
 * 최대값, 최소값, 최대값의 인덱스, 최소값의 인덱스 출력하기
 */
public class Exam1 {

	public static void main(String[] args) {
		int arr[] = new int[5];
		int sum = 0;
		int max = 0;
		int min = 0;
		System.out.println("정수 5개 입력");
		Scanner sc = new Scanner(System.in);
		for(int i=0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
			sum += arr[i];
			if(arr[max] < arr[i]) {
				max = i;
			}
			if(arr[min] > arr[i]) {
				min = i;
			}
		}
		double avg = (double)sum / arr.length;
		System.out.println("합계 : " + sum);
		System.out.println("평균 : " + avg);
		System.out.println("최대값 : " + arr[max]);
		System.out.println("최소값 : " + arr[min]);
		System.out.println("최대값의 인덱스 : [" + max + "]");
		System.out.println("최소값의 인덱스 : [" + min + "]");
		sc.close();
		
	}

}
