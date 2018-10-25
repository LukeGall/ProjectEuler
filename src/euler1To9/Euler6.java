package euler1To9;

public class Euler6 {
	private static int prob6(int n) {
		int sumOfSqs=(n*(n+1)*(2*n+1))/6;
		int sum=(int) Math.pow((double) (n*(n+1))/2, 2);
		return sum-sumOfSqs;
	}
}
