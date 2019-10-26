public class TeamCalc{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		System.out.print("Please enter number of students: ");
		int students = in.nextDouble();
		System.out.print("Please enter size of teams: ");
		int size = in.nextDouble();
		System.out.println("The number of teams is "+(students/size)+" and the number of students without a team is " + (students%size));
	}
}