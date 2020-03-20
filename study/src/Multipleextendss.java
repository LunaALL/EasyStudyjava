package test123;

interface TV {
	public void onTV();
}

interface Computer {
	public void dataReceive();
}

class ComputerImpl {
	public void dataRecive () {
		System.out.println("영상 데이터 수신중");
	}
	
}

class TVImpl {
	public void onTV () {
		System.out.println("영상 출력중");
	}
}

class IPTV implements TV,Computer {
	ComputerImpl CP = new ComputerImpl();
	TVImpl tv= new TVImpl();
	
	@Override
	public void dataReceive() {
		// TODO Auto-generated method stub
		CP.dataRecive();
		
	}

	@Override
	public void onTV() {
		// TODO Auto-generated method stub
		tv.onTV();
		
	}
	

	public void PowerOn () {
		dataReceive();
		onTV();
	}
}



public class Multipleextendss {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IPTV iptv1= new IPTV();
		
		iptv1.PowerOn();
		
		TV tv=iptv1;
		Computer cp = iptv1;
		
		

	}

}
