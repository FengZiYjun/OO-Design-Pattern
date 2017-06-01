package decoratorPattern;

public class DecoratorA extends AbstractDecorator {

	public DecoratorA(AbstractComponent ac) {
		// TODO Auto-generated constructor stub
		super(ac);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	@Override
	public void action() {
		// TODO Auto-generated method stub
		System.out.println("add decorator A");
	}

}
