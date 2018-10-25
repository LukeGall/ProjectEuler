package euler1To9;

import java.util.ArrayList;

public class Euler9 {
	public static boolean isPyTriple(int a, int b, int c) {
		return (a*a + b*b) == c*c;
	}
	
	public static int prob9() {
		ArrayList<int[]> pyTriples = new ArrayList<int[]>();
		for (int a =1;a<500;a++) {
			for(int b=a;b<500;b++) {
				for(int c=a;c<500;c++) {
					if(isPyTriple(a,b,c)) {
						pyTriples.add(new int[] {a,b,c});
					}
				}
			}
		}
		for(int[] set: pyTriples) {
			if((set[0]+set[1]+set[2]) == 1000) {
				return set[0]*set[1]*set[2];
			}
		}
		return 0;
	}
}
