package alg;
class Outer {
	static class Inner {
		int iv = 5;
	}
}
interface bb {
	public void sort();
}
interface cc extends bb, Runnable {
	
}
public class Main1 {
	public static void main(String[] args) {
		StringBuffer a = new StringBuffer("A");
		StringBuffer b = new StringBuffer("B");
		aaa(a, b);
		System.out.println(a + "," + b);
		Outer.Inner in = new Outer.Inner();
		System.out.println(in.iv);
		int x = 10;

		switch(x) {
			default: System.out.println("Hello");
		}
		float f = 'A';
		System.out.println(f);
	}
	
	static void aaa(StringBuffer x, StringBuffer y) {
		x.append(y);
		y = x;
		
	}
}
