package factoryMethodPattern;

public class ConcreteFactory implements AbstractFactory {

	public ConcreteFactory() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public AbstractProduct puduce() {
		// TODO Auto-generated method stub
		/*
		 * call the constructor of a concrete sub-class HERE
		 */
		return new ConcreteProduct();
	}

	@Override
	public void afterservice() {
		// TODO Auto-generated method stub
		System.out.println("after service");

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
