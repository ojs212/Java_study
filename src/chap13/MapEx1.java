package chap13;
import java.util.Map;
import java.util.Set;
import java.util.Collection;
import java.util.HashMap;
/*
 * Map : (키, 객체) 쌍인 객체들의 모임
 * 
 * 메서드
 * put(키값, 객체값) : Map 객체에 데이터 추가 / 수정
 *    동일한 키값이 기존에 존재하면 객체만 수정
 * get(키값) : 키값에 등록된 객체값 리턴
 * remove(키값) : 키값에 해당하는 데이터 제거 / 객체값 리턴
 * 
 * keySet() : Map 객체 중 key값들의 목록 Set객체 리턴
 * values() : Map 객체 중 객체값들의 목록. Collection 객체 리턴
 * entrySet() : Map 객체의 (키,객체) 쌍인 객체 목록 / Set 객체 리턴
 *              키(객체) 쌍인 객체 : Map.Entry<key의 자료형, 객체의자료형>
 */
public class MapEx1 {

	public static void main(String[] args) {
		/*
		 * <String, Integer> : key의 자료형 String
		 *                     객체의 자료형 Integer
		 */
		Map<String, Integer> map = new HashMap<>();
		map.put("홍길동", 1234);
		map.put("김삿갓", 4567);
		map.put("이몽룡", 2350);
		map.put("김삿갓", 3456); // 객체 수정
		System.out.println(map); // 3개의 요소 저장
		System.out.println("김삿갓의 전화번호 : " + map.get("김삿갓")); // 3456
		System.out.println("홍길동의 전화번호 : " + map.get("홍길동")); // 1234
		System.out.println("성춘향의 전화번호 : " + map.get("성춘향")); // null
		// keySet() : key값들만 조회
		Set<String> keys = map.keySet();
		for(String k : keys) {
			System.out.println(k + "=" + map.get(k));
		}
		// Collection values() : 객체들만 조회 / 중복가능 / 순서유지안됨
		//                       키값 조회 불가
		Collection<Integer> values = map.values();
		for(Integer o : values) {
			System.out.println(o);
		}
		// entrySet() : (key,객체) 쌍인 객체
		//              (key,객체) 쌍의 자료형 : Map.Entry
		Set<Map.Entry<String, Integer>> entrys = map.entrySet();
		for(Map.Entry<String, Integer> e : entrys) {
			System.out.println(e.getKey() + "=" + e.getValue());
		}
		
		// 홍길동 객체 제거하기
		// remove(키값) : 키값의 데이터 제거, 객체값 리턴
		Integer value = map.remove("홍길동");
		System.out.println(value);
		System.out.println(map);
		System.out.println("map의 요소의 갯수:" + map.size());
	}

}
