package abstractFactoryPattern;

public class SecondFactory implements AbstractFactory {

	public SecondFactory() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public AbstractProductA createProductA() {
		// TODO Auto-generated method stub
		return new ProductA2();
	}

	@Override
	public AbstractProductB createProductB() {
		// TODO Auto-generated method stub
		return new ProductB2();
	}

}
