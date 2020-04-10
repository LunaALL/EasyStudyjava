package chp18a;
class Orange {
	int sugarContent;
	public Orange(int sugar) { sugarContent=sugar;}
	public void showSugarContent() {
		System.out.println("당도"+ sugarContent);
	}
}


class Apple {
	int weight;
	public Apple(int weight) { this.weight=weight;}
	public void showweightContent() {
		System.out.println("당도"+ weight);
	}
}

class FruitBox <T>{
	T item;
	public FruitBox (T item) {
		this.item=item;
	}
	public void storeitem(T item) {
		this.item= item;
	}
	
	public T pullout() {
		return item;
	}
	
	
}



public class GenericBaseFruitBox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FruitBox<Orange> or1= new FruitBox<Orange>(new Orange(10));

		Orange org=or1.pullout();
	    org.showSugarContent();
	    
	    FruitBox<Apple> fb1= new FruitBox<Apple>(new Apple(20));
	    Apple ap1= fb1.pullout();
	    ap1.showweightContent();
	      

	}

}
