package study123;

public class Gugu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

    /*
		int sum=0;
		for(int i =2 ; i<=8; i+=2) {
			
			for(int j = 1; j<=i; j++) {
				sum=i*j;
				System.out.println(i+" * "+j+ "=" + sum);
				
			}
			
		}
		*/
		

		int C=0;

		
	int A=0;
	int B=0;
	int sum=99;
	
	for(A=1; A<=9;A++) {
		
		for(B=1; B<=9;B++) {
			if((A*10+B)+(B*10+A)==sum) {
				System.out.println("99를 만족하는 A의 값="+A+" B의값="+B);
			}
			
		}
	}
	
		
		
		
	}

}
