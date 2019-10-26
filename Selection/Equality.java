public class Equality{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a number:");
		double firstNumber = in.nextDouble();
		System.out.print("Enter another number:");
		double secondNumber = in.nextDouble();
		if (firstNumber == secondNumber){
			System.out.println("NUMBERS ARE EQUAL");
		}
		else if (firstNumber > secondNumber){
			System.out.println("FIRST NUMBER BIGGER");
		}
		else{
			System.out.println("SECOND NUMBER BIGGER");
		}
	}
}	
	