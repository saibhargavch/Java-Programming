import java.util.Scanner;
class Number{
	public static void main (String arg[]){
		Scanner scan = new Scanner (System.in);
		int num1 = 0;
		System.out.println("Enter the number:");
		num1=scan.nextInt();

		if (num1%2==0){
			System.out.println("Even Number");
			}else{
			System.out.println("Odd Number");
		}
	}
}
