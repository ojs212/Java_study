package chap13;
/*
 * 객체 중복 여부 판단
 *  1. equals   : true
 *  2. hashCode : 동일
 *  
 *  1과 2를 모두 만족 : 객체 동일 판단 -> hashCode, equals 메서드 오버라이딩 필요
 */
import java.util.HashSet;
import java.util.Set;

class Person {
	String name;
	int age;
	Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	@Override
	public String toString() {
		return name + ":" + age;
	}
	@Override
	public int hashCode() {
		return name.hashCode() + age;
	}
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Person) {
			Person p = (Person)obj;
			return name.equals(p.name) && age ==p.age; 
		} else {
			return false;
		}
	}
}
public class SetEx2 {

	public static void main(String[] args) {
		Set<Object> set = new HashSet<>();
		set.add(new String("abc"));
		set.add(new String("abc")); // 추가실패
		set.add(new Person("홍길동", 10));
		set.add(new Person("홍길동", 20));
		set.add(new Person("홍길동", 10));
		set.add(1); set.add(2); set.add(1);
		set.add(new StringBuffer("abcd")); // equals, hashCode 오버라이딩 안되어 있음
		set.add(new StringBuffer("abcd")); // String으로 변환해서 add 해야함 (toString)
		System.out.println(set);
	}

}
