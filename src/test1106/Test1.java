package test1106;
/*
 주어진 클래스와 인터페이스  구현하기
 Animal 클래스 => 추상클래스
    멤버변수 : 동물의 종류, 다리수
    생성자 : 동물의 종류랑 다리수 입력받기.
    멤버메서드 :
          void eat(); => 추상메서드
          void sound(); => 추상메서드
  구동 클래스에 맞도록 Dog, Lion, Eagle 클래스,Flyable 인터페이스 구현하기 

[결과]
강아지,다리수:4개 =>멍멍짖는다
주인이 주는대로 먹는다
사자,다리수:4개 =>어흥거린다
초식동물을 잡아 먹는다
독수리,다리수:2개 =>모른다
동물를 잡아 먹는다
독수리는 날아 다닌다
*/
abstract class Animal {
	int leg;
	String type;
	Animal(int leg, String type) {
		this.leg = leg;
		this.type = type;
	}
	abstract void eat();
	abstract void sound();
}
class Dog extends Animal {
	Dog() {
		super(4, "강아지");
	}
	@Override
	void eat() {
		System.out.println("주인이 주는대로 먹는다");
	}
	@Override
	void sound() {
		System.out.println("멍멍짖는다");
	}
}
class Lion extends Animal {
	Lion() {
		super(4, "사자");
	}
	@Override
	void eat() {
		System.out.println("초식동물을 잡아 먹는다");
	}
	@Override
	void sound() {
		System.out.println("어흥거린다");
	}
}
class Eagle extends Animal implements Flyable {
	Eagle() {
		super(2, "독수리");
	}
	@Override
	void eat() {
		System.out.println("동물을 잡아 먹는다");
	}
	@Override
	void sound() {
		System.out.println("모른다");
	}
	@Override
	public void fly() {
		System.out.println("독수리는 날아다닌다");
	}
}
interface Flyable {
	void fly();
}
public class Test1 {
	public static void main(String[] args) {
		Animal[] animal = new Animal[3];
		animal[0] = new Dog();
		animal[1] = new Lion();
		animal[2] = new Eagle();
		for (Animal a : animal) {
			System.out.print(a.type + ",다리수:" + a.leg + "개 =>");
			a.sound();
			a.eat();
			if(a instanceof Flyable) {
				((Flyable) a).fly();
			}
		}
	}
}