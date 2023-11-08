package chap11;
/*
 * delChar 메서드 구현하기
 * StringBuffer delChar(원본문자열, 삭제문자열)
 *  -> 원본문자열에서 삭제문자열을 제외한 문자열 리턴
 */
public class Exam4 {

	public static void main(String[] args) {
		System.out.println(delChar("(1!2@3^4~5)","~!@#$%^&*()")); // 12345
		System.out.println(delChar("(1!2@3^4~5)","12345")); // (!@^~)
	}
	static StringBuffer delChar(String a, String b) {
		StringBuffer sb = new StringBuffer();
		for(int i=0; i<a.length(); i++) {
//			if(b.indexOf(a.charAt(i)) < 0) {
//				sb.append(a.charAt(i));
//			}
			// a.contains(b) -> b문자열이 a문자열에 포함되는지 비교
			if(!b.contains(a.charAt(i)+"")) {
				sb.append(a.charAt(i));
			}
		}
		return sb;
	}

}
