public class BMI{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		System.out.print("Please enter mass in kg: ");
		double kg = in.nextDouble();
		System.out.print("Please enter height in meters: ");
		double height = in.nextDouble();
		System.out.println("Your BMI is: "+(kg/(height * height)));
	}
}