package mehodstud;

public class fruitBuyer {
	int mymoney=0;
	int num_ofapple=0;
	int myapple=0;
	
	
	public fruitBuyer(int money, int needapple) {
		mymoney=money;  //사는사람 지갑
		num_ofapple= needapple; //필요한 사과수
		
	}

	
    public void buyapple(fruitseller seller) {
    	int buyerfrice=seller.saleapple(num_ofapple);
    	System.out.println("사과 가격은 ="+buyerfrice +"원 입니다.");
    	mymoney-=buyerfrice;
    	myapple=num_ofapple;
    	
    } 
    public void getResult() {
    	System.out.println("구매자에 남은 돈은 "+mymoney);
    	System.out.println("구매자가 가진 사과= "+myapple);
    }
	

}
