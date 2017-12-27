package FactoryPatternDemo;

public class FactoryPatternTest {

	public static void main(String[] args) {
		FactoryPatternTest fp = new FactoryPatternTest();
		System.out.println();
		ShapeEx s = fp.getShape("L"); // data is supplied at runtime
		System.out.println();
		System.out.println("Output is created for:" + s.getClass());

	}

	//Factory Pattern Logic 
	public ShapeEx getShape(String shape) {

		if (shape.equals("L"))
			return new Line();
		else if (shape.equals("S"))
			return new Square();
		else
			return null;

	}

}
