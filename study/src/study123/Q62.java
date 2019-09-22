package study123;

public class Q62 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		int r=20;
		
		double n=원의넓이(r);
		double w=원의둘레(r);
        System.out.println("원의 넓이는 "+n+"    원의 둘레는"+w);
        */
		
		boolean check;
		
		for(int i=1; i<=100;i++) {
			check=primenum(i);
			if(check==true){
				System.out.println(i+"는 소수입니다.");
				check=false;
			}
			
		}
		
		
		
        
        
	}
	
	public static double 원의넓이(int r) {
		double 넓이=r*r*3.14;
		return 넓이; 
	}
	
	public static double 원의둘레(int r) {
		double 넓이=r*2*3.14;
		return 넓이;
	}
	
	
	public static boolean primenum(int n) {
		
		int count=0;
		for(int i =1; i<=n;i++) {
			if(n%i==0)
				count++;
			
		}
		
		if(count<=2) {

			return true;
		}
		else
		{  
		    return false;}
	
		
	}

}
