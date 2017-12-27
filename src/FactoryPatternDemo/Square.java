package FactoryPatternDemo;

public class Square extends ShapeEx {

	public Square() {
		System.out.println("You have choosen square to draw");
	}

	@Override
	public void draw() {
		System.out.println("Square:draw()");
	}

}
