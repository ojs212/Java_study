package test1108;
/*
 * 소숫점이하 자리수까지 반올림하여 출력하기
 *  double  round(double 실수값,int 소숫점이하자리수)  
 * 소숫점이하 자리수에서 버림하여 출력하기
 *  double  truncate(double 실수값,int 소숫점이하자리수)  
 */
public class Test4 {
	public static void main(String[] args) {
		System.out.println(round(3.1215,1));  //3.1
		System.out.println(round(3.1215,2));  //3.12
		System.out.println(round(3.1215,3));  //3.122
		System.out.println(truncate(3.15345,1));  //3.1
		System.out.println(truncate(3.15345,2));  //3.15
		System.out.println(truncate(3.15345,3));  //3.153
		System.out.println(truncate(3.15345,4));  //3.1534
	}
	static double round(double a, int b) {
		String s = String.valueOf(a);
		s = String.format("%."+ b +"f", a);
		a = Double.parseDouble(s);
		return a;
	}
	static double truncate(double a, int b) { // indexof,substring 가능 / Math.pow 가능 
		int[] arr = new int[b];
		String s = "1";
		for(int i=0; i<arr.length; i++) {
			arr[i] = 0;
			s += arr[i];
		}
		int i = Integer.parseInt(s);
		a = Math.floor((a * i)) / i;
		return a;
	}
//	static StringBuffer truncate1(double a, int b) {
//		StringBuffer sb = new StringBuffer();
//		sb.append(a);
//		sb.delete(b+2, 2100000000);
//		return sb;
//	}
}