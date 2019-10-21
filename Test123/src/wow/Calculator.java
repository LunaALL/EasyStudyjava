package wow;

public class Calculator {
	private Adder adder;
	private Subtractor subtractor;
	
    public Calculator() {
    	adder= new Adder();
    	subtractor = new Subtractor();
    }
    
    public int addtwonumber (int num1, int num2) {
    	return adder.addTwoNumber(num1, num2);    }

    public int subTwoNumber(int num1, int num2) {
    	return subtractor.subTwoNumber(num1, num2);
 
    }
    
    public void showOperatingTimes() {
    	System.out.println("���� Ƚ�� : " + adder.getCndAdd());
    	System.out.println("��� Ƚ�� : " + subtractor.getCntSub());
    }
}


class Adder {
	
	private int cntAdd;
	
	Adder(){
		cntAdd=0;
	}
	
	int getCndAdd() { return cntAdd;
	
	}
	int addTwoNumber (int num1, int num2){
		cntAdd++;  //���� Ƚ�� ���� 
		return num1 +num2;
		
	}
}

class Subtractor {
	private int cntSub;
	
	Subtractor() { cntSub=0;
	}
	
	int getCntSub() { 
		return cntSub; //���� Ƚ�� 
	}
	
	int subTwoNumber (int num1 , int num2) {
		cntSub++;
		return num1- num2 ;
		
	}
}
