package mehodstud;

public class fruitBuyer {
	int money=0;
	int needapplenum=10;
	int have_apple=0;
	
    public int byapple (fruitseller sell, int money) {
        if(sell.numofapple>needapplenum) {
        	money-= sell.applefrice*needapplenum;
            have_apple=needapplenum;
            sell.numofapple-=have_apple;
        }
        return money;
        
      }
    
    public void getResult(int money) {
    	System.out.println("남은 돈 = "+money);
    	System.out.println("가진 사과= "+have_apple);
    }
	

}
