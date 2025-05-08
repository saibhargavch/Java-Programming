class SumOfEvenNUmbers{
	public static void main (String arg[]){
		int n=5; int sum =0;
		for(int i=0; i<=n;i++){
			if (i%2==0){
				sum = sum+i;
			}
		}
		System.out.println(sum);
	}
}