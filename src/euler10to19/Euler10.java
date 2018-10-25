package euler10to19;

public class Euler10 {
	public static long prob10(int n) {
		boolean[] isPrime = new boolean[n+1];
        for (int i = 2; i <= n; i++) {
            isPrime[i] = true;
        }

        for (int factor = 2; factor*factor <= n; factor++) {

            if (isPrime[factor]) {
                for (int j = factor; factor*j <= n; j++) {
                    isPrime[factor*j] = false;
                }
            }
        }

        long sum=0;
        for (int i = 2; i <= n; i++) {
            if (isPrime[i]) sum+=i;
        }
        return sum;
	}
}
