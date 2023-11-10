package chap13;
import java.util.*;
import java.util.Scanner;

/*
 * 화면에서 홀수개의 숫자를 입력받아 입력받은 숫자의 평균과 중간값 출력하기
 * [결과]
 * 홀수개의 숫자를 입력하세요 (종료:999) -> 짝수개를 입력 할 경우 마지막 숫자 제거
 * 10 40 20 60 30
 * 평균 : 전체합 / 갯수
 * 중간값 : 30 -> 데이터를 정렬하여 가운데 값
 */
public class Exam1 {

	public static void main(String[] args) {
		System.out.println("홀수개의 숫자를 입력하세요");
		Scanner sc = new Scanner(System.in);
		List<Integer> list = new ArrayList<>();
		int sum = 0;
		while(true) {
			int n = sc.nextInt();
			if(n == 999) {
				break;
			}
			list.add(n);
		}
		for(Integer a : list) {
			sum += a;
		}
		if(list.size() % 2 == 0) {
			list.remove(list.size()-1);
		}
		Collections.sort(list);
		System.out.println("평균 : " + (double)sum / list.size());
		System.out.println("중간값 : " + list.get(list.size()/2));
		sc.close();
	}

}
