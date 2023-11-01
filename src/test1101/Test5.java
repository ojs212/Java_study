package test1101;
/*
 * Test2.java 소스의 Coin 클래스를 이용하기.
 * 두개의 Coin 객체를 생성하기 myCoin, youCoin 객체 생성하기
 * 앞면이 연속해서 3번 나오면 승리. => myCoin 승리, youCoin 승리, 비김.
 * [결과]
 * myCoin	youCoin
 * 앞면	앞면
 * 뒷면	앞면
 * 앞면	뒷면
 * 뒷면	앞면
 * 뒷면	앞면
 * 앞면	앞면
 * youCoin 승리  
 */


public class Test5 {
	public static void main(String[] args) {
		Coin myCoin = new Coin();
		Coin yourCoin = new Coin();
		System.out.println("myCoin\tyourCoin");
		int mySum = 0;
		int yourSum = 0;
		while(true) {
			myCoin.flip();
			yourCoin.flip();
			System.out.println((myCoin.result ? "앞면" : "뒷면") + "\t" + (yourCoin.result ? "앞면" : "뒷면"));
			if (myCoin.result == true) {
				mySum++;
			} else if (myCoin.result == false) {
				mySum = 0;
			}
			if (yourCoin.result == true) {
				yourSum++;
			} else if (yourCoin.result == false) {
				yourSum = 0;
			}
			if (mySum == 3 || yourSum == 3) {
				if(mySum == 3) {
					if(yourSum == 3) {
						System.out.println("비김");
					} else {
					System.out.println("myCoin 승리");
					}
				} else {
					System.out.println("yourCoin 승리");
				}
				break;
			}
		}
	}
}