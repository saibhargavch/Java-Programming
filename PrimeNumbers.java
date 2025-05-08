class PrimeNumbers{
	public static void main(String arg[]){
		int n=7;
		int count=0;
		if (n>=2){
			for (int i =1; i<=n; i++){
				if(n%i==0)
					count = count +1;
			}
			if (count > 2){
				System.out.println("not a Prime Number");
			}else{
				System.out.println("is a prime number");
			}
		}
	}
}