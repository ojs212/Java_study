package chap15;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.ToIntFunction;
/*
 * Function 인터페이스 : 매개변수, 리턴값 존재
 *   R applyXXXX(..)
 *   
 *  Function<T,R> : T:매개변수형, R:리턴형
 *  BiFunction<T,U,R> : T,U:매개변수형, R:리턴형
 *  ToIntFunction<T> : T:매개변수형, int:리턴형
 *  DoubleToIntFunction<T> : double:매개변수형, int:리턴형
 *  ...
 */
class Student {
	private String name;
	private int eng;
	private int math;
	private String major;
	public Student(String name, int eng, int math, String major) {
		this.name = name;
		this.eng = eng;
		this.math = math;
		this.major = major;
	}
	public String getName() {
		return name;
	}
	public int getEng() {
		return eng;
	}
	public int getMath() {
		return math;
	}
	public String getMajor() {
		return major;
	}
	@Override
	public String toString() {
		return "(" + name + ":" + major +"," + eng + "," + math + "," + "총점:"+ (eng+math) +")";
	}
	
}
public class LambdaApiEx3 {
	static List<Student> list = Arrays.asList(new Student("홍길동",90,80,"경영"),
			new Student("김삿갓",95,70,"컴공"),new Student("이몽룡",85,75,"경영"));
	
	public static void main(String[] args) {
		System.out.println("학생의 이름===");
		for(Student s : list) {
			System.out.print(s.getName() + ",");
		}
		System.out.println();
		System.out.println("학생의 이름===");
		printString(t -> t.getName()); // t : Student, t.getName() : String
		//메서드 참조
		printString(Student::getName); 
		System.out.println("전공 이름===");
		printString(t -> t.getMajor());
		System.out.println("수학 점수 ===");
		printString(t -> t.getMath() + "");
		System.out.println("영어 점수 ===");
		printString(t -> t.getEng() + "");
		System.out.println("학생이름(영어점수) ===");
		printString(t -> t.getName() + "(" + t.getEng() + ")");
		System.out.println("학생이름(수학점수) ===");
		printString(t -> t.getName() + "(" + t.getMath() + ")");
		// 학생들의 영어점수 합계
		System.out.println("영어점수 합계 ===");
		printTot(t -> t.getEng());
		// 학생들의 수학점수 합계
		System.out.println("수학점수 합계 ===");
		printTot(t -> t.getMath());
		// 학생들의 전체점수 합계
		System.out.println("점수 합계 ===");
		printTot(t -> t.getEng() + t.getMath());
	}
	private static void printTot(ToIntFunction<Student> f) {
		int sum = 0;
		for(Student s : list) {
			sum += f.applyAsInt(s);
		}
		System.out.println(sum);
	}
	// Function<Student, String> : String apply(Student)
	private static void printString(Function<Student, String> f) {
		// f : t->t.getName() : f.apply(s)
		for(Student s : list) {
			System.out.print(f.apply(s) + ",");
		}
		System.out.println();
	}
}
