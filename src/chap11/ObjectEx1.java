package chap11;
/*
 * Object 클래스 : equals 메서드
 * 
 * equals 메서드 : 같은 내용 여부를 리턴
 *             Object 클래스의 equals 메서드는 같은 객체인지 비교함
 *             -> 내용비교를 위해서는 equals 메서드를 오버라이딩 해야함
 * == : 같은 객체 여부 리턴            
 */
class Equal {
	int value;
	Equal(int value) {
		this.value = value;
	}
	//Equal 객체의 내용을 비교하기 위해서 equals 메서드를 오버라이딩
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Equal) {
			Equal e = (Equal)obj;
			return value == e.value;
		} else return false;
		
	}
	
}
public class ObjectEx1 {

	public static void main(String[] args) {
		Equal e1 = new Equal(10);
		Equal e2 = new Equal(10);
		if(e1 == e2) System.out.println("e1과 e2 객체는 같은 객체임");
		else System.out.println("e1과 e2 객체는 다른 객체임");
		if(e1.equals(e2)) System.out.println("e1과 e2 객체는 같은 내용의 객체임");
		else System.out.println("e1과 e2 객체는 다른 내용의 객체임");
	}

}
