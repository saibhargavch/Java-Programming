class DiamondShape{
	public static void main(String[] args) {
		int n=7;
		int i =1;
		int j=0;
		for(i=0;i<=n-2;i++){
			System.out.print("");
			for(int k=0;k<n-1-i;k++){
				System.out.print(" ");
			}
			for(j=0;j<2*i-1;j++){
				System.out.print("*");
			}
			System.out.println();
		}
		for(int r=n-i-1; i>=1;i--){
			for(j=n;j>i;j++){
				System.out.print(" ");
			}
			for(int k=1;k<=2*i-1;k++){
				System.out.print("*");
			}
			System.out.println();
		}
	}
}




