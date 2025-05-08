import java.util.Scanner;
class MultiplicationOfValues{
	public static void main (String arg[]){
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number:");
		int n=scan.nextInt();
		for(int i=1; i<=20;i++){
				System.out.println(n+"*"+i+"="+n*i);
		}
	}
}