package commandPattern;

public class Client {

	public Client() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Receiver re = new Receiver();
		Command cmd = new ConcreteCommand(re);
		Invoker in = new Invoker(cmd);
		in.action();
	}

}
