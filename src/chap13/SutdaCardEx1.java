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
	final int num;
	final boolean isKwang;
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
/*
 * Player 클래스
 *  멤버변수 : name
 *          SutdaCard card1, card2
 *  생성자 : 멤버값을 받아서 객체 생성
 *  멤버메서드 
 *     int getScore() : card1, card2로 점수 리턴
 *                   jokbo 객체 존재하는 경우 jokbo의 값을 리턴
 *                   jokbo 객체 없는 경우(card1.num + card2.num) % 10 점수 리턴
 *     toString() : 이름과 카드2장, 점수 출력
 *            홍길동(2,8k) : 0
 *            김삿갓(4,8) : 2
 *            이몽룡(1K,3K) : 4000        
 */
class Player {
	String name;
	SutdaCard card1, card2;
	Player(String name, SutdaCard card1, SutdaCard card2) {
		this.name = name;
		this.card1 = card1;
		this.card2 = card2;
	}
	int getScore() {
		Integer score = 0;
		if(card1.isKwang && card2.isKwang) {
			score = SutdaDeck.jokbo.get("KK");
		} else {
			score = SutdaDeck.jokbo.get(""+card1.num + card2.num);
		} if(score == null) {
			score = (card1.num + card2.num) % 10; 
		}
		return score;
	}
	public String toString() {
		return name + "(" + card1 + "," + card2 + ") : " + getScore();
	}
}
public class SutdaCardEx1 {

	public static void main(String[] args) {
		SutdaDeck deck = new SutdaDeck();
		deck.shuffle();
		List<Player> list = new ArrayList<>();
		list.add(new Player("홍길동",deck.pick(0),deck.pick(0)));
		list.add(new Player("김삿갓",deck.pick(0),deck.pick(0)));
		list.add(new Player("이몽룡",deck.pick(0),deck.pick(0)));
		for(Player p : list) {
			System.out.println(p);
		}
		System.out.println("deck에 남은 카드의 갯수:" + deck.cards.size());
		System.out.println("deck에 남은 카드:" +deck.cards);
		/*
		 * Player 중 가장 높은 점수를 가진 Player의 이름 출력하기
		 * 홍길동 승리
		 * 1등이 2명인 경우 : 홍길동, 김삿갓 비김
		 */
		Collections.sort(list, (d1,d2) -> d2.getScore() - d1.getScore());
		if(list.get(0).getScore() == list.get(1).getScore()) {
			System.out.println(list.get(0).name + "," + list.get(1).name + " 비김");
		} else {
			System.out.println(list.get(0).name + " 승리");
		}
	}

}
