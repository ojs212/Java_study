package test1114;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.TreeMap;

/*
 * SutdaCard, SutdaDeck, Player를 이용하여 다음 구동 클래스를 완성하시오
 [결과]
[1K, 2, 3K, 4, 5, 6, 7, 8K, 9, 10, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
[6, 7, 5, 4, 5, 8, 9, 10, 2, 3, 10, 4, 1K, 6, 1, 7, 2, 3K, 9, 8K]

게임할 인원수를 입력하세요(최대:10)
5
1등:2번(5,4):9
1등:4번(9,10):9
3등:5번(2,3):5
4등:1번(6,7):3
4등:3번(5,8):3
 */
public class Test1 {
	public static void main(String[] args) {
		SutdaDeck deck = new SutdaDeck();
		deck.shuffle();
		Scanner sc = new Scanner(System.in);
		System.out.println("게임할 인원수를 입력하세요(최대:10)");
		int heads = sc.nextInt();
		List<Player> list = new ArrayList<>();
		for(int i=0; i<heads; i++) {
			list.add(new Player("플레이어" + (i+1), deck.pick(0), deck.pick(0)));
		}
		Collections.sort(list, (d1,d2) -> d2.getScore() - d1.getScore());
		int rank = 1;
		for (Player a : list) {
			System.out.println(rank++ + "등:" + a);
		}
		System.out.println("=====================");
		TreeMap<Integer, Player> map = new TreeMap<>();
		int getRank = 1;
		for(int i=0; i<list.size(); i++) {
			if(!map.containsKey(list.get(i).getScore())) {
				map.put(list.get(i).getScore(), list.get(i));
				System.out.println((i+1) + "등:" + list.get(i));
				getRank = i+1;
			} else {
				System.out.println(getRank + "등:" + list.get(i));
			}
		}
		sc.close();
	}
}