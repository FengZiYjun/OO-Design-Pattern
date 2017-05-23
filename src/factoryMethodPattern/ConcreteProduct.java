package factoryMethodPattern;

public class ConcreteProduct extends AbstractProduct {
	
	private static final String brand = "myBrand";
	protected static int ID;
	
	public ConcreteProduct(){
		super(brand);
		// TODO Auto-generated constructor stub
		ID = 100;
	}

	@Override
	public String getID() {
		// TODO Auto-generated method stub
		return "Concrete product returns "+ brand;
	}
	
	public static void main(String args[]){
		ConcreteProduct p = new ConcreteProduct();
		/*
		 * there are two brands: 
		 * one from inheritance that is initialized by the constructor of the sub-class 
		 * the other is a private one of sub-class
		 * and now I make them the same by modifying the constructor
		 */
		System.out.println(p.getID());
		p.getDescription();
	}
}
