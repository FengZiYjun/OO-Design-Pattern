package commandPattern;

public class Invoker{

	private Command cmd;
	
	public Invoker(Command cmd) {
		// TODO Auto-generated constructor stub
		this.cmd = cmd;
	}

	public void action(){
		cmd.execute();
	}
}
