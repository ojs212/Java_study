package test1108;
/*
 * 다음 결과가 나오도록 프로그램 수정하기
 * [결과]
 * basket
 * basketball
 */
public class Test2 {
	public static void main(String[] args) {
		String str = "base"; 
		System.out.println(str = str.replace('e','k')+"et");
		str += "ball"; 
		System.out.println(str);
	}
}