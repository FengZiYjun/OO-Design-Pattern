package factoryMethodPattern;

public abstract class AbstractProduct {

	private String brand;
	
	public AbstractProduct(String str){
		brand = str;
	}
	
	/*
	 * an abstract method
	 */
	abstract public String getID();
	
	/*
	 * a non-abstract method
	 */
	public void getDescription(){
		System.out.println("the brand is "+brand);
	}

}
