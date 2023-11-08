package chap11;
/*
 * String 클래스의 주요 메서드
 */
public class StringEx2 {

	public static void main(String[] args) {
		String s = new String("ABCDEFGH");
		// charAt(4) : 5번째 문자 리턴 / 4번 인덱스 문자(char) 리턴
		System.out.println("s.cahrAt(4):" + s.charAt(4)); // E
		/*
		 * compareTo("abc") : 결과가 양수 - s 문자열이 "abc" 문자열보다 뒤쪽
		 *                    결과가 음수 - s 문자열이 "abc" 문자열보다 앞쪽
		 * -> 정렬에서 사용되는 메서드
		 */
		System.out.println("s.compareTo('abc'):" + s.compareTo("abc")); // -32
		System.out.println("s.compareTo('AAA'):" + s.compareTo("AAA")); // 1
		// s.compareToIgnoreCase('abc') : 대소문자 상관없이
		System.out.println("s.compareToIgnoreCase('abc'):" + s.compareToIgnoreCase("abc")); // 5
		// s.endWith('GH') : s 문자열이 GH로 끝나는지 여부
		System.out.println("s.endsWith('GH'):" + s.endsWith("GH")); // true
		// s.startWith('AB') : s 문자열이 AB로 시작하는지 여부
		System.out.println("s.startsWith('AB'):" + s.startsWith("AB")); // true
		// s.equals('ABCDEFGH') : 내용 비교
		System.out.println("s.equals('ABCDEFGH'):" + s.equals("ABCDEFGH")); // true
		// s.equalsIgnoreCase('abcdefgh') : 대소문자 상관없이 내용 비교
		System.out.println("s.equalsIgnoreCase('abcdefgh'):" + s.equalsIgnoreCase("abcdefgh")); // true
		s = "This is a String";
		// s.문자열에서 i 문자의 인덱스 리턴
		System.out.println("s.indexOf('i'):" + s.indexOf('i')); // 2
		// s.문자열에서 3번 인덱스부터 'i' 문자의 인덱스 리턴
		System.out.println("s.indexOf('i',3):" + s.indexOf('i',3)); // 5
		// s.문자열에서 Q 문자의 인덱스 리턴 / 없는 문자인 경우 -1 리턴
		System.out.println("s.indexOf('Q'):" + s.indexOf('Q')); // -1
		// s.문자열에서 뒤부터 시작해서 i 문자의 앞쪽부터 시작되는 인덱스 리턴
		System.out.println("s.lastIndexOf('i'):" + s.lastIndexOf('i')); // 13
		// 문자열의 길이 출력
		System.out.println("s.length():" + s.length()); // 16
		// replace : 문자열의 치환
		System.out.println("s.replace('is','QR'):" + s.replace("is", "QR"));
		// substring : 부분문자열
		// s.substring(5) : 5번 인덱스부터 끝까지 문자열 출력
		System.out.println("s.substring(5):" + s.substring(5));
		// s.substring(5) : 5번 인덱스부터 12번 인덱스 까지 (13번 인덱스 미포함)
		System.out.println("s.substring(5,13):" + s.substring(5,13));
		// 대소문자변경 : toUpperCase(), toLowerCase()
		System.out.println("s.toUpperCase():" + s.toUpperCase());
		System.out.println("s.toLowerCase():" + s.toLowerCase());
		// trim() : 양쪽 공백 제거 / 문자 사이의 공백은 제거 안됨
		s = "       문자열     trim 메서드       ";
		System.out.println("s:" + s + "===");
		System.out.println("s.trim():" + s.trim() + "===");
		// split : 문자열 분리하여 배열로 리턴
		s = "홍길동,이몽룡,김삿갓";
		String [] arr = s.split(",");
		for(String a : arr) {
			System.out.println(a);
		}
	}

}
