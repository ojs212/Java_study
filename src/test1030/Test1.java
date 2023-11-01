package test1030;

/*
 * int[][] score = {
				{90,80,70},
				{95,85,75},
				{70,80,75},
				{75,70,85},
				{70,75,80}
		}; 
 * score 배열보다 가로 세로가 1씩 더큰 배열 result 배열 생성하기.
 * score 배열의 내용을 result에 저장하고,
 * 각 추가된 행과 열에는 각 행과 열의 합을 저장하고, result 배열의 내용 출력하기
 */
public class Test1 {
	public static void main(String[] args) {
		int[][] score = { { 90, 80, 70 }, { 95, 85, 75 }, { 70, 80, 75 }, { 75, 70, 85 }, { 70, 75, 80 } };
		int[][] result = new int[6][4];
		for (int i = 0; i < score.length; i++) {
			for (int j = 0; j < score[i].length; j++) {
				result[i][j] = score[i][j];
			}
		}
		for (int i = 0; i < result[i].length - 1; i++) {
			for (int j = 0; j < result.length - 1; j++) {
				result[j][3] += result[j][i];
			}
		}
		for (int i = 0; i < result.length - 1; i++) {
			for (int j = 0; j < result[i].length; j++) {
				result[5][j] += result[i][j];
			}
		}
		for (int[] a : result) {
			for (int b : a) {
				System.out.print(b + "\t");
			}
			System.out.println();
		}
	}
}