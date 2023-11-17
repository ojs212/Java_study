package test1116;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
 * 영어 타자 연습 프로그램 구현
 * 
 * 3초에 한번씩 List에 소문자 3~4자의 임의의 영어단어 추가하기.
 * 화면에 추가된이름을 출력하기.
 * 단어를 입력받아서 입력받은 단어를 리스트에서 제거.
 * List 의 모든 데이터 삭제되면 프로그램 종료
 * 
 [결과]
[abcd]
>>abcd
[cncm]
>>cncm
[rfaa]
>>rfaa  
 */
class EngKey implements Runnable{
	List<String> list = new ArrayList<>();
	static int interval = 3 * 1000;
	String str;
	@Override
	public void run() {
		while(true) {
			str = "";
			for(int i=0; i<((int)(Math.random() * 2)) + 3; i++) {
				str += (char)('a' + ((int)(Math.random() * 26)));
			}
			list.add(str);
			try {
				Thread.sleep(interval);
			} catch(InterruptedException e) {}
		}
	}
	
}
public class Test2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		EngKey ek = new EngKey();
		Thread t1 = new Thread(ek);
		ek.list.add("abcd");
		System.out.println(ek.list);
		System.out.print(">>");
		t1.setDaemon(true);
		t1.start();
		while(true) {
			String word = sc.next().trim();
			ek.list.remove(word);
			if(ek.list.size() == 0) {
				break;
			}
			System.out.println(ek.list);
		}
		sc.close();
		System.out.println("프로그램 종료");
	}
}