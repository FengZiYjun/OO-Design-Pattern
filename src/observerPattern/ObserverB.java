package observerPattern;


public class ObserverB implements Observer {

private Subject mySubject;
	
	public ObserverB(Subject s) {
		/*
		 *  marvelous !!!
		 */
		this.mySubject = s;
		mySubject.register(this);
	}

	@Override
	public void getNotice(String message) {
		// TODO Auto-generated method stub
		System.out.println("observerB get a message: " + message);
	}

}
