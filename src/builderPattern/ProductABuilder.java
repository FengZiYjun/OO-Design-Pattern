package builderPattern;

public class ProductABuilder implements AbstractBuilder {

	ProductA pa = new ProductA();
	public ProductABuilder() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void buildPart1() {
		// TODO Auto-generated method stub
		pa.add("part1");
	}

	@Override
	public void buildPart2() {
		// TODO Auto-generated method stub
		pa.add("part2");
	}

	@Override
	public void buildPart3() {
		// TODO Auto-generated method stub
		pa.add("part3");
	}

	@Override
	public ProductA getResult() {
		// TODO Auto-generated method stub
		return pa;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
