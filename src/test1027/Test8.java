package test1027;
/*
command line에서 숫자로 이루어진 문자를 두개 받아서 두수의 공약수를 구하시오
     java Test8 10 20

   [결과]
   10과 20 의 공약수 : 1,2,5,10,
 */
public class Test8 {
	public static void main(String[] args) {
		int num = Integer.parseInt(args[0]);
		int num1 = Integer.parseInt(args[1]);
		System.out.print(num + "과 " + num1 + "의 공약수 : ");
		for(int i=1; i<=num; i++) {
			if(num % i == 0) {
				if(num1 % i == 0) {
					System.out.print(i + ",");
				}
			}
		}
		System.out.println();
	}
}