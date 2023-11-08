package chap11;
/*
 * String.format 메서드 : 형식화된 문자열 리턴 / 서식문자 사용 / 클래스 메서드 -> 객체화 필요없음
 * 서식문자 : %d,%s,%f,%c ...
 * 
 * System.out.printf() 메서드와 사용 방식이 동일
 */
public class StringEx4 {

	public static void main(String[] args) {
		// %f : 실수값 출력 서식문자 / 부동소숫점 표시문자
		// %.2f : 소숫점이하 2자리로 표시 소숫점 3번째자리에서 반올림
		String sf = String.format("%.2f", 0.145);
		System.out.println(sf);
		// 10자리를 확보하여 소숫점이하 2자리 출력하기 / 빈자리는 공백
		sf = String.format("%10.2f", 0.145);
		System.out.println(sf);
		// 10자리를 확보하여 소숫점이하 2자리 출력하기 / 빈자리는 0으로 채움
		sf = String.format("%010.2f", 0.145);
		System.out.println(sf);
		// %d : 10진 정수 출력
		sf = String.format("%d", 12345);
		System.out.println(sf);
		// %,d : 10진 정수 출력 / 세자리마다 ,표시
		sf = String.format("%,d", 12345);
		System.out.println(sf);
		// %10d : 10진 정수 출력 / 10자리 확보 / 우측정렬
		sf = String.format("%10d", 12345);
		System.out.println(sf);
		// %-10d : 10진 정수 출력 / 10자리 확보 / 좌측정렬
		sf = String.format("%-10d", 12345);
		System.out.println(sf);
		// %010d : 10진 정수 출력 / 10자리 확보 / 빈자리 0으로 채움
		sf = String.format("%010d", 12345);
		System.out.println(sf);
		// %,10d : 10진 정수 출력 / 10자리 확보 / 우측정렬 / 세자리마다 ,표시
		sf = String.format("%,10d", 12345);
		System.out.println(sf);
		// %-,10d : 10진 정수 출력 / 10자리 확보 / 좌측정렬 / 세자리마다 ,표시
		sf = String.format("%-,10d", 12345);
		System.out.println(sf);
		// %-,3d 최소자리수 3자리 확보 / 좌측정렬 /세자리마다 ,표시 
		sf = String.format("%-,3d", 12345);
		System.out.println(sf);
		// %X : 16진 정수 출력 / A~F 로 표시
		// %x : 16진 정수 출력 / a~f 로 표시
		sf = String.format("%X,%x", 255, 255);
		System.out.println(sf);
		// 16진 정수 출력 / 2자리로 출력하고 빈자리는 0으로 채움
		sf = String.format("%02X,%02x", 10, 10);
		System.out.println(sf);
		// %o : 8진수 출력
		// 10진수 10을 8진수로 출력
		sf = String.format("%o",10);
		System.out.println(sf);
		
		// %s : 문자열 출력
		sf = String.format("%s", "홍길동");
		System.out.println(sf);
		// 10자리 확보하고 우측정렬해서 출력하기
		sf = String.format("%10s", "홍길동");
		System.out.println(sf);
		// 10자리 확보하고 좌측정렬해서 출력하기
		sf = String.format("%-10s", "홍길동");
		System.out.println(sf);
		
		// %c : 문자한개 출력
		sf = String.format("%c%c%c", '홍','길','동');
		System.out.println(sf);
		// 여러개의 자료형을 출력
		sf = String.format("%s의 학점은 %c, 점수는 %d 입니다", "홍길동",'A',95);
		System.out.println(sf);
	}

}
