import java.util.Scanner;

public class BMI{
	public static void main(String[] args){
		double bmi;
		Scanner in = new Scanner(System.in);
		System.out.print("Please enter mass in kg: ");
		double kg = in.nextDouble();
		System.out.print("Please enter height in meters: ");
		double height = in.nextDouble();
		bmi = (kg/(height * height));
		System.out.println("Your BMI is: " + bmi);
		if (bmi > 24.9){
			System.out.println("You are overweight");
		}
		else if(mark >= 18.5){
			System.out.println("Congratulations! You are healthy!);
		}
		else{
			System.out.println("I'm sorry, but you are underweight.");
		}
	}
}
