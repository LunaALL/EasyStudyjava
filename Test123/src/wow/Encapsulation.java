package wow;

class �๰ {
	public void take() {
		System.out.println("�๰�� �� ���ϴ�.");
	}
}


class ��ä�� {
	public void take() {
		System.out.println("��ä�Ⱑ �� ���ϴ�");
	}
}

class �ڸ��� {
	public void take() {
		System.out.println("�ڸ����� �� ���ϴ�.");
	}
}


class ����600{
	�๰ sin;
	��ä�� sne;
	�ڸ��� snu;
	
	public ����600() { //�����ڷ� �ν��Ͻ��� ������. Ŭ���� ���ο��� ����. ���� ȣ�� x 
		sin = new �๰();
		sne= new ��ä��();
		snu= new �ڸ���();
	}
	
	public void take() {
		sin.take();
		sne.take();
		snu.take();
	}
}




class ColdPatient{
	public void ����600�˾����Դ�(����600 cap) {
		cap.take();
	}
}




public class Encapsulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ColdPatient sufferer = new ColdPatient();
		sufferer.����600�˾����Դ�(new ����600());

	}

}
