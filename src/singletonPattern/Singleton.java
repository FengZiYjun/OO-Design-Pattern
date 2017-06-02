package singletonPattern;

public class Singleton {

	/*
	 *  A private static member variable
	 */
	private static Singleton instance = null;
	
	/*
	 *  A private constructor
	 */
	private Singleton() {
		// TODO Auto-generated constructor stub
	}
	
	public static Singleton getInstance(){
		if(instance == null){
			instance = new Singleton();
		}else{
			System.out.println("already has an instance");
		}
		return instance;
	}
	
	public void clear(){
		System.out.println("cleared!");
	}

}
