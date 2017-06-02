package proxyPattern;

public class Client {

	public Client() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		
		Subject sub = new RealSubject();
		/*
		 *  pass the request object to Proxy constructor as a parameter.
		 */
		Proxy proxy = new Proxy(sub);
		proxy.doProxy();
	}

}
