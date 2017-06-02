package commandPattern;

public class ConcreteCommand implements Command {

	private Receiver receiver = null;
	
	public ConcreteCommand(Receiver r) {
		// TODO Auto-generated constructor stub
		this.receiver = r;
	}

	@Override
	public void execute() {
		// TODO Auto-generated method stub
		System.out.println("executing command ...");
		this.receiver.receive();
	}

}
