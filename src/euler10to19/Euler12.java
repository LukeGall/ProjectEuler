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
		int facts=1;
		int p=2;
		while(num>1) {
			int div=1;
			while(num%p==0) {
				div++;
				num=num/p;
			}
			facts=facts*div;
			p++;
		}
		return facts;
	}
	
	public static void main(String[] args) {
		prob12();
	}
}
