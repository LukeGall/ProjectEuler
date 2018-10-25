package euler1To9;

public class Euler4 {
	public static boolean isPalin(int n) {
		String num = ""+n;
		char[] nums=num.toCharArray();
		for(int i=0; i<num.length()/2 ; i++) {
			if(nums[i] != nums[num.length()-1-i]) {
				return false;
			}
		}
		return true;
	}
	
	public static int prob4(int nOfDigits) {
		String n1 ="";
		String n2 ="";
		
		for(int i=0;i<nOfDigits;i++) {
			n1=n1+"9";
			n2=n2+"9";
		}
		
		int num1 = Integer.parseInt(n1);
		int num2 = Integer.parseInt(n2);
		
		int max=0;
		
		for(int i=num1; i>0;i--) {
			for(int j=num2; j>0;j--) {
				if(isPalin(i*j)) {
					if((i*j) > max) max=i*j;
				}
			}
		}
		return max;
	
	}
}
