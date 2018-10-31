package euler10to19;

import java.util.Arrays;
import java.util.HashMap;

public class Euler12 {
	
	private static int getTriNum(int n) {
		return n*(n+1)/2;
	}
	
	private static void prob12() {
		int triNum=1;
		int count=1;
		int fact=0;
		
		while (fact<500) {
			triNum=getTriNum(count);
			fact=factors(triNum);
			count++;
		}
		System.out.println(triNum);
	}
	
	private static int factors(int num) {
		int factors=0;
		int sqrt = (int) Math.sqrt(num);
		for(int i=1;i<sqrt;i++) {
			if(num % i == 0) factors+=2;
		}
		if(sqrt*sqrt==num) {
			factors--;
		}
		return factors;
		
	}
	
	public static void main(String[] args) {
		prob12();
	}
}
