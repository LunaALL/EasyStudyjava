package chp18;

class Business implements Cloneable {
	private String company;
	private String work;
	
	public Business (String company, String work) {
		this.company=company;
		this.work=work;
		
	}
	
	public void showBusinessInfo() {
		System.out.println("회사 : "+ company);
		System.out.println("업무 : "+ work);
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
		System.out.println("이름 :"+ name);
		System.out.println("나이 :" + age);
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
			PersonalInfo woo = new PersonalInfo("김우용", 22,"삼성", "엔지니어");
			PersonalInfo joo =(PersonalInfo)woo.clone();
			joo.changeWork("마케팅");
			
			woo.showPersonalInfo();
			joo.showPersonalInfo();
			
		} catch(CloneNotSupportedException e) {
			e.printStackTrace();
			
			
		}
	}

}
