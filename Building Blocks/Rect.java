public class Rect{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the height of the rectangle");
		double height = in.nextDouble();
		System.out.println("Enter the width of the rectangle");
		double width = in.nextDouble();
		System.out.println("The Area of the rectangle is " + (height*width));
		System.out.println("The perimeter of the rectangle is " + (2 * (height+width)));
	}
}