import java.util.Scanner;

public class FindCost3{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		double price, tax;
		System.out.println("*** Product Price Check ***");
		System.out.print("Enter initial price: ");
		price = in.nextDouble();
		System.out.print("Enter tax rate: ");
		tax = in.nextDouble();
		price = price * (1 + tax/100);
		System.out.println("Cost after tax = " + price);
	}
}