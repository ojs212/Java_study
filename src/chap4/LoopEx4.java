package chap4;
/*
 * break 	: switch, 반복문에서 구문을 벗어남
 * continue : 반복문의 처음으로 이동
 */
public class LoopEx4 {

	public static void main(String[] args) {
		for(int i=2; i<=9; i++) {
			System.out.println("\n" + i + "단");
			for(int j=2; j<=9; j++) {
//				if (j == 5) break; // break가 속한 반복문을 벗어남
				if (j == 5) continue; // continue가 속한 반복문의 처음으로 이동 (이후 문장 실행 X)
				System.out.println(i + " * " + j + " = " + (i * j));
			}
		}
	}

}
