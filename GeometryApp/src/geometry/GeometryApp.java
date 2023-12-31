package geometry;

import geometry.Circle;
import geometry.Rectangle;
import geometry.Shape;
import geometry.Triangle;

import java.util.ArrayList;

public class GeometryApp {

	public static void main(String[] args) {
		ArrayList<Shape> shapes = new ArrayList<>();

        try {
            shapes.add(new Circle(5.0));
            shapes.add(new Rectangle(4.0, 6.0));
            shapes.add(new Triangle(3.0, 4.0));

            for (Shape shape : shapes) {
                shape.displayArea();
            }
        } catch (Exception e) {
            System.err.println("An error occurred: " + e.getMessage());
        } finally {
            System.out.println("Program execution completed.");
        }

	}

}