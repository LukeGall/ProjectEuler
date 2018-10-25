package euler1To10;

public class Euler2 {
	public static int prob2() {
		int fib1=1;
		int fib2=2;
		int sum=0;
		while(fib2<4000000) {
			if(fib2 % 2==0) {
				System.out.println(fib2);
				sum+=fib2;
			}
			int temp=fib2;
			fib2=fib1+temp;
			fib1=temp;
			
		}
		return sum;
	}
}
