package studyAAAA;
class sum1234{
	int num=0;
	public void addnum(int n) {
		num+=n;
	}
	
	public int getnum() {
		return num;
	}
}


class Padder extends Thread {
	sum1234 inst;
	int start,end;
	public Padder(sum1234 s, int st, int e) {
	 inst=s;
	 start=st;
	 end=e;
		
	}
	
	public void run() {
		for(int i=start; i<=end; i++) {
			inst.addnum(i);
			
			
		}
		
	}
	
	
	
}


public class ThreadShare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sum1234 s1= new sum1234();
     Padder a1= new Padder(s1, 1, 50);
     Padder a2= new Padder(s1,51,100);
     a1.start();
     a2.start();
     
     try {
    	 a1.join();
    	 a2.join();
     } catch (InterruptedException e){
    	 e.printStackTrace();
     }
     
     
     System.out.println("1~100 sum 인스턴스 공유로 더하기" + (s1.getnum()) );
	}

}
