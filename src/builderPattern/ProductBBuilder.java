package builderPattern;

public class ProductBBuilder implements AbstractBuilder {

	ProductB pb = new ProductB();
	public ProductBBuilder() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void buildPart1() {
		// TODO Auto-generated method stub
		pb.add("part1");
	}

	@Override
	public void buildPart2() {
		// TODO Auto-generated method stub
		pb.add("part2");
	}

	@Override
	public void buildPart3() {
		// TODO Auto-generated method stub
		pb.add("part3");
	}

	@Override
	public AbstractProduct getResult() {
		// TODO Auto-generated method stub
		return pb;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
