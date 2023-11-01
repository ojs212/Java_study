package chap4;
/*
 * 1~10까지의 합을 출력하기
 */
public class LoopEx2 {
	public static void main(String[] args) {
		//for 구문으로 구하기
		int sum = 0;
		for(int i=1; i<=10; i++) {
			sum += i;
		}
		System.out.println("합계 : " + sum);
		
		//while 구문으로 구하기
		sum = 0;
		int i = 1;
		while(i <= 10) {
			sum += i;
			i++;
		}
		System.out.println("합계 : " + sum);
		
		//do while 구문으로 구하기
		sum = 0;
		i = 1;
		do {
			sum += i;
			i++;
		} while (i <= 10);
		System.out.println("합계 : " + sum);
	}

}
