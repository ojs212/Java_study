package chap5;
// 2차원 배열의 생성과 초기화
public class ArrayEx9 {

	public static void main(String[] args) {
		int[][] arr = {{10,20},{30,40},{50,60}};
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				System.out.print("arr[" + i + "][" + j + "]=" + arr[i][j] + "\t");
			}
			System.out.println();
		}
		//행과 열의 합계 출력하기
		int[] cols = new int[arr[0].length];
		for(int i=0; i<arr.length; i++) {
			int sum = 0;
			for(int j=0; j<arr[i].length; j++) {
				sum += arr[i][j];
				cols[j] += arr[i][j]; // 0열의 합
			}
			System.out.println(i + "행의 합 : " + sum);
		}
		for(int i=0; i<cols.length; i++) {
			System.out.println(i + "열의 합 : " + cols[i]);
		}
	}

}
