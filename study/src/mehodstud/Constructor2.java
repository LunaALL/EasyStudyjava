package mehodstud;

class number {
	int num;
	
	public number(int n) {
		
		num=n;
		System.out.println("���� ���޿Ϸ� : "+n);
	}

	public  int getNumber() {
		
		return num;
	}
	
}

public class Constructor2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        number num1 =new number(10);
        System.out.println("�޼ҵ� ��ȯ ��" + num1.getNumber());
        
        number num2 =new number(20);
        System.out.println("�޼ҵ� ��ȯ ��" + num2.getNumber());
	}

}
