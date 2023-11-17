package chap11;
/*
 * Wrapper 클래스 : 8개의 기본 자료형을 객체화 하기 위한 클래스를 통칭
 *    기본자료형     Wrapper 클래스
 *    boolean       Boolean
 *    char          Character
 *    byte          Byte
 *    short         Short
 *    int           Integer
 *    long          Long
 *    float         Float
 *    double        Double
 *    
 *    기본형과 참조형 사이의 형변환 불가
 *    String s = 'A'; (x)
 *    
 *    기본자료형과 연결된 Wrapper 클래스간의 형변환 가능
 *    기본형 <- 참조형 : byte b = new Byte(10); -> auto UnBoxing
 *    참조형 <- 기본형 : Byte b = 10;           -> auto Boxing
 */
public class WrapperEx1 {

	public static void main(String[] args) {
		Integer i1 = 100; // auto Boxing
		Integer i2 = 100;
		System.out.println("i1 == i2 :" + (i1 == i2));
		@SuppressWarnings("removal")
		Integer i3 = new Integer(100);
		@SuppressWarnings("removal")
		Integer i4 = new Integer(100);
		System.out.println("i3 == i4 :" + (i3 == i4));
		System.out.println("100 == i2 :" + (100 == i2)); // auto UnBoxing
		System.out.println("100 == i3 :" + (100 == i3));
		// int형 정보
		System.out.println("int형의 최대값:" + Integer.MAX_VALUE);
		System.out.println("int형의 최소값:" + Integer.MIN_VALUE);
		System.out.println("int형의 bit크기:" + Integer.SIZE);
		// double형 정보
		System.out.println("double형의 최대값:" + Double.MAX_VALUE);
		System.out.println("double형의 최소값:" + Double.MIN_VALUE);
		System.out.println("double형의 bit크기:" + Double.SIZE);
		
	}

}
