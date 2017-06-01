package decoratorPattern;

public class Client {

	public Client() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractComponent ac = new ConcreteComponent();
		ac.action();
		/*
		 *  add a decorator by using a constructor
		 */
		ac = new DecoratorA(ac);
		ac.action();
	}

}
