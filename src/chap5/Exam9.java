package chap5;
import java.util.Scanner;

public class Exam9 {

	public static void main(String[] args) {
		System.out.println("사각형의 높이를 홀수로 입력하세요");
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		char[][] arr = new char[h][h];
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr.length; j++) {
				if(i == j) {
					arr[i][j] = 'X';
				} else if(i + j == arr.length-1) {
					arr[i][j] = 'X';
				} else {
					arr[i][j] = ' ';
				}
				System.out.print(arr[i][j]);
			}
			System.out.println();
		}
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr.length; j++) {
				if(i == j) {
					arr[i][j] = 'X';
				} else if(h - j == 1) {
					arr[i][j] = 'X';
					h--;
				} else {
					arr[i][j] = ' ';
				}
				System.out.print(arr[i][j]);
			}
			System.out.println();
		}
		sc.close();
	}

}
