package chap15;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.DoubleBinaryOperator;
import java.util.function.IntBinaryOperator;

/*
 * Operator 인터페이스
 * Function 인터페이스의 하위 인터페이스
 * 매개변수, 리턴값 존재 -> 매개변수형과 리턴자료형이 같다
 */
public class LambdaApiEx4 {
	private static List<Student> list = Arrays.asList(new Student("홍길동",90,80,"경영"), 
			new Student("김삿갓",95,70,"컴공"), new Student("이몽룡",85,75,"경영"));
	
	public static void main(String[] args) {
		System.out.println("최대 수학점수");
		System.out.println(maxOrMinMath((a,b) -> (a>=b) ? a : b));
		System.out.println("최소 수학점수");
		System.out.println(maxOrMinMath((a,b) -> (a<=b) ? a : b));
		System.out.println("최대 영어점수");
		System.out.println(maxOrMinEng((a,b) -> (a>=b) ? a : b));
		System.out.println("최소 영어점수");
		System.out.println(maxOrMinEng((a,b) -> (a<=b) ? a : b));
		System.out.println("최대 평균점수");
		System.out.println(maxOrMinAvg((a,b) -> (a>=b) ? a : b));
		System.out.println("최소 평균점수");
		System.out.println(maxOrMinAvg((a,b) -> (a<=b) ? a : b));
		System.out.println("영어 최고점 학생 ->"
				+ maxOrMin((a,b) -> a.getEng() >= b.getEng() ? a : b));
		System.out.println("영어 최저점 학생 ->"
				+ maxOrMin((a,b) -> a.getEng() <= b.getEng() ? a : b));
		System.out.println("수학 최고점 학생 ->"
				+ maxOrMin((a,b) -> a.getMath() >= b.getMath() ? a : b));
		System.out.println("수학 최저점 학생 ->"
				+ maxOrMin((a,b) -> a.getMath() <= b.getMath() ? a : b));
		System.out.println("총점 최고점 학생 ->"
				+ maxOrMin((a,b) -> a.getMath() + a.getEng() >= b.getMath() + b.getEng() ? a : b));
		System.out.println("총점 최저점 학생 ->"
				+ maxOrMin((a,b) -> a.getMath() + a.getEng() <= b.getMath() + b.getEng() ? a : b));
	}
	// IntBynaryOperator : int applyAsInt(int int)
	private static int maxOrMinMath(IntBinaryOperator op) {
		int result = list.get(0).getMath();
		for(Student s : list) {
			result = op.applyAsInt(result, s.getMath());
		}
		return result;
	}
	private static int maxOrMinEng(IntBinaryOperator op) {
		int result = list.get(0).getEng();
		for(Student s : list) {
			result = op.applyAsInt(result, s.getEng());
		}
		return result;
	}
	private static double maxOrMinAvg(DoubleBinaryOperator op) {
		double result = (list.get(0).getEng() + list.get(0).getMath()) / 2.0;
		for(Student s: list) {
			double avg = (s.getMath() + s.getEng()) / 2.0;
			result = op.applyAsDouble(result, avg);
		}
		return result;
	}
	private static Student maxOrMin(BinaryOperator<Student> op) {
		Student result = list.get(0);
		for(Student s : list) {
			result = op.apply(result, s);
		}
		return result;
	}
}
