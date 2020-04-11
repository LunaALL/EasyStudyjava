package studyAAAA;
class sum {
	int num=0;
	public void addnum(int n) {
		num+=n;
	}
	
	public int getnum() {
		return num;
	}
}


class Adder extends sum implements Runnable {
	int start, end;
	
	public Adder (int s, int e) {
		start=s; 
		end=e;
	}
	
	public void run() {
		
		for(int i=start;i<=end;i++ ) {
			addnum(i);
			System.out.println(i);
		}
	}
	
}


public class ThreadRuntwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Adder a1 = new Adder(1,50);
		Adder a2 = new Adder(51,100);
		Thread tr1= new Thread(a1);
		Thread tr2= new Thread(a2);
	    tr1.start();
	    tr2.start();
	    
	    try {
	    	tr1.join();
	    	tr2.join();
	    	

	    	
	    	
	    }catch(InterruptedException e) {
	    	e.printStackTrace();
	    }
	    
	    System.out.println("1~100±îÁö ÇÕ  "+ ( a1.getnum() + a2.getnum() ) );

	}

}
