package chap10;
/*
 * 다중 catch 구문
 *  - 한개의 try 블럭에 여러개의 catch 블럭이 존재
 *    -> try 블럭에서 발생 가능한 예외 종류에 따라 다른 예외처리 가능 
 *    상위 예외클래스는(Exception)은 catch 구문의 하단에 배치해야함
 *    
 *    Throwable > Exception > RuntimeException > ArithmeticException  
 *                                               NumberFormatException
 *                                               .....
 * 
 * 자바에서는 예외처리 필수 / 단 RuntimeException은 예외처리 생략 가능
 *                   RuntimeException클래스의 하위 클래스도 RuntimeException 임                                              
 */
public class ExceptionEx2 {

	public static void main(String[] args) {
		System.out.print(1);
		try {
			System.out.print(2);
			System.out.print(3); // ArithmeticException 예외 발생
//			System.out.print(args[0]); // ArrayIndexOutOfBoundsException 예외 발생
//			System.out.println(Integer.parseInt("abc")); // NumberFormatExcetion 예외 발생
//			String str = null;
//			System.out.println(str.trim()); //NullPointerException
			System.out.print(4);
		} catch(ArithmeticException e) {
			System.out.println(" -> 0으로 나누지 마세요");
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(" -> command 라인에 파라미터를 입력하세요");
		} catch(NumberFormatException e) {
			System.out.println(" -> 숫자만 입력하세요");
		} catch(RuntimeException e) {
			e.printStackTrace();
			System.out.println("오류가 발생했습니다. 전산부로 연락하세요.");
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

}
