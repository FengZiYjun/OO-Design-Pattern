package proxyPattern;

public class Proxy implements Subject {

	private Subject sub;
	
	public Proxy(Subject sub) {
		// TODO Auto-generated constructor stub
		this.sub = sub;
	}

	@Override
	public void action() {
		// TODO Auto-generated method stub
		sub.action();
	}
	
	public void doProxy(){
		System.out.println("proxying...");
		action();
	}

}
