package mehodstud;

public class fruitBuyer {
	int mymoney=0;
	int num_ofapple=0;
	int myapple=0;
	
	
	public fruitBuyer(int money, int needapple) {
		mymoney=money;  //��»�� ����
		num_ofapple= needapple; //�ʿ��� �����
		
	}

	
    public void buyapple(fruitseller seller) {
    	int buyerfrice=seller.saleapple(num_ofapple);
    	System.out.println("��� ������ ="+buyerfrice +"�� �Դϴ�.");
    	mymoney-=buyerfrice;
    	myapple=num_ofapple;
    	
    } 
    public void getResult() {
    	System.out.println("�����ڿ� ���� ���� "+mymoney);
    	System.out.println("�����ڰ� ���� ���= "+myapple);
    }
	

}
