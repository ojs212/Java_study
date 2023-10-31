package chap4;
/*
 * 1부터의 합이 1000이 넘는 순간의 값을 출력하기
 */
public class Exam12 {

	public static void main(String[] args) {
		
		int sum = 0;
		int num = 0;
		while(true) {
			num++;
			sum += num;
			if (sum > 1000); {
				break;
			}
		}
		System.out.println(sum);
		System.out.println("합이 1000이 넘는 순간의 숫자 : " + num);
	}

}
