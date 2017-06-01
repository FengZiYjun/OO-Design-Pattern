package observerPattern;

public class ObserverA implements Observer {

	private Subject mySubject;
	
	public ObserverA(Subject s) {
		/*
		 *  marvelous !!!
		 */
		this.mySubject = s;
		mySubject.register(this);
	}

	@Override
	public void getNotice(String message) {
		// TODO Auto-generated method stub
		System.out.println("observerA get a message: " + message);
	}

}
