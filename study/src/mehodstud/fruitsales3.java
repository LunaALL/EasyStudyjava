package mehodstud;

public class fruitsales3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		fruitBuyer by1= new fruitBuyer(10000,5);
		
		fruitseller se1= new fruitseller(0, 10, 1000);
		fruitseller se2= new fruitseller(1000, 20, 800);
		
	
		by1.buyapple(se2);
        by1.getResult();
	}

}
