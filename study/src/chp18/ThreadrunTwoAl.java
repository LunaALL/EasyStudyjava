package studyAAAA;
class AdderT extends Thread{
	int start,end,num;
	
	public AdderT(int s, int e) {
		start=s;
		end=e;
	}
	
	public void run() {
		
		for(int i=start;i<=end;i++) {
			num+=i;
		    System.out.println("i =" +i + "num="+num);
		}
		
	}
	
	public int getnum() {
		return num;
	}
	
	
}


public class ThreadrunTwoAl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AdderT ad = new AdderT(1,50);
		AdderT ad1=new AdderT(51,100);
		ad.start();
		ad1.start();
		
		try {
			ad.join();
			ad1.join();
		} catch(InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("1~100 гу =" + ( ad.getnum() +ad1.getnum() ) );

	}

}
