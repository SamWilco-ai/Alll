package weekFourteen;

public class Circles 
{
	private double radius;
	
	public Circles(int reqRadius)
	{
		radius = reqRadius;
	}
	
	public double area()
	{
		return Math.PI*(radius*radius);
	}
	
	public double perimeter()
	{
		return 2*Math.PI*radius;
	}

}
