package abstractFactoryPattern;

public class clinet {

	public clinet() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractFactory af = new FirstFactory();
		AbstractProductB pb = af.createProductB();
		pb.show();
	}

}
