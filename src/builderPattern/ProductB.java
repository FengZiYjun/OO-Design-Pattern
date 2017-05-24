package builderPattern;

public class ProductB extends AbstractProduct {

	public ProductB() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void add(String str) {
		// TODO Auto-generated method stub
		System.out.println("productB add " + str);

	}
	
	public void show(){
		System.out.println("this is productB.");
	}

}
