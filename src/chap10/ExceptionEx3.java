package chap10;
/*
 * finally 블럭 : try 블럭에서 정상처리/예외발생 모두 실행되는 블럭
 * 
 * 정상처리 : 12356
 * 2/0예외 : 1456
 *
 * 2/0예외 return : 145
 */
public class ExceptionEx3 {

	public static void main(String[] args) {
		try {
			System.out.print(1);
			System.out.print(2/0);
			System.out.print(3);
			return;
		} catch (Exception e) {
			System.out.print(4);
			return; // 메서드 종료
		} finally {
			System.out.print(5);
		}
//		System.out.print(6);
	}

}
