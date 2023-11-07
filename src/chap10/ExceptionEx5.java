package chap10;
/*
 * throws : 예외처리
 * throw  : 예외발생 / 없는 예외를 강제로 발생 
 */
public class ExceptionEx5 {

	public static void main(String[] args) {
		try {
			first();
		} catch(Exception e) {
			System.out.println("숫자만 가능합니다.");
			e.printStackTrace();
		}
	}
	private static void first() throws Exception {
		System.out.println("first 메서드");
		second();
	}
	private static void second() throws Exception {
		System.out.println("second 메서드");
		try {
			System.out.println(Integer.parseInt("abc")); // NumberFormatException 발생
		} catch(RuntimeException e) {
			System.out.println("second 메서드에서 예외처리");
		}
	}

}
