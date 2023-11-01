package chap5;
import java.util.Scanner;
/*
 * 2차원 배열을 이용
 */
public class Exam7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("삼각형의 높이를 입력하세요");
		int h = sc.nextInt();
		int num = 0;
		int[][] arr = new int[h][h];
		for(int i=1; i<=h; i++) {
			num += i;
		}
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				if(i <= j) {
					arr[i][j] = num;
					num--;
				}
			}
		}
		for(int i=0; i<h; i++) {
			for(int j=0; j<h; j++) {
				if(i <= j) {
					System.out.print(arr[i][j] + "\t");
				} else {
					System.out.print("\t");
				}
			}
			System.out.println();
		}
		for(int[] a : arr) {
			for(int b : a) {
				if(b == 0) {
					System.out.printf("%3c",' ');
				} else {
					System.out.printf("%3d", b);
				}
			}
			System.out.println();
		}
		sc.close();
	}

}
