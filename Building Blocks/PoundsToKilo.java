public class PoundsToKilo{
	public static void main(String[] args){
		final double conversionRate = 2.2;
		Scanner in = new Scanner(System.in);
		System.out.print("Please enter mass in pounds: ");
		double pounds = in.nextDouble();
		System.out.println("The mass in kilograms is: "+(pounds/conversionRate));
	}
}