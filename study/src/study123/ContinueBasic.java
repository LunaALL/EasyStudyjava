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
				System.out.println("Ȧ���� ���ϰ� sum �� �� "+sum);
			}
			if(n%3==0 && n%2==0) {
				sum+=n;
				System.out.println("3�� ���, ¦�� = "+n);
				System.out.println("3�� ���, ¦���� ���ϰ� sum ��"+sum);
				
			}
			
			if(sum>1000) {
				System.out.println("���� 1000�� ����. n ="+n);
				break;
			}
			
			n++;
			
		}
		
	}

}
