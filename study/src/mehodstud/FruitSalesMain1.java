package mehodstud;


public class FruitSalesMain1 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
          fruitseller seller =new fruitseller();
          fruitBuyer byer = new fruitBuyer();
          seller.numofapple=30; //재고 추가
          int money=byer.byapple(seller, 20000);	
          byer.getResult(money);
          seller.saleapple(20000); // 얼마나 살수 있는가?
          seller.getresult();
	}

}
