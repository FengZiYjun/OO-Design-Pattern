package builderPattern;

public class Clinet {

	public Clinet() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * the user make a specific builder
		 */
		AbstractBuilder builder = new ProductBBuilder();
		/*
		 * put the specific builder into the director
		 */
		Director director = new Director(builder);
		director.construct();
		AbstractProduct product = builder.getResult();
		product.show();
	}
	

}
