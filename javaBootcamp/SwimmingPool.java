package javaBootcamp;

public class SwimmingPool {

	public static void main(String[] args) 
	{
		double depth = 2.5;
		double width = 10.2;
		double length = 30.3;
		double volume = depth*width*length;
		
		System.out.println("A pool of length " + length + "m, depth of " + depth + "m and width of " + width + "m will recquire " + volume + "cubic metres of water to fill it");
		System.out.println("Thats " + (volume * 1000) + " litres of water");
	}

}
