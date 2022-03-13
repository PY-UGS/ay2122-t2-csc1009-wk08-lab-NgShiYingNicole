import java.lang.Math;
import java.util.Scanner;

public class CircleWithException {

	private double radius;
		
	public CircleWithException(double radius) throws IllegalArgumentException, Exception{
		validationValue(radius);
		this.radius = radius;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) throws IllegalArgumentException, Exception{
		validationValue(radius);
		this.radius = radius;
	}
	
	public double getArea() {
		return Math.PI*this.radius*this.radius;
	}
	public double getDiameter() {
		return Math.PI*2*this.radius;
	}

	public static void validationValue(double radius) throws Exception, IllegalArgumentException {
        if (radius < 0) {
        	// TODO If the radius is not a positive number, an "IllegalArgumentException" should be thrown
        	throw new IllegalArgumentException("radius is negative");        	
        }
        else if (radius > Math.sqrt(1000.0 / Math.PI)) {
        	// TODO If the area is bigger than 1000, a general exception “Exception” should be thrown
        	throw new Exception("radius with area more than 1000 is not allowed");
        }
    }

	public static void main(String[] args) {
		//In the main function: conduct the exception handling
		try
        {
            Scanner input = new Scanner(System.in);
            System.out.println("Enter radius of circle : ");
            double radius = input.nextDouble();
            CircleWithException circle = new CircleWithException(radius);//test constructor
            System.out.println("Radius of circle: "+ circle.getRadius());
            System.out.println("Area of circle: "+circle.getArea());
            System.out.println("Diameter of circle: "+circle.getDiameter());
            
            System.out.println("Amend radius of circle: "); //test setRadius
            radius = input.nextDouble();
            circle.setRadius(radius);
            System.out.println("Radius of circle: "+ circle.getRadius());
            System.out.println("Area of circle: "+circle.getArea());
            System.out.println("Diameter of circle: "+circle.getDiameter());
        }
        catch ( Exception e)
        {
            System.out.println("Caught: " + e);
        }
	}
}

