package chap5;
/*
 * 문자열 내에 각 소문자의 갯수 출력하기
 * 1. 소문자만 갯수 구하기
 * 2. 갯수가 2 이상인 데이터만 출력
 * 3. 갯수만큼 * 출력하기
 */
public class Exam3 {

	public static void main(String[] args) {
		String str="aabbcccnmelviwq 다거벨벚데   denopqqqqrrrrsssxzuvvv";
		char arr[] = str.toCharArray();
		int cnt[] = new int[26];
		for(int i=0; i<arr.length; i++) {
			if(arr[i] >= 'a' && arr[i] <= 'z') { // 1
				cnt[arr[i]-'a']++;
			}
		}
		for(int i=0; i<cnt.length; i++) {
			if(cnt[i] > 0) // 2
			System.out.println((char)(i + 'a') + ":" + cnt[i] + "개 ");
		}
		
		//3
		char arr1[] = str.toCharArray();
		int cnt1[] = new int[26];
		for(int i=0; i<arr1.length; i++) {
			if(arr1[i] >= 'a' && arr1[i] <= 'z') { // 1
				cnt1[arr1[i]-'a']++;
			}
		}
		for(int i=0; i<cnt1.length; i++) {
			if(cnt1[i] > 0) // 2
			System.out.print((char)(i + 'a') + ":" + cnt1[i] + "개=>");
			for(int j=0; j<cnt1[i]; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
