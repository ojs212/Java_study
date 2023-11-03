package chap7;
/*
 * Buyer 클래스
 * 멤버변수 : money = 500, point 
 * 		   Product[] items = new Product[5]  -> 장바구니
 * 		   int cnt -> 구매갯수
 * 멤버메서드
 * 		void buy(Product p)
 *        1. p상품의 가격을 money에서 차감
 *        2. p상품의 포인트만큼 point 증가
 *        3. imems에 p제품을 추가. cnt 증가
 *        4. p제품의 이름 출력. 예) TV구입
 *      void summary()
 *        1. 구매 제품 전체의 금액 합계, 포인트 합계 출력
 *        2. 잔액 출력
 *        3. 전체 구매 물품 이름 출력
 */
class Buyer {
	int money = 500;
	int point, cnt;
	Product[] items = new Product[5];
	void buy(Product p) {
		money -= p.price;
		this.point += p.point;
		items[cnt++] = p;
		System.out.println(p.toString() + "구입");
	}
	void summary() {
		int totPrice = 0, totPoint = 0;
		for(int i=0; i<cnt; i++) {
			totPrice += items[i].price;
			totPoint += items[i].point;
		}
		System.out.printf("전체 금액 합계:%d, 포인트 합계:%d\n",totPrice, totPoint);
		System.out.printf("구매 잔액:%d\n", money);
		System.out.print("전체 구매 목록:");
		for(int i=0; i<cnt; i++) {
			System.out.print(items[i] + ", ");
		}
		System.out.println();
	}
}
public class Exam2 {

	public static void main(String[] args) {
		Tv t = new Tv();
		Computer c = new Computer();
		HandPhone h = new HandPhone();
		Buyer b = new Buyer();
		b.buy(t); 
		b.buy(c);
		b.buy(h); 
		b.summary();
		System.out.println("main Buyer 잔액:" + b.money);
		System.out.println("main Buyer 포인트:"+b.point);
	}

}
