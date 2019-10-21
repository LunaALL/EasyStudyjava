package WWW;
import wow.Calculator;

public class CalculatorMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator cal = new Calculator();
		System.out.println("1+2= " + cal.addtwonumber(1, 2));
		System.out.println("5-1= " + cal.subTwoNumber(5, 1));
		cal.showOperatingTimes();
		

	}

}
