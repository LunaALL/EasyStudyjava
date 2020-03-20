package test123;

import java.math.BigDecimal;
import java.util.Scanner;



public class Bigdecimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc =new Scanner(System.in);
		
		BigDecimal a1 = new BigDecimal(sc.nextLine());
		BigDecimal a2 = new BigDecimal(sc.nextLine());
		
		System.out.println( ( a1.subtract(a2)).abs()) ;
		
       
		
	}

}
