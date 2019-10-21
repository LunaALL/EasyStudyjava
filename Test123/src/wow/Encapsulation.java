package wow;

class 콧물 {
	public void take() {
		System.out.println("콧물이 싹 납니다.");
	}
}


class 재채기 {
	public void take() {
		System.out.println("재채기가 싹 납니다");
	}
}

class 코막힘 {
	public void take() {
		System.out.println("코막힘이 싹 납니다.");
	}
}


class 콘택600{
	콧물 sin;
	재채기 sne;
	코막힘 snu;
	
	public 콘택600() { //생성자로 인스턴스를 생성함. 클래스 내부에서 생성. 메인 호출 x 
		sin = new 콧물();
		sne= new 재채기();
		snu= new 코막힘();
	}
	
	public void take() {
		sin.take();
		sne.take();
		snu.take();
	}
}




class ColdPatient{
	public void 콘택600알약을먹다(콘택600 cap) {
		cap.take();
	}
}




public class Encapsulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ColdPatient sufferer = new ColdPatient();
		sufferer.콘택600알약을먹다(new 콘택600());

	}

}
