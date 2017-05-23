package factoryMethodPattern;

public class Test {

	public Test() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * a concrete object is assigned to an abstract class variable
		 */
		AbstractFactory af = new ConcreteFactory();
		AbstractProduct ap = af.puduce();
		ap.getDescription();
		//ap.getID();
		af.afterservice();
	}

}
