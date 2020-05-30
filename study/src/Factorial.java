package Month05;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("10ÆÑÅä¸®¾óÀº?"+fac(5));

	}

	static int fac(int n) {
		if(n>0) {
			return n*fac(n-1);
		}
		else return 1;
		
	}
}
