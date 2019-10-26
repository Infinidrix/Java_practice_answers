import java.util.Scanner;

public class DisplayResult{
	public static void main(String[] args){
		int mark;
		Scanner in = new Scanner(System.in);
		System.out.println("What exam mark did you get?");
		mark = in.nextInt();
		if (mark >= 70){
			System.out.println("Congratulations! You passed with distinction");
		}
		else if(mark >= 40){
			System.out.println("Congratulations! You passed!);
		}
		else{
			System.out.println("I'm sorry, but you failed.");
		}
		System.out.println("Good luck with your other exams");
	}
}
