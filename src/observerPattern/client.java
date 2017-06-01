package observerPattern;

public class client {

	public client() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConcreteSubject cs = new ConcreteSubject();
		ObserverA oa = new ObserverA(cs);
		ObserverB ob = new ObserverB(cs);
		cs.distributeMessage("welcome!");
	}

}
