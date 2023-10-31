package chap5;
/*
 * command 라인에서 숫자를 입력받아 숫자의 자리수 합을 출력하기
 * java exam4 1234
 * 
 * 1+2+3+4 = 10
 */
public class Exam4 {

	public static void main(String[] args) {
		if(args.length == 0) {
			System.out.println("command 라인에 숫자를 입력하세요");
		}
		char[] num = args[0].toCharArray();
		int sum = 0;
		for(int i=0; i<num.length; i++) {
			num[i] -='0';
			sum += num[i];
//			sum += num[i] - '0';
		}
		for(int i=0; i<num.length; i++) {
			num[i] +='0';
			if(i == num.length-1) {
				System.out.print(num[i] + " = " + sum);	
			} else {
			System.out.print(num[i] + "+");
			}
		}
		
	}

}
