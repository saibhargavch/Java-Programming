
class LogicUnits{
	public static void main (String arg[]){
		int n=99999;
		for (int i=1;i<=n;i++){
			if (i%3==0 || i%2==0 || i%5==0 || i%11==0){
				if(i>=10000){
				System.out.println("i="+i);
				}
			}
		}
	}
}