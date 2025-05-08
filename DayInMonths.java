import java.util.Scanner;
class DaysInMonth{
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the month:");
		int day =scan.nextInt();
		if(day==1 || day==3 || day==5 || day==7 || day==8 || day==10|| day==12){
			System.out.println("Number of days are: 31");
			}else if(day==2){
				System.out.println("28 or 29");
				}else{
					System.out.println("30");
				}
	}

}
	

