package builderPattern;

public class Director {

	private AbstractBuilder ab;
	public Director(AbstractBuilder builder) {
		// TODO Auto-generated constructor stub
		ab = builder;
	}
	
	public void construct(){
		ab.buildPart2();
		ab.buildPart3();
		ab.buildPart1();
		ab.getResult();
	}

}
