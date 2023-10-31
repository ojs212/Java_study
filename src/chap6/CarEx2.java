package chap6;
class Car2 {
	String color;
	int num;
	int sno;
	static int cnt;
	public String toString() {
		return "자동차번호 : " + sno + "=>" + color + "," + num + "자동차생산갯수 : " + cnt;
	}
}
public class CarEx2 {

	public static void main(String[] args) {
		Car2 c1 = new Car2();
		c1.color = "White";
		c1.num = 1234;
		c1.sno = ++Car2.cnt;
		System.out.println(c1);
		Car2 c2 = new Car2();
		c2.color = "Black";
		c2.num = 2345;
		c2.sno = ++ Car2.cnt;
		System.out.println(c2);
		System.out.println(c1);
	}

}
