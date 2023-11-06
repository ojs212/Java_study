package chap8;
/*
 * 단일 상속의 보완적인 의미로 인터페이스 사용
 */
abstract class Animal {
	String name;
	Animal(String name) {
		this.name = name;
	}
	abstract void eat();
}
interface Flyable {
	void fly();
}
class Dove extends Animal implements Flyable {
	Dove() {
		super("비둘기");
	}
	@Override
	void eat() {
		System.out.println("벌레를 잡아먹는다");
	}
	@Override
	public void fly() {
		System.out.println(name + "는 날아 다닌다");
	}
}
class Monkey extends Animal {
	Monkey() {
		super("원숭이");
	}
	@Override
	void eat() {
		System.out.println("나무에서 열매를 따먹는다");
	}
}
public class InterfaceEx2 {

	public static void main(String[] args) {
		Animal[] arr = new Animal[2];
		arr[0] = new Dove();
		arr[1] = new Monkey();
		for(Animal a : arr) {
			a.eat();
			// 비둘기는 날아다닌다 메세지 출력
			if(a instanceof Flyable)
			((Flyable) a).fly();
		}
	}

}
