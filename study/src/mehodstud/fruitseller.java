package mehodstud;

public class fruitseller {
	int numofapple=0;
	int mymoney=0;
	final int applefrice; //����� �����ϳ�, �ʱ�ȭ �ѹ��� �����. 
	
	public fruitseller (int money, int applenum,int price) {
		mymoney=money;
		numofapple=applenum;
		applefrice=price;
		
	}
	
	public int saleapple(int apple_num) {
		int num= apple_num;
		numofapple-=num;
		mymoney-=applefrice*num;
		return num*applefrice; //������ �����ڿ��� ��ȯ. 
		
	}
	
	public void getresult() {
		System.out.println("�� �Ǹ� �ݾ� = "+ mymoney );
		System.out.println("���� ��� �� = "+ numofapple);
		
	}
	
	


}
