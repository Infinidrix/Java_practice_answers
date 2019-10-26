public class SumGuesser{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a number: ");
		double firstNumber = in.nextDouble();
		System.out.print("Enter another number: ");
		double secondNumber = in.nextDouble();
		System.out.print("Enter the sum of the two numbers: ");
		double sum = in.nextDouble();
		if (sum == firstNumber + secondNumber){
			System.out.println("Congrations!!! Your answer is right!");
		}
		else{
			System.out.println("Sadly the actual sum is " + (firstNumber + secondNumber));
		}
	}
}	
	