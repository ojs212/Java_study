package test1031;

/*1. Card 클래스가 다음과 같을때 구동 클래스를 완성하시오

[결과]
Heart:1(100,250)
Spade:1(100,250)
Heart:1(50,80)
Spade:1(50,80)
*/
class Card {
	String kind;
	int number;
	static int width = 100;
	static int height = 250;
	public String toString() {
		return kind + ":" + number + "(" + width + "," + height + ")";
	}
}

public class Test1 {
	public static void main(String[] args) {
		String[] arr = {"Heart", "Spade"};
		Card[] list = new Card[4];
		for(int i=0; i<list.length/2; i++) {
			list[i] = new Card();
			list[i].number = 1;
			list[i].kind = arr[i];
			System.out.println(list[i]);
		} 
		for(int i=2; i<list.length; i++) {
			list[i] = new Card();
			list[i].number = 1;
			list[i].kind = arr[i-2];
			Card.width = 50;
			Card.height = 80;
			System.out.println(list[i]);
		}

	}
}