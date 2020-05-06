package chp18a;

class AA {
	private int a;
	
	public AA(int a) {
		this.a=a;
	}
	public String toString() {
		return ""+a;
		
	}
	
}

public class totostr {
	
	public static void showdata(Object obj){
		System.out.println(obj);
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AA aa =new AA(10);
		System.out.println(aa);
	
	    Integer a1= new Integer(10);
	      
	    showdata(a1);
	    
	

	}

}
