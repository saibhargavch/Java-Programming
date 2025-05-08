import java.util.Scanner;
class IfElseLadder{
	public static void main (String arg[]){
		Scanner scan = new Scanner(System.in);
		int num1=0; int num2=0; int sum=0;
		System.out.println("enter 2 numbers:");
		num1 = scan.nextInt();
		num2 = scan.nextInt();

		sum = num1+num2;
		if (sum==0){
			System.out.println("0--> ZERO");
		}else if (sum>0){
			System.out.println("+ve--> Square="+sum*sum);
		}else {
			System.out.println("-ve-->cube="+sum*sum*sum);
		}
	}
}