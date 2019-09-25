package mehodstud;

public class fruitseller {
	int numofapple=20;
	int sellallcost=0;
	final int applefrice=2000;
	
	public int saleapple(int money) {
		int num=money/applefrice;
		numofapple-=num;
		sellallcost=money;
		return num;
		
	}
	
	public void getresult() {
		System.out.println("총 판매 금액 = "+ sellallcost );
		System.out.println("남은 사과 수 = "+ numofapple);
		
	}
	
	


}
