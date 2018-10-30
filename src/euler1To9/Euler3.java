package euler1To9;

public class Euler3 {
	public static long prob3(long n) {
		long num=n;
		int count=0;
		while(!isPrime(num)) {
			if(num%getPrime(count)==0) {
				num=num/getPrime(count);
			}else {
				count++;
			}
		}
		return num;
	}
	
	public static boolean isPrime(long n) {				
		boolean pr =true;
		String num=""+n;
		int sum=0;
		for(char i : num.toCharArray()) {
			sum=sum+Integer.parseInt(""+i);
		}
		if(sum%3==0) return false;
		for(int i=3;i<=Math.sqrt(n);i+=2) {
			if(n%i==0)pr=false;
		}
		return pr;
	}
	
	public static int getPrime(long n) {
		int primeCount=0;
		int primeCheck=3;
		int lastPrime=2;
		while(primeCount<n) {
			if(isPrime(primeCheck)) {
				lastPrime=primeCheck;
				primeCount++;
			}
			primeCheck+=2;
		}
		return lastPrime;
	}
}
