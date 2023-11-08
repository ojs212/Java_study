package chap11;

public class StringBufferEx2 {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer(); // 빈공간의 버퍼(저장공간)
		// sb.append("abc") : sb 객체에 abc 문자열 추가
		sb.append("abc").append(123).append('A').append(false);
		System.out.println(sb);
		sb.delete(2, 4); // 2번 인덱스부터 3번인덱스(2<=n<4)까지 문자를 제거
		System.out.println(sb);
		sb.deleteCharAt(4); // 4번 인덱스의 문자 제거
		System.out.println(sb);
		sb.insert(5, "=="); // 5번 인덱스 앞에 == 문자열 추가
		System.out.println(sb);
		sb.insert(6, 1.23); // 6번 인덱스 앞에 1.23 문자열 추가
		System.out.println(sb);
		sb = new StringBuffer("ABCDEFG"); // ABCDEFG 문자열로 초기화
		sb.replace(0, 3, "abc"); // 0번 인덱스부터 2번 인덱스까지 abc 문자열로 치환
		System.out.println(sb);
		sb.reverse(); // 문자열을 거꾸로 뒤집음
		System.out.println(sb);
	}

}
