package weekFourteen;

public class CirclesTest 
{

	public static void main(String[] args) 
	{
		Circles circle = new Circles(5);
		Circles crcle2 = new Circles(10);
		
		System.out.println(circle.area());
		System.out.println(crcle2.area());
		System.out.println("Diff =" + (crcle2.area() - circle.area()));
		
		
		System.out.println();
		
		
		System.out.println(circle.perimeter());
		System.out.println(crcle2.perimeter());
		System.out.println("Diff =" + (crcle2.perimeter() - circle.perimeter()));


	}

}
