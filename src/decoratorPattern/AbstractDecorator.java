package decoratorPattern;

public abstract class AbstractDecorator extends AbstractComponent {

	AbstractComponent mycomponent;
	
	public AbstractDecorator(AbstractComponent ac) {
		// TODO Auto-generated constructor stub
		mycomponent = ac;
	}

	@Override
	public abstract void action();

}
