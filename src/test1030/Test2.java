package test1030;

import java.util.Scanner;

/*
 * 2차원 배열을 이용하여 모래시계 출력하기
 * 
 * [결과]
 * 삼각형의 길이를 홀수로 입력하세요
 * 5
  *****
   ***
    *
   ***
  *****  
 */
public class Test2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("삼각형의 길이를 홀수로 입력하세요");
		int h = sc.nextInt();
		char[][] matrix = new char[h][h];
		for(int i=0; i<=matrix.length/2; i++) {
			for(int j=i; j<matrix.length-i; j++) {
				matrix[i][j] = '*';
			}
		}
		for(int i=matrix.length/2+1; i< matrix.length; i++) {
			for(int j=matrix.length-i-1; j<=i; j++) {
				matrix[i][j] = '*';
			}
		}
		for(char[] a : matrix) {
			for(char b : a) {
				System.out.print(b);
			}
			System.out.println();
		}
		
		sc.close();
	}
}