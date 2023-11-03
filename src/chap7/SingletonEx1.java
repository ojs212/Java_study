package chap7;
// 생성자의 접근제어자를 private로 -> 객체를 한개만 생성
class SingleObject {
	private static SingleObject obj = new SingleObject();
	private SingleObject() {} // 생성자
	int value = 100;
	public static SingleObject getObject() {
		return obj;
	}
}
public class SingletonEx1 {

	public static void main(String[] args) {
//		SingleObject o1 = new SingleObject(); -> 생성자 접근 불가
		SingleObject o1 = SingleObject.getObject();
		System.out.println(o1.value);
		SingleObject o2 = SingleObject.getObject();
		System.out.println(o2.value);
		o1.value = 200;
		System.out.println(o1.value);
		System.out.println(o2.value);
	}

}
