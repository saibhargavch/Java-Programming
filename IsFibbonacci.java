public class IsFib{
	public static void main(String arg[]){
		int n=3;
		if(IsFibbonacci(n)){
			System.out.println("yes");
		}else{
			System.out.println("no");
		}
	}
	public static void IsFibbonacci(){
				int a= 0;
				int b= 1;
				int c;
				int n=10;
				System.out.println(a);
				System.out.println(b);
				for(int i=1;i<n-1;i++){
					c=a+b;
					System.out.println(c);
					a=b;
					b=c;
				}
	}
}