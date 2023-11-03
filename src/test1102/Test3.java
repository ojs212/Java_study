package test1102;
/*
 * Test2.java의 클래스를 이용하기
 * 
 * Buyer 클래스 구현하기
 *   멤버변수 : money=10000
 *           point,구매건수(cnt),장바구니(cart)=new Food[10]
 *   멤버메서드
 *      void buy(food)
 *        1. 현재잔액보다 물품값이 큰 경우 잔액부족 메세지 출력하고 메서드 종료
 *        2. 보유금액에서 물품가격만큼 차감
 *        3. 물품의 포인트만큼 포인트 증가
 *        4. 물품명과 가격을 출력
 *        5. 장바구니에 구매물품을 추가 cnt 1 증가
 *      void summary()
 *        1. cart 상품을 조회하여 구매한 물품의 목록 출력
 *        2. cart 상품을 조회하여 구매한 물품의 가격, 포인트 합계 출력
 *        3. 구매한 상품 중 과일의 갯수, 과일 구매금액, 과일 구매목록 출력
 *        4. 구매한 상품 중 음료의 갯수, 음료 구매금액, 음료 구매목록 출력
 *        5. 구매한 상품 중 과자의 갯수, 과자 구매금액, 과자 구매목록 출력
 *        6. 현재 잔액과 포인트 출력  
 */
class Buyer {
	int money = 10000;
	int point, cnt;
	Food[] cart = new Food[10];
	
	void buy(Food f) {
		if (money < f.price) {
			System.out.println(f + "구입시 잔액 부족");
			return;
		}
		money -= f.price;
		point += f.point;
		System.out.println(f + "구입. 가격:" + f.price);
		cart[cnt++] = f;
	}
	void summary() {
		System.out.print("구매물품 목록:");
		int totAmt =0, totPoint=0;
		for(int i=0; i<cnt; i++) {
			System.out.print(cart[i] + ", ");
			totAmt += cart[i].price;
			totPoint += cart[i].point;
		}
		System.out.println();
		System.out.println("전체 물품가격:" + totAmt + ", 구매포인트:" + totPoint);
		int fcnt=0, fprice=0;
		int dcnt=0, dprice=0;
		int scnt=0, sprice=0;
		String flist = "", dlist = "", slist = "";
		for(int i=0; i<cnt; i++) {
			if(cart[i] instanceof Fruit) {
				fcnt++;
				fprice += cart[i].price;
				flist += cart[i]+",";
			}
			if(cart[i] instanceof Drink) {
				dcnt++;
				dprice += cart[i].price;
				dlist += cart[i]+",";
			}
			if(cart[i] instanceof Snack) {
				scnt++;
				sprice += cart[i].price;
				slist += cart[i]+",";
			}
		}
		System.out.println("과일구매갯수:" + fcnt + ", 과일구매금액:" + fprice + ", 과일구매목록:" + flist);
		System.out.println("음료구매갯수:" + dcnt + ", 음료구매금액:" + dprice + ", 음료구매목록:" + dlist);
		System.out.println("과자구매갯수:" + scnt + ", 과자구매금액:" + sprice + ", 과자구매목록:" + slist);
	
		System.out.println("현재잔액:" + money + " 포인트:" + point);
	}
}
public class Test3 {

	public static void main(String[] args) {
		Apple apple = new Apple(1000,10.5);//가격, 당도(brix)
		System.out.println("사과 가격:" + apple.price);
		System.out.println("사과 당도:" + apple.brix);
		Peach peach = new Peach(1000,13.5);//가격, 당도(brix)
		Cock cock = new Cock(500,500);   //가격, 용량(ml)
		Sidar sidar = new Sidar(1500,1000);//가격, 용량(ml)
		Biscuit bis = new Biscuit(10000,500);//가격, 무게(gram)
		Cookie cookie = new Cookie(500,5000);//가격, 무게(gram)
		
		//1 Buy클래스 객체 생성
		Buyer b = new Buyer();
		//b.buy함수 호출
		b.buy(apple);
		b.buy(peach);
		b.buy(cock);
		b.buy(sidar);
		b.buy(bis);
		b.buy(cookie);
		b.summary();
	}

}
