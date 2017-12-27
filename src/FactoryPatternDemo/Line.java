package FactoryPatternDemo;

public class Line extends ShapeEx {

	public Line() {
		System.out.println("You have Choosen line to draw");
	}

	@Override
	public void draw() {

		System.out.println("Line:draw()");
	}

}
