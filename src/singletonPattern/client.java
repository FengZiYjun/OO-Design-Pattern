package singletonPattern;

public class client {

	public client() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		/*
		 * cannot call constructor, call static method instead. 
		 */
		Singleton p = Singleton.getInstance();
		p.clear();
		Singleton q= Singleton.getInstance();
		System.out.println(p == q);
	}

}
