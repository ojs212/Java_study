package chap13;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/*
 * Stack : LIFO(Last in First out)
 *   Stack 클래스 : Vector 클래스의 하위 클래스
 *     주요메서드
 *       push(Object) : 객체를 stack에 추가
 *       Object pop() : stack에서 객체를 꺼내 리턴 / stack에서 객체 제거
 *       Object peek() : stack에서 조회 대상 객체를 리턴
 * Queue : FIFO(First in First out)
 *   Queue 인터페이스 : LinkedList가 구현 클래스임
 *     주요메서드
 *       offer(Object) : 객체를 Queue에 추가
 *       Object poll() : Queue에서 객체를 꺼내 리턴 / Queue에서 객체 제거
 *       Object peek() : Queue에서 조회 대상 객체 리턴      
 */
public class StackQueueEx1 {

	public static void main(String[] args) {
		String[] cars = {"소나타","그랜저","SM5","K9"};
		Stack<String> stack = new Stack<>();
		Queue<String> queue = new LinkedList<>();
		for(String s : cars) {
			stack.push(s); // 스택에 데이터 추가
			queue.offer(s); // 큐에 데이터 추가
		}
		System.out.println("스택에 저장된 객체의 갯수:" + stack.size());
		System.out.println(stack);
		System.out.println("큐에 저장된 객체의 갯수:" + queue.size());
		System.out.println(queue);
		System.out.println("stack의 조회 대상 객체:" + stack.peek()); // K9
		System.out.println("queue의 조회 대상 객체:" + queue.peek()); // 소나타
		System.out.println("stack의 조회 대상 객체:" + stack.peek()); // K9
		System.out.println("queue의 조회 대상 객체:" + queue.peek()); // 소나타
		System.out.println("stack의 객체 꺼내기:" + stack.pop()); // K9
		System.out.println("queue의 객체 꺼내기:" + queue.poll()); // 소나타
		System.out.println(stack);
		System.out.println(queue);
		System.out.println("stack의 조회 대상 객체:" + stack.peek()); // SM5
		System.out.println("queue의 조회 대상 객체:" + queue.peek()); // 그랜저
	}

}
