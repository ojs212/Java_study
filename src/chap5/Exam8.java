package chap5;

public class Exam8 {

	public static void main(String[] args) {
		char[][] arr = new char[11][11];
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
		System.out.println();
		System.out.println();
		
		for(char[] s : arr) {
			for(char st : s) {
				System.out.print(st);
			}
			System.out.println();
		}
	}

}
