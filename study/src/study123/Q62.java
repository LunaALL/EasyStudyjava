package study123;

public class Q62 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		int r=20;
		
		double n=���ǳ���(r);
		double w=���ǵѷ�(r);
        System.out.println("���� ���̴� "+n+"    ���� �ѷ���"+w);
        */
		
		boolean check;
		
		for(int i=1; i<=100;i++) {
			check=primenum(i);
			if(check==true){
				System.out.println(i+"�� �Ҽ��Դϴ�.");
				check=false;
			}
			
		}
		
		
		
        
        
	}
	
	public static double ���ǳ���(int r) {
		double ����=r*r*3.14;
		return ����; 
	}
	
	public static double ���ǵѷ�(int r) {
		double ����=r*2*3.14;
		return ����;
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
