package chap5;
// arr 배열의 행의 합과 열의 합을 출력하기
public class Exam5 {

	public static void main(String[] args) {
		int[][] arr = {{1,2},{1,2,3,4,5},{10,20},{100}};
		int maxcol = 0; // 최대 열의 갯수
		for(int i=0; i<arr.length; i++) {
			if(maxcol < arr[i].length) {
				maxcol = arr[i].length;
			}
		}
		int[] cols = new int[maxcol];
		for(int i=0; i<arr.length; i++) {
			int sum = 0;
			for(int j=0; j<arr[i].length; j++) {
				sum += arr[i][j];
				cols[j] += arr[i][j];
			}
			System.out.println(i + "행의 합 : " + sum);
		}
		for(int i=0; i<cols.length; i++) {
		System.out.println(i + "열의 합 : " + cols[i]);
		}
	}

}
