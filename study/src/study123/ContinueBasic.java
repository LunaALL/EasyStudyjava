package study123;

public class ContinueBasic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		int num = 0;
		int count = 0;
		
		for(num=0 ;num<100;num++) {
			if(num%5!=0 || num%7!=0)
				continue;
			
			count ++;
			System.out.println(num);
			
		}
		
		System.out.println("count = " + count);  
		
		
		*/
		int n=1;
		int sum=0;
		while(true) {
			if(n%2!=0) {
				sum+=n;
				System.out.println("find!! "+n);
				System.out.println("홀수를 더하고 sum 의 값 "+sum);
			}
			if(n%3==0 && n%2==0) {
				sum+=n;
				System.out.println("3의 배수, 짝수 = "+n);
				System.out.println("3의 배수, 짝수를 더하고 sum 값"+sum);
				
			}
			
			if(sum>1000) {
				System.out.println("합이 1000을 넘음. n ="+n);
				break;
			}
			
			n++;
			
		}
		
	}

}
