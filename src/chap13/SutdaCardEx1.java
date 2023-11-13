package chap13;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
 *  SutdaCard 클래스 구현하기
 */
class SutdaCard {
	int num;
	boolean isKwang;
	SutdaCard(int num, boolean isKwang) {
		this.num = num;
		this.isKwang = isKwang;
	}
	public String toString() {
		return num + ((isKwang)?"K":"");
	}
}
/*
 * SutdaDeck 클래스
 * 1. 멤버변수 List<SutdaCard> cards;
 *          static Map<String, Integer> jokbo;
 * 2. 생성자 : 매개변수 없음
 *           SutdaCard 20장을 cards 객체에 저장
 *           1~10의 숫자를 가진 카드 각 2장씩
 *           1,3,8인 카드중 한장은 isKwang=true 인 카드 생성
 * 3. 멤버메서드 : 
 *      SutdaCard pick(int idx) : cards 에서 idx에 해당하는 카드를 제거하여 리턴
 *      SutdaCard pick()        : cards 에서 임의로 카드를 제거하여 리턴
 *      void shuffle()          : cards를 섞기 기능
 */
class SutdaDeck {
	List<SutdaCard> cards = new ArrayList<>();
	static Map<String, Integer> jokbo;
	static { // static 초기화블럭
		jokbo = new HashMap<>();
		jokbo.put("KK", 4000);
		for(int i=1; i<=10; i++) {
			jokbo.put("" + i + i, 3000 + (i * 10));
		}
		jokbo.put("12", 2060); jokbo.put("21", 2060);
		jokbo.put("14", 2050); jokbo.put("41", 2050);
		jokbo.put("19", 2040); jokbo.put("91", 2040);
		jokbo.put("110", 2030); jokbo.put("101", 2030);
		jokbo.put("410", 2020); jokbo.put("104", 2020);
		jokbo.put("46", 2010); jokbo.put("64", 2010);
	}
	SutdaDeck() {
		for(int i=0; i<20; i++) {
			if(i == 0 || i == 2 || i == 7) {
				cards.add(new SutdaCard(i%10+1, true));
			} else {
				cards.add(new SutdaCard(i%10+1, false));
			}
		}
		System.out.println(cards);
	}
	SutdaCard pick(int idx) {
		return cards.remove(idx);
	}
	SutdaCard pick() {
		return cards.remove((int)(Math.random() * 20));
	}
	void shuffle() {
		Collections.shuffle(cards);
		System.out.println(cards);
	}
}
public class SutdaCardEx1 {

	public static void main(String[] args) {
		SutdaDeck deck = new SutdaDeck();
		deck.shuffle();
	}

}
