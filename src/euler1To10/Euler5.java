package euler1To10;

public class Euler5 {
	public static int prob5(int upTo) {
		int num=1;
		start:
		while(true) {
			for(int i=1;i<=upTo;i++) {
				if(num%i!=0) {
					num++;
					continue start;
				}
			}
			return num;
		}
	}
}
