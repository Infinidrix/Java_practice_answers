import java.util.Scanner;

public class OrderPC{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		double basicSystem = 375.99;
		double screen38 = 75.99;
		double screen43 = 99.99;
		double antivirus = 65.99;
		double printer = 125.0;
		double sum = basicSystem;
		
		System.out.println("Welcome to the computer options menu!);
		System.out.println("Would you like your computer to come with a:\n\t1: 38 cm screen\n\t2: 43 cm screen");
		int choice = in.nextInt();
		switch (choice){
			case 1:
				sum += screen38;
				break;
			case 2:
				sum += screen43;
		}
		System.out.println("Would you like your computer to come with:\n\t1: Antivirus software\n\t2: Printer\n\t3: Both\n\t4: None");
		int choice = in.nextInt();
		switch (choice){
			case 1:
				sum += antivirus;
				break;
			case 2:
				sum += printer;
				break;
			case 3:
				sum += printer + antivirus;
		}
		System.out.printf("The total price is %f", sum);
	}
}
		