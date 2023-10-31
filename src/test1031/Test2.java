package test1031;

/*
2.  다음 결과가 출력되도록 동물클래스와 구동클래스(Test2)를 구현하기       

 동물클래스(Animal)
    멤버변수 : 이름(name), 나이(age)
    멤버메서드: eat() ;
         기능 : "맛있게 얌얌" 출력
[결과]
     이름(name):원숭이
     나이(age):20
     맛있게 얌얌   */
class Animal {
	String name;
	int age;
	String eat() {
		return "맛있게 얌얌";
	}
	public String toString() {
		return "이름:" + name + "\n나이:" + age; 
	}
}
public class Test2 {
	public static void main(String[] args) {
		Animal a = new Animal();
		a.name = "원숭이";
		a.age = 20;
		System.out.println(a.toString() + "\n" + a.eat());
	}
}