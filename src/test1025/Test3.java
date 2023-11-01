package test1025;
/*
   시스템과 주사위 숫자 비교하기
   시스템의 주사위 값을 저장하고,
   사용자의 주사위 값도 임의의값으로  시스템의 값과 비교하여, 
   시스템의 주사위 값이 크면 시스템 승리
   사용자의 주사위 값이 크면 사용자 승리
   시스템과 사용자의 주사위값이 같으면 동점입니다.
   [결과]
   시스템 주사위값 :3,사용자 주사위값:5=>사용자 승리.   
*/

public class Test3 {
	public static void main(String[] args) {
		int num = (int)(Math.random() * 6 + 1);
		int sysNum = (int)(Math.random() * 6 + 1);
		if (num > sysNum) {
			System.out.println("시스템 주사위 값 : " + sysNum + "  사용자 주사위 값 : " + num);
			System.out.println("사용자 승리!");
		} else if (num < sysNum) {
			System.out.println("시스템 주사위 값 : " + sysNum + "  사용자 주사위 값 : " + num);
			System.out.println("시스템 승리!");
		} else {
			System.out.println("시스템 주사위 값 : " + sysNum + "  사용자 주사위 값 : " + num);
			System.out.println("비김!");
		}
	}
}