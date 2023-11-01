package chap5;
/*
 * Command line에서 파라미터 받기
 */
public class ArrayEx6 {
	/*
	 * 자바프로그램 실행 순서
	 * 1. 소스코딩 : ArrayEx6.java
	 * 2. 컴파일 : javac ArrayEx6.java
	 * 		  -> ArrayEx6.class (바이트코드)
	 * 3. 실행 : java ArrayEx6
	 * 		java 인터프리터 기능
	 * 		- JVM 환경설정 : 클래스영역, 스택영역, 힙영역
	 * 		- 바이트코드 클래스 영역 메모리 로드
	 * 		- args 배열의 값을 생성하여 main 메서드에 전달 -> main 메서드 실행
	 */
	public static void main(String[] args) {
		if(args.length == 0) {
			System.out.println("command 라인에 파라미터를 입력하세요");
			return; // 현재 메서드 종료 -> 프로그램 종료
		}
		for(String a : args) {
			System.out.println(a);
		}
		for(int i=0; i<args.length; i++) {
			System.out.println("args[" + i + "]= " + args[i]);
		}
	}

}
