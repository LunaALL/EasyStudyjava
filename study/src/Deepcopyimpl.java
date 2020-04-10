package chp18;

class Business implements Cloneable {
	private String company;
	private String work;
	
	public Business (String company, String work) {
		this.company=company;
		this.work=work;
		
	}
	
	public void showBusinessInfo() {
		System.out.println("ȸ�� : "+ company);
		System.out.println("���� : "+ work);
	}
	public void changework(String work) {
		this.work=work;
	}
	
	public Object clone() throws CloneNotSupportedException{
	        Business bb=(Business)super.clone();
	        
		return bb;
	}
	
}


class PersonalInfo implements Cloneable {
	private String name;
	private int age;
	private Business bness;
	
	public PersonalInfo (String name, int age, String company, String work) {
		
		this.name= name;
		this.age=age;
		bness=new Business(company, work);
		
	}
	
	public void showPersonalInfo() {
		System.out.println("�̸� :"+ name);
		System.out.println("���� :" + age);
		bness.showBusinessInfo();
		System.out.println("");
	}
	
	public void changeWork( String work) {
		bness.changework(work);
				
	}
	
	public Object clone() throws CloneNotSupportedException {
		PersonalInfo copy =(PersonalInfo)super.clone();
		copy.bness=(Business)bness.clone();
		return copy;
		
		
	}
	
}


public class Deepcopyimpl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			PersonalInfo woo = new PersonalInfo("����", 22,"�Ｚ", "�����Ͼ�");
			PersonalInfo joo =(PersonalInfo)woo.clone();
			joo.changeWork("������");
			
			woo.showPersonalInfo();
			joo.showPersonalInfo();
			
		} catch(CloneNotSupportedException e) {
			e.printStackTrace();
			
			
		}
	}

}
