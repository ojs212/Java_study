package test1027;
/*
  1부터 100까지 임의의 수 10개를  배열에 저장하고, 정렬하여 출력하기
    1. 배열 선언, 생성.
    2. 임의의 수를 10개 배열에 저장
    3. 정렬
    4. 출력
 */
public class Test4 {
	public static void main(String[] args) {
		int[] arr = new int[100];
		int[] v = new int[10];
		for(int i=0; i<arr.length; i++) {
			arr[i] = i+1;
		}
		for(int i=0; i<10000; i++) {
			int num1 = (int)(Math.random() * arr.length);
			int num2 = (int)(Math.random() * arr.length);
			int tmp = arr[num1];
			arr[num1] = arr[num2];
			arr[num2] = tmp;
		}
		for(int i=0; i<v.length; i++) {
			v[i] = arr[i];
		}
		for(int a : v) {
			System.out.print(a + " ");
		}
		System.out.println();
		for(int i=0; i<v.length; i++) {
			for(int j=0; j<v.length-1-i; j++)
				if(v[j] > v[j+1]) {
					int tmp = v[j];
					v[j] = v[j+1];
					v[j+1] = tmp; 
				} 
		}
		for(int a : v) {
			System.out.print(a + " ");
		}
		System.out.println();
		//Arrays.sort(v);
	}
}