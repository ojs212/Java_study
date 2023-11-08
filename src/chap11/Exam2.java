package chap11;
/*
 * cont() 메서드 구현하기
 * count("문자열","찾는문자열") -> 문자열에서 찾는 문자열 갯수 리턴 메서드
 */
public class Exam2 {

	public static void main(String[] args) {
		System.out.println(count("12345AB12AB45AB","12")); // 2
		System.out.println(count1("12345AB12AB45AB","AB")); // 3
		System.out.println(count1("12345","6")); // 0
	}
	static int count(String a, String b) {
		int cnt = 0;
		int index = 0;
		while(true) {
			index = a.indexOf(b,index);
			if(index < 0) {
				break;
			}
				cnt++;
				index++;
		}
		return cnt;
	}
	static int count1(String a, String b) {
		int cnt = 0;
		for(int i=0; i<a.length(); i++) {
			if(a.indexOf(b,i) >= 0) {
				cnt++;
				i = a.indexOf(b,i);
			}
		}
		return cnt;
	}

}
