import java.util.Scanner;
class LeapYear{
	public static void main (String arg[]){
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a Year:");
		int num1=scan.nextInt();

		if ((num1%4==0 && num1%100!=0)||(num1%400==0)){
			System.out.println("Leap Year"); 
		}else {
			System.out.println("Not a Leap Year");
		}
	}
}