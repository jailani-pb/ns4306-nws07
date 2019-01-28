package week01.slot02;

public class Rectangle {
	
	// Instance Variable
	int width;
	int height;
	// Class Variable
	static String colour;
	
	public int calculateArea() {
		// Local Variable
		int area;
		area = width * height;
		return area;
	}
	
	public int calculatePerimeter() {
		return (2*width) + (2*height);
	}
	
	public String showAreaMessage() {
		return "Area of Rectangle: " 
				+ "\nColour: " + colour
				+ "\nWidth: " + width
				+ "\nHeight: " + height
				+ "\nArea: " + calculateArea();
	}
	
	public String showPerimeterMessage() {
		return "Perimeter of Rectangle: " 
				+ "\nColour: " + colour
				+ "\nWidth: " + width
				+ "\nHeight: " + height
				+ "\nPerimeter: " + calculatePerimeter();
	}
}
