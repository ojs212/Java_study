package chap5;

import java.util.Scanner;

/*
 * 2차원 배열의 값을 입력받아 다음과 같은 내용을 출력하기
 * 배열의 갯수를 입력하세요
 * 5
 * 1
 * 2  3
 * 4  5  6
 * 7  8  9  10
 * 11 12 13 14 15
 */
public class Exam10 {

	public static void main(String[] args) {
		System.out.println("배열의 길이를 입력하세요");
		Scanner sc = new Scanner(System.in);
		int l = sc.nextInt();
		int[][] arr = new int[l][l];
		int data = 1;

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if (i >= j) {
					arr[i][j] = data;
					System.out.print(data++ + "\t");
				} else {
					System.out.print("\t");
				}
			}
			System.out.println();
		}
		System.out.println();

		// 가변배열 이용
		int[][] arr1 = new int[l][];
		data = 0;

		for (int i = 0; i < l; i++) {
			arr1[i] = new int[i + 1];
		}
		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr1[i].length; j++) {
				arr1[i][j] = ++data;
				System.out.printf("%5d", arr1[i][j]);
			}
			System.out.println();
		}
		System.out.println();
		// arr 배열 출력하기
		for (int[] ar : arr1) {
			for (int a : ar) {
				System.out.printf("%5d", a);
			}
			System.out.println();
		}
		sc.close();
	}

}
