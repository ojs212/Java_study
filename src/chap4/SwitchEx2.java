package chap4;
/*
 * 컴퓨터에서 난수(임의의 수)를 선택하여 상품 출력하기
 */
public class SwitchEx2 {
	public static void main(String[] args) {
		int num = (int)(Math.random() * 10) + 1;
		/*
		 * Math.random()      		 : 0 <= x < 1.0 임의의 실수를 리턴
		 * Math.random() * 10 		 : 0 <= x < 1.0 임의의 실수를 리턴
		 * (int)(Math.random() * 10) : 0 <= x < 10 임의의 정수
		 *                       num : 1 <= x < 11 임의의 정수
		 */
		System.out.print(num + " : ");
		switch(num) {
		case 1 : System.out.println("축하합니다. 자전거 당첨입니다.");
			break;
		case 2 : System.out.println("축하합니다. USB 당첨입니다.");
			break;
		case 3 : System.out.println("축하합니다. 키보드 당첨입니다.");
			break;
		default : 
			System.out.println("다음 기회에...");
		}
	}

}
