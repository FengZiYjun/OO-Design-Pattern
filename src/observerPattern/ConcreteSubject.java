package observerPattern;

import java.util.ArrayList;

public class ConcreteSubject implements Subject {

	private ArrayList<Observer> userList = new ArrayList<Observer>();
	private String message;
	
	public ConcreteSubject() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void register(Observer o) {
		// TODO Auto-generated method stub
		if(!userList.contains(o)){
			userList.add(o);
		}
	}

	@Override
	public void unregister(Observer o) {
		// TODO Auto-generated method stub
		if(userList.contains(o)){
			userList.remove(o);
		}
	}

	@Override
	public void notifyObserver() {
		// TODO Auto-generated method stub
		for(Observer o: userList){
			o.getNotice(message);
		}
	}
	
	public void distributeMessage(String message){
		this.message = message;
		notifyObserver();
	}
}
