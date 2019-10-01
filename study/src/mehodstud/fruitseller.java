package mehodstud;

public class fruitseller {
	int numofapple=0;
	int mymoney=0;
	final int applefrice; //상수로 선언하나, 초기화 한번은 허용함. 
	
	public fruitseller (int money, int applenum,int price) {
		mymoney=money;
		numofapple=applenum;
		applefrice=price;
		
	}
	
	public int saleapple(int apple_num) {
		int num= apple_num;
		numofapple-=num;
		mymoney-=applefrice*num;
		return num*applefrice; //가격을 구매자에게 반환. 
		
	}
	
	public void getresult() {
		System.out.println("총 판매 금액 = "+ mymoney );
		System.out.println("남은 사과 수 = "+ numofapple);
		
	}
	
	


}
