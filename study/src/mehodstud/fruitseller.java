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
		System.out.println("�� �Ǹ� �ݾ� = "+ sellallcost );
		System.out.println("���� ��� �� = "+ numofapple);
		
	}
	
	


}
