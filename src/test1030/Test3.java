package test1030;
import java.util.Scanner;
/*
배열의 크기를 홀수로 입력하세요
5
17	16	15	14	13	
 	12	11	10	 	
 	 	9	 	 	
 	8	7	6	 	
5	4	3	2	1	
 */
public class Test3 {

	public static void main(String[] args) {
		System.out.println("배열의 크기를 홀수로 입력하세요");
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		sc.close();
		int[][] matrix = new int[h][h];
		int data = 0;
		for(int i=1; i<=h; i++) {
			data += i;
		}
		data += h/2;
		for(int i=0; i<=matrix.length; i++) {
			for(int j=i; j<matrix.length-i; j++) {
				matrix[i][j] = data--;
			}
		}
		for(int i=matrix.length/2+1; i<matrix.length; i++) {
			for(int j=matrix.length-i-1; j<=i; j++) {
				matrix[i][j] = data--;
			}
		}
		for(int[] a : matrix) {
			for(int b : a) {
				if(b == 0) {
					System.out.printf("%4c",' ');
				} else {
					System.out.printf("%4d",b);
				}
			}
			System.out.println();
		}
	}

}