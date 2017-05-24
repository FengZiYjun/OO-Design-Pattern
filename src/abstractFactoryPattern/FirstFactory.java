package abstractFactoryPattern;


public class FirstFactory implements AbstractFactory {

	public FirstFactory() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public ProductA1 createProductA() {
		// TODO Auto-generated method stub
		System.out.println("create 1A");
		return new ProductA1();
	}

	@Override
	public AbstractProductB createProductB() {
		// TODO Auto-generated method stub
		System.out.println("create 1B");
		return new ProductB1();
	}

}
