class RangeInPrimeNumbers{
	public static void main(String arg[]){
			int x=1;
			 y =100;
			for(int k=x;k<=y;k++){
			//int PrimeCount=0;
			int count=0;
			if(k==1){
				System.out.print("1 is not prime\n");
				continue;
			}
			if (k>=2){
				for (int i =1; i<=k; i++){
					if(k%i==0)
						count = count+1;
				}
				if (count > 2){
					//System.out.println("not a Prime Number");
				}else{
					System.out.println(k);
					//PrimeCount++;

				}
			}
		}
		//System.out.println(PrimeCount);
	}
}