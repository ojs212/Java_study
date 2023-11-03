package test1103;
/*
 * SutdaCard 클래스
 *   멤버변수 : final int number,final boolean  isKwang
 *   생성자 : 멤버변수를 매개변수로 입력받아 초기화
 *   멤버메서드 : toString을 결과에 맞도록 오버라이딩하기
 * SutdaDeck 클래스 구현하기
 *  멤버변수 : cards : SutdaCard 20장을 저장할 배열
 *  생성자 : SutdaCard 20장을 생성하여 cards 배열에 저장
 *  메서드 : toString() 오버라이딩하여 결과가 출력되도록 구현
  [결과]    
  1K,2,3K,4,5,6,7,8K,9,10,1,2,3,4,5,6,7,8,9,10,
 */
class SutdaCard {
	final int number;
	final boolean isKwang;
	SutdaCard(int number, boolean isKwang) {
		this.number = number;
		this.isKwang = isKwang;
	}
	public String toString() {
		return "";
	}
}
class SutdaDeck {
	SutdaCard[] cards = new SutdaCard[20];
	SutdaDeck() {
		for(int i=0; i<cards.length; i++) {
			if(i > 9) {
				System.out.print(cards[i] = new SutdaCard((i % 10) + 1, false));
			} else if(i == 0 || i == 2 || i == 7) {
				System.out.print(cards[i] = new SutdaCard(i + 1, true));
			} else {
				System.out.print(cards[i] = new SutdaCard(i + 1, false));
			}
		}
		
	}
	public String toString() {
		for(int i=0; i<cards.length; i++){
			if(cards[i].isKwang == true) {
				System.out.print(cards[i].number + "K,");
			} else {
				System.out.print(cards[i].number + ",");
			}
		}
		return "";
	}
}
public class Test3 {
	public static void main(String[] args) {
		SutdaDeck deck = new SutdaDeck();
		System.out.println(deck);
		SutdaCard tmp;
		for(int i=0; i<1000; i++) {
			int a = (int)(Math.random() * 20);
			int b = (int)(Math.random() * 20);
			tmp = deck.cards[a];
			deck.cards[a] = deck.cards[b];
			deck.cards[b] = tmp;
		}
		System.out.println(deck);
		
	}
}