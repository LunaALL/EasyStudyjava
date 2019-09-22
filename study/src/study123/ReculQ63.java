package study123;

public class ReculQ63 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//System.out.println(Exponentiation(8));
		System.out.println(convers(82));
		
	}
	
	
	
	
	public static int Exponentiation(int n) {
	   
		if(n==1) {
			return 2;
			
		}
		else {
			System.out.println(n);
			
			return 2*Exponentiation(n-1);
			
		}
		
	}
	
	
	public static int convers(int n) {
		
		if(n==1) {
			return 1;
		}
		else {
			if(n%2==0) {
				System.out.println("0");
			}else System.out.println("1");
			
			return convers(n/2);
		}
		
		
	}

}
