public class CircleCalc{
	public static void main(String[] args){
		final double pi = 3.1416;
		Scanner in = new Scanner(System.in);
		System.out.print("Please radius in meters: ");
		double r = in.nextDouble();
		System.out.println("The area of the circle is "+(pi*r*r));
		System.out.println("The circumference of the circle is "+(2*pi*r));
	}
}