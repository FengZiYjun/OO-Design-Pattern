package builderPattern;

public interface AbstractBuilder {

	void buildPart1();
	void buildPart2();
	void buildPart3();
	AbstractProduct getResult();
}
